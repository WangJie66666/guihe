package com.web.guihe.Util.Token;

import com.web.guihe.Util.Redis.RedisUtil;
import com.web.guihe.Util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 角色、权限验证工具类
 */
@Component
public class RoleValidationUtil {

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    @Autowired
    private GhRoleMapper ghRoleMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private TokenBean tokenBean;

    public ReturnResult roleLoginValidation(GhRole ghRole){
        GhRole user = ghRoleMapper.findUserByuUser(ghRole.getuUser());
        if(user == null){
            returnResult.custom(3,"账号不存在");
        }else{
            if(!user.getuPass().equals(ghRole.getuPass())){
                if("0".equals(user.getuB1())){
                    returnResult.custom(3,"您输入的密码有误，请重新输入!密码错误次数:1,再输错2次密码,账号将被锁定!");
                    user.setuB1("1");
                    ghRoleMapper.updateByPrimaryKeySelective(user);
                }else if("1".equals(user.getuB1())){
                    returnResult.custom(3,"您输入的密码有误，请重新输入!密码错误次数:2,再输错1次密码,账号将被锁定!");
                    user.setuB1("2");
                    ghRoleMapper.updateByPrimaryKeySelective(user);
                }else {
                    returnResult.custom(3,"您密码已累计输错3次,账号已被锁定,请联系管理员解锁!");
                    user.setuB1("3");
                    user.setuState(3);
                    ghRoleMapper.updateByPrimaryKeySelective(user);
                }
            }else {
                if(user.getuNum() >= 3){
                    returnResult.custom(3,user.getuUser()+"账号已在3处地方登陆,达到了最大登陆限制,请耐心等待其他用户退出!");
                }else{
                    String token = tokenBean.getToken(user);
                    user.setuNum(user.getuNum() + 1);
                    user.setuSalt(token);
                    ghRoleMapper.updateByPrimaryKeySelective(user);
                    redisUtil.setCacheObject("token",token);
                    returnResult.back(1,user,token);
                }
            }
        }
        return returnResult;
    }
}
