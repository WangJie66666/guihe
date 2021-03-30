package com.web.guihe.Util.Shiro.Realm;

import com.google.common.base.Splitter;
import com.web.guihe.Entity.GhRole;
import com.web.guihe.Entity.GhUser;
import com.web.guihe.Mapper.GhRoleMapper;
import com.web.guihe.Mapper.GhUserMapper;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import com.web.guihe.Util.Shiro.Token.JwtToken;
import com.web.guihe.Util.Shiro.Token.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Spliterator;

@Slf4j
@Component
public class RealmJwt extends AuthorizingRealm {

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @Autowired
    private GhUserMapper ghUserMapper;

    @Autowired
    private GhRoleMapper ghRoleMapper;

    @Override
    public boolean supports(AuthenticationToken authenticationToken){
        return authenticationToken instanceof JwtToken;
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String token = principalCollection.toString();
        LOG.info("JwtRealm身份认证开始，获取到的token是:{}",token);
        Integer uId = JwtUtil.getUserId(token);
        GhUser ghUser = ghUserMapper.selectUserRoleByuId(uId);
        GhRole ghRole = ghRoleMapper.selectPermissionsByrId(ghUser.getGhRole().getrId());
        if(ghRole == null) throw new AuthenticationException(ExceptionCode.ROLE_NO_ERROR.getMsg());
        List<String> permissionsList = Splitter.on(",").splitToList(ghRole.getGhPermissions());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加角色
        simpleAuthorizationInfo.addRole(ghRole.getrName());
        //添加权限
        simpleAuthorizationInfo.addStringPermissions(permissionsList);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException{
        LOG.info("jwtRealm中关于身份验证的方法执行...传递的token是:{}",authenticationToken);
        String token = (String) authenticationToken.getCredentials();
        if(token == "LOGIN_NO_ERROR"){
            throw new AuthenticationException(ExceptionCode.LOGIN_NO_ERROR.getMsg());
        }
        GhUser ghUser = ghUserMapper.selectByPrimaryKey(JwtUtil.getUserId(token));
        JwtUtil jwtUtil = new JwtUtil();
        if(!jwtUtil.verify(token,ghUser)){
            throw new AuthenticationException(ExceptionCode.TOKEN_ERROR.getMsg());
        }
        LOG.info("进行身份验证时,用户提供的token有效");
        AuthenticationInfo info = null;
        //getName()-->当前realm的名称
        info = new SimpleAuthenticationInfo(token, token, this.getClass().getName());
        return info;
    }
}
