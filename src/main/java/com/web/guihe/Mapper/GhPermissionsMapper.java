package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhPermissions;
import com.web.guihe.Entity.GhPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhPermissionsMapper {
    int countByExample(GhPermissionsExample example);

    int deleteByExample(GhPermissionsExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(GhPermissions record);

    int insertSelective(GhPermissions record);

    List<GhPermissions> selectByExample(GhPermissionsExample example);

    GhPermissions selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") GhPermissions record, @Param("example") GhPermissionsExample example);

    int updateByExample(@Param("record") GhPermissions record, @Param("example") GhPermissionsExample example);

    int updateByPrimaryKeySelective(GhPermissions record);

    int updateByPrimaryKey(GhPermissions record);
}