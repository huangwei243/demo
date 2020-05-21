package com.dimine.test.model;

import com.dimine.core.model.BaseEntity;

/**
 * @author hw
 * @date 2020-02-14 09:08:38
 */

public class sysRole extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String roleid;

    private String rolename;

    private String deptid;

    private String acginame;

    private String memo;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getAcginame() {
        return acginame;
    }

    public void setAcginame(String acginame) {
        this.acginame = acginame;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}