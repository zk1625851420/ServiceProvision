package com.zb.entity;

import java.util.Date;

/**
 * CD专辑信息实体
 */
public class Cd {

    private int cdId;
    private String cdName;
    private String coverUrl;
    private int songCount;
    private Date publishDate;
    private int singerId;
    private String introduce;
    private int collectionCount;
    private int cdStateId;

    public int getCdId() {
        return cdId;
    }

    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public int getCdStateId() {
        return cdStateId;
    }

    public void setCdStateId(int cdStateId) {
        this.cdStateId = cdStateId;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "cdId=" + cdId +
                ", cdName='" + cdName + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", songCount=" + songCount +
                ", publishDate=" + publishDate +
                ", singerId=" + singerId +
                ", introduce='" + introduce + '\'' +
                ", collectionCount=" + collectionCount +
                ", cdStateId=" + cdStateId +
                '}';
    }
}
