package com.supermario.sardine.entity;

import com.supermario.sardine.enums.RoleStatus;

import java.util.List;

/**
 * Created by Victor on 01/05/2017.
 */

public class Role extends BaseEntity {

    private static final long serialVersionUID = -3108579144307239097L;

    private String type;
    private RoleStatus status;
    private List<Permission> permissionList;

    public Role() {
        super();
    }

    public Role(String id, String name, long createTime, long lastUpdateTime) {
        super(id, name, createTime, lastUpdateTime);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RoleStatus getStatus() {
        return status;
    }

    public void setStatus(RoleStatus status) {
        this.status = status;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
}
