package com.web.guihe.Util.Token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenBean {

    //token过期时间
    private static final int EXPSECOND = 1*60*1000; //有效时间1小时

    //创建token
    public String getToken(GhRole ghRole){
        String token = "";
        token = JWT.create().withExpiresAt(new Date(System.currentTimeMillis()
                + EXPSECOND)).withAudience(String.valueOf(ghRole.getuId())).
                sign(Algorithm.HMAC256(ghRole.getuPass()));
        return token;
    }
}
