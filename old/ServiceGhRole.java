package com.web.guihe.Service;

import com.web.guihe.Util.ReturnResult;
import com.web.guihe.Util.Token.RoleValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceGhRole {

    @Autowired
    private GhRoleMapper ghRoleMapper;

    @Autowired
    private RoleValidationUtil roleValidationUtil;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    /**
     * 用户登录
     * @param ghRole
     * @return
     */
    public ReturnResult roleLogin(GhRole ghRole){
        return roleValidationUtil.roleLoginValidation(ghRole);
    }

    /**
     * 根据用户id查找用户
     * @param uId
     * @return
     */
    public GhRole findUserByuId(Integer uId){
       return ghRoleMapper.selectByPrimaryKey(uId);
    }

    /**
     * 根据用户id修改用户信息
     * @param ghRole
     * @return
     */
    public boolean updateByPrimaryKeySelective(GhRole ghRole){
        if(ghRole.getuId() != null && !"".equals(ghRole.getuId())){
            ghRoleMapper.updateByPrimaryKeySelective(ghRole);
            return true;
        }else {
            return false;
        }
    }

}
