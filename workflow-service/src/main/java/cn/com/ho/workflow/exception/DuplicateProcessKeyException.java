package cn.com.ho.workflow.exception;

/**
 * 保存模型重复流程key异常
 * Created by HOZANDUNG on 2020/11/30
 */
public class DuplicateProcessKeyException extends BaseException {

    public DuplicateProcessKeyException() {
    }

    public DuplicateProcessKeyException(String message) {
        super(message);
        this.code = "400";
    }

    public DuplicateProcessKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateProcessKeyException(Throwable cause) {
        super(cause);
    }
}
