package com.dimine.test.dao;

import com.dimine.core.dao.BaseMapper;
import com.dimine.test.model.sysUser;

public interface sysUserMapper extends BaseMapper {
    int deleteByPrimaryKey(String userid);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);
}