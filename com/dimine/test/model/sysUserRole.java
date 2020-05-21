package com.dimine.test.model;

import com.dimine.core.model.BaseEntity;

/**
 * @author hw
 * @date 2020-02-14 09:08:38
 */

public class sysUserRole extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String userid;

    private String roleid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}