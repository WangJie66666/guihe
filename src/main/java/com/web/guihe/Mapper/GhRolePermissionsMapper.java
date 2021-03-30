package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhRolePermissions;
import com.web.guihe.Entity.GhRolePermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhRolePermissionsMapper {
    int countByExample(GhRolePermissionsExample example);

    int deleteByExample(GhRolePermissionsExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(GhRolePermissions record);

    int insertSelective(GhRolePermissions record);

    List<GhRolePermissions> selectByExample(GhRolePermissionsExample example);

    GhRolePermissions selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") GhRolePermissions record, @Param("example") GhRolePermissionsExample example);

    int updateByExample(@Param("record") GhRolePermissions record, @Param("example") GhRolePermissionsExample example);

    int updateByPrimaryKeySelective(GhRolePermissions record);

    int updateByPrimaryKey(GhRolePermissions record);
}