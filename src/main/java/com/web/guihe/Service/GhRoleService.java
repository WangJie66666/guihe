package com.web.guihe.Service;

import com.web.guihe.Entity.GhRole;
import com.web.guihe.Mapper.GhRoleMapper;
import com.web.guihe.Util.BasicUtil.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GhRoleService {

    @Autowired
    private GhRoleMapper ghRoleMapper;

    @Autowired
    private ReturnResult returnResult = new ReturnResult();

    public GhRole selectPermissionsByrId(Integer rId){
        return  ghRoleMapper.selectPermissionsByrId(rId);
    }
}
