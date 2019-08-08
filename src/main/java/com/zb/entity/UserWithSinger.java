package com.zb.entity;

import java.util.Date;

/**
 * 用户和歌手的关联信息实体
 */
public class UserWithSinger {
    private int uSingerId;
    private int userId;
    private int singerId;
    private Date collectionDate;

    public int getuSingerId() {
        return uSingerId;
    }

    public void setuSingerId(int uSingerId) {
        this.uSingerId = uSingerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    @Override
    public String toString() {
        return "UserWithSinger{" +
                "uSingerId=" + uSingerId +
                ", userId=" + userId +
                ", singerId=" + singerId +
                ", collectionDate=" + collectionDate +
                '}';
    }
}
