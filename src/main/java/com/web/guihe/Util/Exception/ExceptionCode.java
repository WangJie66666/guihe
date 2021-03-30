package com.web.guihe.Util.Exception;

/**
 * 异常错误码
 */
public enum  ExceptionCode {

    //401
    FOUR_ONE_ERROR(401,"未知错误!"),

    //token登陆凭证过期
    TOKEN_ERROR(450, "登陆凭证过期!"),

    //用户账号不存在
    USERS_USER_ERROR(451,"用户账号不存在!"),

    //密码错误1次
    USER_PASSWORD_ERROR_ONE(452,"您输入的密码有误，请重新输入!密码错误次数:1,再输错2次密码,账号将被锁定!"),

    //密码错误2次
    USER_PASSWORD_ERROR_TWO(453,"您输入的密码有误，请重新输入!密码错误次数:2,再输错1次密码,账号将被锁定!"),

    //账号锁定
    USER_PASSWORD_ERROR_THREE(454,"您密码已累计输错3次,账号已被锁定,请联系管理员解锁!"),

    //账号达到最大登录次数
    USER_MORE_REMIND(455,"该账号已在3处地方登陆,达到了最大登陆限制,请耐心等待其他用户退出!"),

    //未登录
    LOGIN_NO_ERROR(456,"您还未登录,请登录!"),

    //无权限
    ROLE_NO_ERROR(457,"您没有权限访问!");


    private Integer code;

    private String msg;

    ExceptionCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
