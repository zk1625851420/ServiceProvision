package com.zb.entity;

/**
 * 管理员实体
 */
public class Admin {
    private int adminId;
    private String loginId;
    private String password;
    private String adminName;
    private int userType;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", adminName='" + adminName + '\'' +
                ", userType=" + userType +
                '}';
    }
}
