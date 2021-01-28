package cn.com.ho.workflow.util;

/**
 * tweeter的snowflake 移植到Java:
 * (a) id构成: 42位的时间前缀 + 10位的节点标识 + 12位的sequence避免并发的数字(12位不够用时强制得到新的时间前缀)
 * 注意这里进行了小改动: snowflake是5位的dataCenter加5位的机器id; 这里变成使用10位的机器id
 * (b) 对系统时间的依赖性非常强，需关闭ntp的时间同步功能。当检测到ntp时间调整后，将会拒绝分配id
 */
public class IdWorker {

    private final long workerId;
    private final long workerIdBits = 10L;      // 机器标识位数
    private long sequence = 0L;                   // 0，并发控制

    private long lastTimestamp = -1L;

    private IdWorker(long workerId) {
        // 机器ID最大值: 1023
        long maxWorkerId = ~(-1L << this.workerIdBits);
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        this.workerId = workerId;
    }

    public synchronized String nextIdStr() {
        try {
            return "" + this.nextId();
        } catch (Exception e) {
            e.printStackTrace();
            return UUIDGenerator.generate();
        }
    }

    public synchronized long nextId() throws Exception {
        long timestamp = timeGen();
        //  毫秒内自增位
        long sequenceBits = 12L;
        if (this.lastTimestamp == timestamp) { // 如果上一个timestamp与新产生的相等,则sequence加一(0-4095循环);对新的timestamp,sequence从0开始
            // 4095,111111111111,12位
            long sequenceMask = ~(-1L << sequenceBits);
            this.sequence = this.sequence + 1 & sequenceMask;
            if (this.sequence == 0) {
                timestamp = this.tilNextMillis(this.lastTimestamp);// 重新生成timestamp
            }
        } else {
            this.sequence = 0;
        }

        if (timestamp < this.lastTimestamp) {
            throw new Exception(String.format("clock moved backwards.Refusing to generate id for %d milliseconds", (this.lastTimestamp - timestamp)));
        }

        this.lastTimestamp = timestamp;
        // 22
        long timestampLeftShift = sequenceBits + this.workerIdBits;
        // 12
        // 时间起始标记点，作为基准，一般取系统的最近时间
        long epoch = 1403854494756L;
        return timestamp - epoch << timestampLeftShift | this.workerId << sequenceBits | this.sequence;
    }

    private static IdWorker flowIdWorker = new IdWorker(1);

    public static IdWorker getFlowIdWorkerInstance() {
        return flowIdWorker;
    }


    /**
     * 等待下一个毫秒的到来, 保证返回的毫秒数在参数lastTimestamp之后
     */
    private long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    /**
     * 获得系统当前毫秒数
     */
    private static long timeGen() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(IdWorker.getFlowIdWorkerInstance().nextId());
    }
}