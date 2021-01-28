package cn.com.ho.workflow.exception;

import cn.com.ho.workflow.exception.sub.SubException;

import java.util.Set;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 3438322119670695654L;

    public String code;

    public String message;

    public String solution;

    public Set<SubException> subExceptions;

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public BaseException(Set<SubException> subExceptions) {
        this.subExceptions = subExceptions;
    }

    public BaseException(String code, Set<SubException> subExceptions) {
        this.code = code;
        this.subExceptions = subExceptions;
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(String code, String message, Set<SubException> subExceptions) {
        super(message);
        this.code = code;
        this.message = message;
        this.subExceptions = subExceptions;
    }

    public BaseException(String code, String message, String solution) {
        super(message);
        this.code = code;
        this.message = message;
        this.solution = solution;
    }

    public BaseException(String code, String message, String solution, Set<SubException> subExceptions) {
        super(message);
        this.code = code;
        this.message = message;
        this.solution = solution;
        this.subExceptions = subExceptions;
    }

    public BaseException(Throwable cause) {
        super(cause);
        if (cause instanceof BaseException) {
            BaseException e = (BaseException) cause;
            this.code = e.code;
            this.message = e.message;
            this.solution = e.solution;
            this.subExceptions = e.subExceptions;
        }

    }

    public BaseException(Throwable cause, Set<SubException> subExceptions) {
        super(cause);
        if (cause instanceof BaseException) {
            BaseException e = (BaseException) cause;
            this.code = e.code;
            this.message = e.message;
            this.solution = e.solution;
            this.subExceptions = subExceptions;
        }

    }

    public BaseException(Throwable cause, String code, Set<SubException> subExceptions) {
        super(cause);
        this.code = code;
        this.subExceptions = subExceptions;
    }

    public BaseException(Throwable cause, String code, String message, Set<SubException> subExceptions) {
        this(cause, subExceptions);
        this.code = code;
        this.message = message;
    }

    public BaseException(Throwable cause, String code, String message, String solution, Set<SubException> subExceptions) {
        this(cause, subExceptions);
        this.code = code;
        this.message = message;
        this.solution = solution;
    }
}

