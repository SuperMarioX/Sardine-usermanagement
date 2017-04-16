package com.supermario.sardine.entity;

import java.io.Serializable;

/**
 * Base entity for this system
 */

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7670555913753374081L;

    private String id;
    private String name;
    private long createTime;
    private long lastUpdateTime;

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

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
