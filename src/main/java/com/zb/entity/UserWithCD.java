package com.zb.entity;

import java.util.Date;

/**
 * 用户和cd专辑的关联信息实体
 */
public class UserWithCD {
    private int uCDId;
    private int userId;
    private int cdId;
    private Date collectionDate;

    public int getuCDId() {
        return uCDId;
    }

    public void setuCDId(int uCDId) {
        this.uCDId = uCDId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCdId() {
        return cdId;
    }

    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    @Override
    public String toString() {
        return "UserWithCD{" +
                "uCDId=" + uCDId +
                ", userId=" + userId +
                ", cdId=" + cdId +
                ", collectionDate=" + collectionDate +
                '}';
    }
}
