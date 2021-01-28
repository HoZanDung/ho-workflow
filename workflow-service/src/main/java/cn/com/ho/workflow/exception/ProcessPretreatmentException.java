package cn.com.ho.workflow.exception;

/**
 * 流程模型预处理异常
 * Created by HOZANDUNG on 2020/11/30
 */
public class ProcessPretreatmentException extends BaseException {

    public ProcessPretreatmentException() {
    }

    public ProcessPretreatmentException(String message) {
        super(message);
        this.code = "400";
    }

    public ProcessPretreatmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessPretreatmentException(Throwable cause) {
        super(cause);
    }
}
