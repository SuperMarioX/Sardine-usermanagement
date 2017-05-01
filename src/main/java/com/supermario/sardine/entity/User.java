package com.supermario.sardine.entity;

import com.supermario.sardine.enums.UserStatus;

import java.util.List;


/**
 * Created by Victor on 01/05/2017.
 */

public class User extends BaseEntity {

    private static final long serialVersionUID = -66717546777865372L;

    private String password;
    private String aliasName;
    private String email;
    private String sex;
    private long phoneNumber;
    private String address;
    private String type;
    private Role role;
    private List<Role> roleList;
    private UserStatus status;

    public User() {
        super();
    }

    public User(String id, String name, String password, long createTime, long lastUpdateTime) {
        super(id, name, createTime, lastUpdateTime);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
