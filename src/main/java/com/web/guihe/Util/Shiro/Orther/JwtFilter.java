package com.web.guihe.Util.Shiro.Orther;

import com.alibaba.fastjson.JSONObject;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import com.web.guihe.Util.Shiro.Token.JwtToken;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class JwtFilter extends BasicHttpAuthenticationFilter{

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    /**
     * 执行登录认证
     * @param request ServletRequest
     * @param response ServletResponse
     * @param mappedValue mappedValue
     * @return 是否成功
     */
    //这个方法叫做  尝试进行登录的操作,如果token存在,那么进行提交登录,如果不存在说明可能是正在进行登录或者做其它的事情 直接放过即可
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        boolean type;
        try {
            executeLogin(request, response);
            return true;
        } catch (Exception e) {
        LOG.error("JwtFilter过滤验证失败!"+e.getMessage());
        try {
            //将验证的错误信息返回给前端
            response.setContentType("application/json; charset=utf-8");
            if(e.getMessage().equals(ExceptionCode.TOKEN_ERROR.getMsg())){
                response.getWriter().print(JSONObject.toJSON(returnResult.tokenRealm(ExceptionCode.TOKEN_ERROR)));
            }else if(e.getMessage().equals(ExceptionCode.LOGIN_NO_ERROR.getMsg())){
                response.getWriter().print(JSONObject.toJSON(returnResult.tokenRealm(ExceptionCode.LOGIN_NO_ERROR)));
            }else{
                return false;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
            return false;
        }
    }
    /**
     * 执行登录
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws AuthenticationException {
        LOG.info("进入JwtFilter类中...");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String token = httpServletRequest.getHeader("token");
        LOG.info("获取到的token是:{}",token);
        // 判断token是否存在
        if (token == null) {
            token = "LOGIN_NO_ERROR";
        }
        JwtToken jwtToken = new JwtToken(token);
        LOG.info("提交UserModularRealmAuthenticator决定由哪个realm执行操作...");
        getSubject(request, response).login(jwtToken);
        return true;
    }



    /**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }
}
