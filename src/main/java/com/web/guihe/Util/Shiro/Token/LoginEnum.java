package com.web.guihe.Util.Shiro.Token;

/**
 * 登录类型枚举
 */
public enum  LoginEnum {

    BY_PASSWORD("Password");

    public String getLoginType() {
        return loginType;
    }

    private String loginType;

    LoginEnum(String loginType) {
        this.loginType = loginType;
    }
}
