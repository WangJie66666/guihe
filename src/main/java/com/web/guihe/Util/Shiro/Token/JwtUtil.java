package com.web.guihe.Util.Shiro.Token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.web.guihe.Entity.GhUser;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class JwtUtil {

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    //token过期时间
    private static final int EXPSECOND = 60*60*1000; //有效时间1小时

    //创建token令牌
    public static String sign(GhUser ghUser) {
        String token = "";
        token = JWT.create().withExpiresAt(new Date(System.currentTimeMillis()
                + EXPSECOND)).withAudience(String.valueOf(ghUser.getuId())).
                sign(Algorithm.HMAC256(ghUser.getuPass()));
        return token;
    }

    // 获得token中的uId
    public static Integer getUserId(String token) {
        Integer uId;
        try {
            uId = Integer.parseInt(JWT.decode(token).getAudience().get(0));
            return uId;
        } catch (JWTVerificationException e) {
            throw new BusinessRuntimeException(ExceptionCode.TOKEN_ERROR);
        }
    }

    //验证token令牌
    public boolean verify(String token,GhUser ghUser){
        try {
            //GhUser ghUser = ghUserService.selectByPrimaryKey(Integer.parseInt(JWT.decode(token).getAudience().get(0)));
            if(ghUser == null) throw new BusinessRuntimeException(ExceptionCode.TOKEN_ERROR);
            //验证token
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(ghUser.getuPass())).build();
            jwtVerifier.verify(token);
        } catch (JWTVerificationException exception) {
            LOG.info(exception.getMessage());
            return false;
        }
        return true;
    }

}
