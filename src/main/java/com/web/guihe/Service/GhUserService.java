package com.web.guihe.Service;

import com.web.guihe.Entity.GhModule;
import com.web.guihe.Entity.GhModuleExample;
import com.web.guihe.Entity.GhUser;
import com.web.guihe.Mapper.GhModuleMapper;
import com.web.guihe.Mapper.GhUserMapper;
import com.web.guihe.Util.BasicUtil.PassCommon;
import com.web.guihe.Util.Exception.BusinessRuntimeException;
import com.web.guihe.Util.Exception.ExceptionCode;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import com.web.guihe.Util.RabbitMq.PushMsgProducer;
import com.web.guihe.Util.RabbitMq.WiselyMessage;
import com.web.guihe.Util.Redis.RedisUtil;
import com.web.guihe.Util.Shiro.Token.CustomizedToken;
import com.web.guihe.Util.Shiro.Token.JwtUtil;
import com.web.guihe.Util.Shiro.Token.LoginEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 */
@Service
public class GhUserService {

    @Autowired
    private GhUserMapper ghUserMapper;

    @Autowired
    private GhModuleMapper ghModuleMapper;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    @Autowired
    private RedisUtil redisUtil = new RedisUtil();

    @Autowired
    private WiselyMessage wiselyMessage;

    @Autowired
    private PushMsgProducer pushMsgProducer;

    /**
     * 用户登录
     * @param ghUser
     * @return
     */
    public ReturnResult userLogin(GhUser ghUser) throws IOException {
        // 获取Subject
        Subject subject = SecurityUtils.getSubject();
        if (ghUserMapper.findUserByuUser(ghUser.getuUser()) == null) throw new BusinessRuntimeException(ExceptionCode.USERS_USER_ERROR);
        GhUser user = ghUserMapper.selectUserRoleByuId((ghUserMapper.findUserByuUser(ghUser.getuUser()).getuId()));
        // 制作CustomizedToken执行登录
        CustomizedToken customizedToken = new CustomizedToken(user.getuUser(),ghUser.getuPass(), LoginEnum.BY_PASSWORD.getLoginType());
        subject.login(customizedToken);
        // 若登陆成功返回相关token
        String token = JwtUtil.sign(user);
        redisUtil.setCacheObject(user.getuUser(),token);
        wiselyMessage.back(redisUtil.getCacheObject(user.getuUser()),"rk_GUIHEMSG",null);
        pushMsgProducer.send(wiselyMessage);
        returnResult.back(1,user,token);
        return returnResult;
    }

    /**
     * 密码修改
     * @param ghUser
     * @return
     */
    public ReturnResult changeUserPass(GhUser ghUser){
        if(ghUser.getuId() != null && !"".equals(ghUser.getuId())){
            GhUser ghUsers = ghUserMapper.selectByPrimaryKey(ghUser.getuId());
            if(ghUsers != null){
                ghUser.setuSalt(ghUser.getuPass());
                ghUser.setuPass(PassCommon.encryptPassword(ghUsers.getuUser(),ghUser.getuPass()));
                ghUserMapper.updateByPrimaryKeySelective(ghUser);
                returnResult.success("success");
            }else {
                returnResult.error("error");
            }
        }else {
            returnResult.error("error");
        }
        return returnResult;
    }

    /**
     * 根据用户id查找用户信息
     * @param uId
     * @return
     */
    public GhUser selectByPrimaryKey(Integer uId){
        return ghUserMapper.selectByPrimaryKey(uId);
    }

    /**
     * 根据用户id查找用户信息及其角色
     * @param uId
     * @return
     */
    public ReturnResult selectUserRoleByuId(Integer uId){
        returnResult.custom(1,ghUserMapper.selectUserRoleByuId(uId));
        return returnResult;
    }

    /**
     * 根据角色id查找模板
     * @param rId
     * @return
     */
    public ReturnResult selectByRoleId(Integer rId){
        if(rId != null && !"".equals(rId)){
            List<GhModule> listAll = ghModuleMapper.selectByRoleId(rId);
            List<GhModule> listBack = new ArrayList<>();
            List<GhModule> moduleChild = new ArrayList<>();
            if(listAll != null){
                listAll.stream().forEach(ghModuleAll -> {
                    if(ghModuleAll.getmSubs() != null && !"".equals(ghModuleAll.getmSubs())){
                        if((ghModuleAll.getmFather() == null || "".equals(ghModuleAll.getmFather())) &&
                                (ghModuleAll.getmChild() == null || "".equals(ghModuleAll.getmChild()) )){
                            GhModuleExample ghModuleExample1 = new GhModuleExample();
                            GhModuleExample.Criteria criteria1 = ghModuleExample1.createCriteria();
                            criteria1.andMFatherEqualTo(String.valueOf(ghModuleAll.getmId()));
                            List<GhModule> listFather = ghModuleMapper.selectByExample(ghModuleExample1);
                            listFather.stream().forEach(ghModuleFather -> {
                                GhModuleExample ghModuleExample2 = new GhModuleExample();
                                GhModuleExample.Criteria criteria2 = ghModuleExample2.createCriteria();
                                criteria2.andMChildEqualTo(String.valueOf(ghModuleFather.getmId()));
                                List<GhModule> listChild = ghModuleMapper.selectByExample(ghModuleExample2);
                                if(listChild.size() > 0){
                                    ghModuleFather.setSubs(listChild);
                                }
                                if(ghModuleFather.getmChild() == null || "".equals(ghModuleFather.getmChild())){
                                    moduleChild.add(ghModuleFather);
                                }
                            });
                            ghModuleAll.setSubs(moduleChild);
                            listBack.add(ghModuleAll);
                        }
                    }else{
                        listBack.add(ghModuleAll);
                    }
                });
            }
            returnResult.custom(1,listBack);
        }else {
            throw new BusinessRuntimeException(ExceptionCode.FOUR_ONE_ERROR);
        }
        return returnResult;
    }

}
