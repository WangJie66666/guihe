package com.web.guihe.Controller;

import com.web.guihe.Entity.GhUser;
import com.web.guihe.Service.GhRoleService;
import com.web.guihe.Service.GhUserService;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import com.web.guihe.Util.RabbitMq.PushMsgProducer;
import com.web.guihe.Util.RabbitMq.WiselyMessage;
import com.web.guihe.Util.Redis.RedisUtil;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class GhUserController {

    @Autowired
    private GhUserService ghUserService;

    @Autowired
    private GhRoleService ghRoleService;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    /**
     * 用户登录
     * @param ghUser
     * @return
     */
    @PostMapping("/login")
    public ReturnResult userLogin(GhUser ghUser) throws IOException { return ghUserService.userLogin(ghUser); }

    /**
     * 修改密码
     * @param ghUser
     * @return
     */
    @PostMapping("/changeUserPass")
    @RequiresRoles(value = {"admin","IT","operation"},logical = Logical.OR)
    public ReturnResult changeUserPass(GhUser ghUser){ return ghUserService.changeUserPass(ghUser); }

    /**
     * 根据角色id查找模板
     * @param rId
     * @return
     */
    @PostMapping("/findModuleByRoleId")
    @RequiresRoles(value = {"admin","IT","operation"},logical = Logical.OR)
    public ReturnResult selectByRoleId(Integer rId){return ghUserService.selectByRoleId(rId);}

}
