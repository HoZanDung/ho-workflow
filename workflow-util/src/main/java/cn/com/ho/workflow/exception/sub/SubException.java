package cn.com.ho.workflow.exception.sub;

public class SubException extends RuntimeException {
    private static final long serialVersionUID = 2548627170033598649L;

    public String code;

    public String message;

    public String solution;

    public Object[] messageParameters;

    public Object[] solutionParameters;

    public SubException() {
    }

    public SubException(String message) {
        super(message);
    }

    public SubException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public SubException(Object[] messageParameters) {
        this.messageParameters = messageParameters;
    }

    public SubException(Object[] messageParameters, Object[] solutionParameters) {
        this.messageParameters = messageParameters;
        this.solutionParameters = solutionParameters;
    }

    public SubException(String code, Object[] messageParameters) {
        this.code = code;
        this.messageParameters = messageParameters;
    }

    public SubException(String code, Object[] messageParameters, Object[] solutionParameters) {
        this.code = code;
        this.messageParameters = messageParameters;
        this.solutionParameters = solutionParameters;
    }

    public SubException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public SubException(String code, String message, String solution) {
        super(message);
        this.code = code;
        this.message = message;
        this.solution = solution;
    }

    public SubException(Throwable cause) {
        super(cause);
    }
}

