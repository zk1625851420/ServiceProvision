package com.zb.entity;

import java.util.Date;

/**
 * 歌手信息实体
 */
public class Singer {
    private int singerId;
    private String singerName;
    private int accessCount;
    private int collectionCount;
    private int areaId;
    private String introduce;
    private Date birthday;
    private int singerSex;
    private String photoUrl;
    private int debutDate;
    private int singerStateId;

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSingerSex() {
        return singerSex;
    }

    public void setSingerSex(int singerSex) {
        this.singerSex = singerSex;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(int debutDate) {
        this.debutDate = debutDate;
    }

    public int getSingerStateId() {
        return singerStateId;
    }

    public void setSingerStateId(int singerStateId) {
        this.singerStateId = singerStateId;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                ", accessCount=" + accessCount +
                ", collectionCount=" + collectionCount +
                ", areaId=" + areaId +
                ", introduce='" + introduce + '\'' +
                ", birthday=" + birthday +
                ", singerSex=" + singerSex +
                ", photoUrl='" + photoUrl + '\'' +
                ", debutDate=" + debutDate +
                ", singerStateId=" + singerStateId +
                '}';
    }
}
