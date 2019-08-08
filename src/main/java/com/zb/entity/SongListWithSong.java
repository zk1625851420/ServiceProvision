package com.zb.entity;

import java.util.Date;

/**
 * 歌曲和歌单的关联信息实体
 */
public class SongListWithSong {

    private int slSongId;
    private int       songListId;
    private int       songId;
    private Date      collectionDate;

    public int getSlSongId() {
        return slSongId;
    }

    public void setSlSongId(int slSongId) {
        this.slSongId = slSongId;
    }

    public int getSongListId() {
        return songListId;
    }

    public void setSongListId(int songListId) {
        this.songListId = songListId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    @Override
    public String toString() {
        return "SongListWithSong{" +
                "slSongId=" + slSongId +
                ", songListId=" + songListId +
                ", songId=" + songId +
                ", collectionDate=" + collectionDate +
                '}';
    }
}
