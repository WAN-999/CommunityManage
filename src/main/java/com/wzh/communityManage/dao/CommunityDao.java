package com.wzh.communityManage.dao;

import com.wzh.communityManage.entity.Community;
import com.wzh.communityManage.entity.CommunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityDao {
    long countByExample(CommunityExample example);

    int deleteByExample(CommunityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Community record);

    int insertSelective(Community record);

    List<Community> selectByExample(CommunityExample example);

    Community selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Community record, @Param("example") CommunityExample example);

    int updateByExample(@Param("record") Community record, @Param("example") CommunityExample example);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}