package com.web.guihe.Util.BasicUtil;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 密码校验
 */
public class PassCommon {

    /**
     * 根据uUser,使用MD5加密
     * @param  uUser,uPass
     * @return 返回加密后的密码
     */
    public static String encryptPassword(String uUser,String uPass){
        return String.valueOf(new SimpleHash("MD5",uPass,uUser,1024));
    }
}
