package com.zb.entity;

/**
 * 用户状态信息实体
 */
public class UserState {
    private int userStateId;
    private String userStateName;

    public int getUserStateId() {
        return userStateId;
    }

    public void setUserStateId(int userStateId) {
        this.userStateId = userStateId;
    }

    public String getUserStateName() {
        return userStateName;
    }

    public void setUserStateName(String userStateName) {
        this.userStateName = userStateName;
    }

    @Override
    public String toString() {
        return "UserState{" +
                "userStateId=" + userStateId +
                ", userStateName='" + userStateName + '\'' +
                '}';
    }
}
