package com.zb.entity;

import java.util.Date;

/**
 * 歌曲实体
 */
public class Song {

    private int songId;
    private String songName;
    private int singerId;
    private int cdId;
    private String language;
    private int playCount;
    private int downloadCount;
    private int collectionCount;
    private Date publishDate;
    private String songUrl;
    private String cyricUrl;
    private double songTime;
    private int typeId;
    private int songStateId;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getCdId() {
        return cdId;
    }

    public void setCdId(int cdId) {
        this.cdId = cdId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public String getCyricUrl() {
        return cyricUrl;
    }

    public void setCyricUrl(String cyricUrl) {
        this.cyricUrl = cyricUrl;
    }

    public double getSongTime() {
        return songTime;
    }

    public void setSongTime(double songTime) {
        this.songTime = songTime;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getSongStateId() {
        return songStateId;
    }

    public void setSongStateId(int songStateId) {
        this.songStateId = songStateId;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", singerId=" + singerId +
                ", cdId=" + cdId +
                ", language='" + language + '\'' +
                ", playCount=" + playCount +
                ", downloadCount=" + downloadCount +
                ", collectionCount=" + collectionCount +
                ", publishDate=" + publishDate +
                ", songUrl='" + songUrl + '\'' +
                ", cyricUrl='" + cyricUrl + '\'' +
                ", songTime=" + songTime +
                ", typeId=" + typeId +
                ", songStateId=" + songStateId +
                '}';
    }
}
