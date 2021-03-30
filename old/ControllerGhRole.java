package com.web.guihe.Controller;

import com.web.guihe.Service.ServiceGhRole;
import com.web.guihe.Util.Redis.RedisUtil;
import com.web.guihe.Util.ReturnResult;
import com.web.guihe.Util.Token.UserPassToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class ControllerGhRole {

    @Autowired
    private ServiceGhRole serviceGhRole;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 用户登录
     * @param ghRole
     * @return
     */
    @UserPassToken
    @PostMapping("/login")
    public ReturnResult roleLogin(GhRole ghRole){
        return serviceGhRole.roleLogin(ghRole);
    }

    @GetMapping("/test")
    public ReturnResult test(GhRole ghRole){
        ReturnResult returnResult = new ReturnResult();
        returnResult.custom(1,redisUtil.getCacheObject("token"));
        return returnResult;
    }

}
