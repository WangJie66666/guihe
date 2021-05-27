package com.web.guihe.Util.Shiro.Realm;

import com.web.guihe.Entity.GhUser;
import com.web.guihe.Mapper.GhUserMapper;
import com.web.guihe.Util.BasicUtil.PassCommon;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import com.web.guihe.Util.Shiro.Token.CustomizedToken;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class RealmPassword extends AuthorizingRealm {

    @Autowired
    private GhUserMapper ghUserMapper;

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof CustomizedToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        LOG.info("RealmPassword权限认证开始,传递的token:{}",authenticationToken);
        CustomizedToken token = (CustomizedToken) authenticationToken;
        LOG.info("RealmPassword转换的自定义token是:{}",token);
        GhUser user = ghUserMapper.findUserByuUser(token.getUsername());
        if(user == null) throw new BusinessRuntimeException(ExceptionCode.USERS_USER_ERROR);
        Object credentials =  PassCommon.encryptPassword(token.getUsername(),String.valueOf(token.getPassword()));
        if(!credentials.equals(user.getuPass())){
            if(user.getuErr() == 0){
                user.setuErr(1);
                ghUserMapper.updateByPrimaryKey(user);
                throw new BusinessRuntimeException(ExceptionCode.USER_PASSWORD_ERROR_ONE);
            }else if(user.getuErr() == 1){
                user.setuErr(2);
                ghUserMapper.updateByPrimaryKey(user);
                throw new BusinessRuntimeException(ExceptionCode.USER_PASSWORD_ERROR_TWO);
            }else if (user.getuErr() == 2){
                user.setuErr(3);
                user.setuState(3);
                ghUserMapper.updateByPrimaryKey(user);
                throw new BusinessRuntimeException(ExceptionCode.USER_PASSWORD_ERROR_THREE);
            }else {
                throw new BusinessRuntimeException(ExceptionCode.USER_PASSWORD_ERROR_THREE);
            }
        }
        AuthenticationInfo info = null;
        //getName()-->当前realm的名称
        info = new SimpleAuthenticationInfo(user,credentials, ByteSource.Util.bytes(user.getuUser()),this.getClass().getName());
        return info;
    }
}
