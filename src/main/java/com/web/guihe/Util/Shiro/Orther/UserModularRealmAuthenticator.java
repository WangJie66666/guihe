package com.web.guihe.Util.Shiro.Orther;

import com.web.guihe.Util.Exception.GlobaExceptionHandler;
import com.web.guihe.Util.Shiro.Token.CustomizedToken;
import com.web.guihe.Util.Shiro.Token.JwtToken;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.realm.Realm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
public class UserModularRealmAuthenticator extends ModularRealmAuthenticator  {

    private static final Logger LOG = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    //当subject.login()方法执行,下面的代码即将执行
    @Override
    protected AuthenticationInfo doAuthenticate(AuthenticationToken authenticationToken) throws AuthenticationException{
        LOG.info("UserModularRealmAuthenticator:method doAuthenticate() 执行 ");
        // 判断getRealms()是否返回为空
        assertRealmsConfigured();
        // 所有Realm
        Collection<Realm> realms = getRealms();
        // 盛放登录类型对应的所有Realm集合
        Collection<Realm> typeRealms = new ArrayList<>();
        // 强制转换回自定义的Token
        try{
            LOG.info("进入了UserModularRealmAuthenticator类...得到的authenticationToken是:{}",authenticationToken);
            JwtToken jwtToken = (JwtToken) authenticationToken;
            for(Realm realm : realms){
                if (realm.getName().contains("Jwt")){
                    typeRealms.add(realm);
                }
            }
            return doSingleRealmAuthentication(typeRealms.iterator().next(), jwtToken);
        }catch (ClassCastException  e){
            typeRealms.clear();
            // 这个类型转换的警告不需要再关注 如果token错误 后面将会抛出异常信息
            CustomizedToken customizedToken = (CustomizedToken) authenticationToken;
            // 登录类型
            String loginType = customizedToken.getLoginType();
            for(Realm realm : realms){
                LOG.info("正在遍历的realm是:{}",realm.getName());
                if (realm.getName().contains(loginType)){
                    LOG.info("当前realm:{}被注入:",realm.getName());
                    typeRealms.add(realm);
                }
            }
            // 判断是单Realm还是多Realm
            if(typeRealms.size() == 1){
                LOG.info("一个realm");
                return doSingleRealmAuthentication(typeRealms.iterator().next(),customizedToken);
            }else {
                LOG.info("多个realm");
                return doMultiRealmAuthentication(typeRealms, customizedToken);
            }
        }
    }
}
