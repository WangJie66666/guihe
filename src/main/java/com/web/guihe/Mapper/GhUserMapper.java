package com.web.guihe.Mapper;

import com.web.guihe.Entity.GhUser;
import com.web.guihe.Entity.GhUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface GhUserMapper {
    int countByExample(GhUserExample example);

    int deleteByExample(GhUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(GhUser record);

    int insertSelective(GhUser record);

    List<GhUser> selectByExample(GhUserExample example);

    GhUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") GhUser record, @Param("example") GhUserExample example);

    int updateByExample(@Param("record") GhUser record, @Param("example") GhUserExample example);

    int updateByPrimaryKeySelective(GhUser record);

    int updateByPrimaryKey(GhUser record);

    //根据用户账号查找用户信息
    GhUser findUserByuUser(String uUser);

    //根据用户id查找用户信息及其角色
    GhUser selectUserRoleByuId(Integer uId);
}