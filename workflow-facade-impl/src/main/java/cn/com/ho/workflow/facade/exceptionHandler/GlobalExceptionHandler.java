package cn.com.ho.workflow.facade.exceptionHandler;

import cn.com.ho.workflow.exception.DuplicateProcessKeyException;
import cn.com.ho.workflow.exception.ProcessPretreatmentException;
import cn.com.xdeas.common.Response;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response<String> handleReadMessageException(Exception e) {
        return Response.buildExceptionResponse(e);
    }

    /**
     * Post方法的Validated
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Response<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String message = "";
        BindingResult bindingResult = e.getBindingResult();
        if (bindingResult.hasErrors()) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            ObjectError objectError = allErrors.get(0);
            message = objectError.getDefaultMessage();
        }
        return Response.buildExceptionResponse("400", message);
    }

    /**
     * Get方法的Validated
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public Response<String> handleConstraintViolationException(ConstraintViolationException e) {
        String message = e.getMessage();
        return Response.buildExceptionResponse("400", message);
    }

    /**
     * Get方法参数不存在Validate前的Servlet异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public Response<String> handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        String message = e.getMessage();
        return Response.buildExceptionResponse("400", message);
    }

    /**
     * Get方法参数不存在Validate前的Servlet异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MissingRequestHeaderException.class)
    @ResponseBody
    public Response<String> handleMissingRequestHeaderException(MissingRequestHeaderException e) {
        String message = e.getMessage();
        return Response.buildExceptionResponse("400", message);
    }

    /**
     * 流程模型预处理异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ProcessPretreatmentException.class)
    @ResponseBody
    public Response<String> handleProcessPretreatmentException(ProcessPretreatmentException e) {
        String message = e.getMessage();
        return Response.buildExceptionResponse("400", message);
    }

    /**
     * 保存模型重复流程key异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(DuplicateProcessKeyException.class)
    @ResponseBody
    public Response<String> handleDuplicateProcessKeyException(DuplicateProcessKeyException e) {
        String message = e.getMessage();
        return Response.buildExceptionResponse("400", message);
    }
}
