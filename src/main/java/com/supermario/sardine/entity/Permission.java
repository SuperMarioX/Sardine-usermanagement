package com.supermario.sardine.entity;

import com.supermario.sardine.enums.PermissionStatus;

/**
 * Created by Victor on 01/05/2017.
 */

public class Permission extends BaseEntity {

    private static final long serialVersionUID = -2512635152648386576L;

    private String type;
    private PermissionStatus status;

    public Permission() {
        super();
    }

    public Permission(String id, String name, long createTime, long lastUpdateTime) {
        super(id, name, createTime, lastUpdateTime);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PermissionStatus getStatus() {
        return status;
    }

    public void setStatus(PermissionStatus status) {
        this.status = status;
    }
}
