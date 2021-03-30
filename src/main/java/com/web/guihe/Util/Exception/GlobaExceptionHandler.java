package com.web.guihe.Util.Exception;

import com.web.guihe.Util.BasicUtil.ReturnResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常捕捉
 */
@Slf4j
@ControllerAdvice
public class GlobaExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @Autowired
    private ReturnResult returnResult = new ReturnResult();


    /**
     * 处理所有BusinessRuntimeException类业务异常
     *
     * @param businessRuntimeException 业务异常
     * @return json结果
     */
    @ExceptionHandler(BusinessRuntimeException.class)
    @ResponseBody
    public ReturnResult handleOpdRuntimeException(BusinessRuntimeException businessRuntimeException) {
        // 打印异常堆栈信息
        LOG.error(businessRuntimeException.getMsg());
        returnResult.tokenError(businessRuntimeException.getExceptionCode());
        return returnResult;
    }

    @ExceptionHandler(AuthorizationException.class)
    @ResponseBody
    public ReturnResult ErrorHandler(AuthorizationException e) {
        LOG.error("权限校验失败：", e);
        returnResult.tokenError(ExceptionCode.ROLE_NO_ERROR);
        return  returnResult;
    }
}
