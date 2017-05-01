package com.supermario.sardine.entity;

import java.io.Serializable;

/**
 * To:
 *      Base entity for user, role, permissions
 *
 * Date:
 *      2017-05-01
 *
 * Version:
 *      v1.0
 *
 */

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7670555913753374081L;

    private String id;
    private String name;
    private long createTime;
    private long lastUpdateTime;
    private String description;

    public BaseEntity() {}

    public BaseEntity(String id, String name, long createTime, long lastUpdateTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
