package com.web.guihe.Util.Shiro.Token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * 自定义token令牌
 */
public class CustomizedToken extends UsernamePasswordToken {

    /**
     * 登录类型
     */
    public String loginType;

    public CustomizedToken(final String username,final String password,final String loginType){
        super(username,password);
        this.loginType = loginType;
    }

    @Override
    public String toString(){
        return "loginType="+ loginType +",username=" + super.getUsername()+",password="+ String.valueOf(super.getPassword());
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }
}
