package com.web.guihe.Util.Token;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.web.guihe.Service.ServiceGhRole;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 *
 * 验证token权限
 *
 */
public class TokenIntercepter implements HandlerInterceptor {

    @Autowired
    private ServiceGhRole serviceGhRole;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从http请求头中取出token
        String token = request.getHeader("token");
        //如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注解，有则跳过认证
        if(method.isAnnotationPresent(UserPassToken.class)){
            UserPassToken passToken = method.getAnnotation(UserPassToken.class);
            if(passToken.required()){
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if(method.isAnnotationPresent(UserLoginToken.class)){
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if(userLoginToken.required()){
                //执行认证
                if(token == null){
                    throw new RuntimeException("未登录");
                }
                //获取token中的u_id
                Integer uId;
                try{
                    uId = Integer.parseInt(JWT.decode(token).getAudience().get(0));
                }catch (JWTDecodeException j){
                    throw new RuntimeException("401!");
                }
                GhRole ghRole = serviceGhRole.findUserByuId(uId);
                if(ghRole == null){
                    throw new RuntimeException("401");
                }
                //验证token
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(ghRole.getuPass())).build();
                try {
                    jwtVerifier.verify(token);
                }catch (JWTVerificationException i){
                    if(ghRole.getuNum() > 0){
                        ghRole.setuNum(ghRole.getuNum() - 1);
                        ghRole.setuSalt(" ");
                    }
                    serviceGhRole.updateByPrimaryKeySelective(ghRole);
                    throw new BusinessRuntimeException(ExceptionCode.TOKEN_ERROR);
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
