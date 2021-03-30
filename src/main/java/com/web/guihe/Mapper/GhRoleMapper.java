package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhRole;
import com.web.guihe.Entity.GhRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Component
public interface GhRoleMapper {
    int countByExample(GhRoleExample example);

    int deleteByExample(GhRoleExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(GhRole record);

    int insertSelective(GhRole record);

    List<GhRole> selectByExample(GhRoleExample example);

    GhRole selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") GhRole record, @Param("example") GhRoleExample example);

    int updateByExample(@Param("record") GhRole record, @Param("example") GhRoleExample example);

    int updateByPrimaryKeySelective(GhRole record);

    int updateByPrimaryKey(GhRole record);

    //根据用户所属角色id查询权限
    GhRole selectPermissionsByrId(Integer rId);
}