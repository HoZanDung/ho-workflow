package cn.com.xdeas.common;

import cn.com.ho.workflow.exception.BaseException;
import cn.com.ho.workflow.util.IResponse;
import com.alibaba.fastjson.JSONObject;

import javax.validation.ValidationException;
import java.util.UUID;

public class Response<T> implements IResponse {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述信息
     */
    private String msg;

    private T data;

    private String requestId = UUID.randomUUID().toString();

    /**
     * 无参构造函数，默认为成功
     */
    public Response() {
        this.code = CodeEnum.SUCCESS.code;
    }

    public Response(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }


    /**
     * 接收异常信息和输入参数的构造方法,推荐使用
     *
     * @param throwable
     * @param requestParameters 方法的入参,这是个可变参数,支持输入多个入参数
     */
    public Response(Throwable throwable, Object... requestParameters) {
        Response<T> response = buildExceptionResponse(throwable, requestParameters);
        this.code = response.getCode();
        this.msg = response.getMsg();
        this.data = response.getData();
    }

    /**
     * 接收异常信息的构造方法,该构造方法不再推荐
     */
    @Deprecated
    public Response(Throwable throwable) {
        this(throwable, new Object[]{});
    }

    /**
     * 接收BaseException的构造方法
     *
     * @param baseException
     */
    public Response(BaseException baseException) {
        this.code = baseException.code;
        this.msg = baseException.message;
    }


    /**
     * 接收异常信息和异常码的构造方法
     *
     * @param throwable
     * @param code
     */
    public Response(Throwable throwable, String code) {
        this.code = code;
        this.msg = throwable.getMessage();
    }

    /**
     * @param data
     */
    public Response(T data) {
        this.code = CodeEnum.SUCCESS.code;
        this.data = data;
    }

    /**
     * @param data
     */
    public Response(T data, String msg) {
        this.code = CodeEnum.SUCCESS.code;
        this.msg = msg;
        this.data = data;
    }


    public Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }


    public Response(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 构建成功响应
     *
     * @return
     */
    public static <T> Response<T> buildSuccessResponse() {
        return new Response();
    }

    /**
     * 构建成功响应
     *
     * @param data 响应数据
     * @param msg  响应消息
     * @return
     */
    public static <T> Response<T> buildSuccessResponse(T data, String msg) {
        return new Response(data, msg);
    }

    /**
     * 构建成功响应
     *
     * @param data 响应数据
     * @return
     */
    public static <T> Response<T> buildSuccessResponse(T data) {
        return new Response(data, null);
    }

    /**
     * 构建错误响应
     *
     * @param throwable         异常
     * @param requestParameters 请求参数数组
     * @return
     */
    public static <T> Response<T> buildExceptionResponse(Throwable throwable, Object... requestParameters) {
        Response response = new Response();

        if (throwable instanceof ValidationException || throwable instanceof IllegalArgumentException) {
            response.code = CodeEnum.PARAM_INVALID.code;
            response.msg = throwable.getMessage();
        } else {
            if (throwable instanceof BaseException) {
                BaseException baseException = (BaseException) throwable;
                response.code = null == baseException.code ? "00" : baseException.code;
                response.msg = baseException.message;
            } else {
                response.code = CodeEnum.UNKNOWN.code;
                response.msg = CodeEnum.UNKNOWN.msg;
            }
        }


        return response;
    }

    /**
     * 构建异常响应
     *
     * @param code 异常编码
     * @param msg  异常信息
     * @return
     */
    public static <T> Response<T> buildExceptionResponse(String code, String msg) {
        return new Response(code, msg);
    }

    public static <T> Response<T> buildExceptionResponse(String code, String msg, T data) {
        return new Response(code, msg, data);
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param businessResult the data to set
     */
    public void setData(T businessResult) {
        this.data = businessResult;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 处理是否成功
     *
     * @return
     */
    @Override
    public boolean isSuccess() {
        if (code != null) {
            return CodeEnum.SUCCESS.code.equals(code);
        }
        return false;
    }

    /**
     * 编码枚举
     */
    public enum CodeEnum {
        SUCCESS("0", "Success"),
        FAIL("500", "fail"),

        PARAM("10", "参数错误"),
        PARAM_MISS("11", "参数缺失"),
        PARAM_INVALID("12", "参数不合法"),
        PARAM_INVALID_FORMAT("13", "参数格式错误"),
        PARAM_INVALID_OUT_OF_RANGE("14", "参数越界"),

        AUTH("21", "身份认证失败"),
        AUTH_SIGN("22", "签名验证失败"),
        AUTHOR("23", "权限认证失败"),

        UNKNOWN("99", "Network Busy,Please Try Again Later");

        public String code;
        public String msg;

        CodeEnum(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
