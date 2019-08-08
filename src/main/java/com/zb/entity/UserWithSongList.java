package com.zb.entity;

import java.util.Date;

/**
 * 用户和歌单的关联信息实体
 */
public class UserWithSongList {

    private int uSongListId;
    private int userId;
    private int songListId;
    private Date collectionDate;

    public int getuSongListId() {
        return uSongListId;
    }

    public void setuSongListId(int uSongListId) {
        this.uSongListId = uSongListId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSongListId() {
        return songListId;
    }

    public void setSongListId(int songListId) {
        this.songListId = songListId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    @Override
    public String toString() {
        return "UserWithSongList{" +
                "uSongListId=" + uSongListId +
                ", userId=" + userId +
                ", songListId=" + songListId +
                ", collectionDate=" + collectionDate +
                '}';
    }
}
