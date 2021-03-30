package com.web.guihe.Util.Exception;

/**
 * 业务异常
 */
public class BusinessRuntimeException extends RuntimeException{

    private Integer code;

    private String msg;

    private ExceptionCode exceptionCode;

    public BusinessRuntimeException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMsg());
        this.code = exceptionCode.getCode();
        this.msg = exceptionCode.getMsg();
        this.exceptionCode = exceptionCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ExceptionCode getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
}
