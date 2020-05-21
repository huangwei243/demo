package com.dimine.test.dao;

import com.dimine.core.dao.BaseMapper;
import com.dimine.test.model.sysRole;

public interface sysRoleMapper extends BaseMapper {
    int insert(sysRole record);

    int insertSelective(sysRole record);
}