package com.dimine.test.dao;

import com.dimine.core.dao.BaseMapper;
import com.dimine.test.model.sysUserRole;

public interface sysUserRoleMapper extends BaseMapper {
    int insert(sysUserRole record);

    int insertSelective(sysUserRole record);
}