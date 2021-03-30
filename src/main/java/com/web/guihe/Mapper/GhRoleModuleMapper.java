package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhRoleModule;
import com.web.guihe.Entity.GhRoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhRoleModuleMapper {
    int countByExample(GhRoleModuleExample example);

    int deleteByExample(GhRoleModuleExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(GhRoleModule record);

    int insertSelective(GhRoleModule record);

    List<GhRoleModule> selectByExample(GhRoleModuleExample example);

    GhRoleModule selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") GhRoleModule record, @Param("example") GhRoleModuleExample example);

    int updateByExample(@Param("record") GhRoleModule record, @Param("example") GhRoleModuleExample example);

    int updateByPrimaryKeySelective(GhRoleModule record);

    int updateByPrimaryKey(GhRoleModule record);
}