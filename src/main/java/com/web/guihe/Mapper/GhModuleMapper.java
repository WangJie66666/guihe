package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhModule;
import com.web.guihe.Entity.GhModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface GhModuleMapper {
    int countByExample(GhModuleExample example);

    int deleteByExample(GhModuleExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(GhModule record);

    int insertSelective(GhModule record);

    List<GhModule> selectByExample(GhModuleExample example);

    GhModule selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") GhModule record, @Param("example") GhModuleExample example);

    int updateByExample(@Param("record") GhModule record, @Param("example") GhModuleExample example);

    int updateByPrimaryKeySelective(GhModule record);

    int updateByPrimaryKey(GhModule record);

    // 根据角色id查找模板
    List<GhModule> selectByRoleId(Integer rId);

}