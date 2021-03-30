package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhCallSystem;
import com.web.guihe.Entity.GhCallSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhCallSystemMapper {
    int countByExample(GhCallSystemExample example);

    int deleteByExample(GhCallSystemExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(GhCallSystem record);

    int insertSelective(GhCallSystem record);

    List<GhCallSystem> selectByExample(GhCallSystemExample example);

    GhCallSystem selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") GhCallSystem record, @Param("example") GhCallSystemExample example);

    int updateByExample(@Param("record") GhCallSystem record, @Param("example") GhCallSystemExample example);

    int updateByPrimaryKeySelective(GhCallSystem record);

    int updateByPrimaryKey(GhCallSystem record);
}