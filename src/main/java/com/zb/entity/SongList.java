package com.zb.entity;

/**
 * 存储歌单信息实体
 */
public class SongList {

    private int songListId;
    private int userId;
    private String songListName;
    private int typeId;
    private int accessCount;
    private String introduce;
    private int collectionCount;
    private String tags;
    private int songListStateId;

    public int getSongListId() {
        return songListId;
    }

    public void setSongListId(int songListId) {
        this.songListId = songListId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSongListName() {
        return songListName;
    }

    public void setSongListName(String songListName) {
        this.songListName = songListName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getSongListStateId() {
        return songListStateId;
    }

    public void setSongListStateId(int songListStateId) {
        this.songListStateId = songListStateId;
    }

    @Override
    public String toString() {
        return "SongList{" +
                "songListId=" + songListId +
                ", userId=" + userId +
                ", songListName='" + songListName + '\'' +
                ", typeId=" + typeId +
                ", accessCount=" + accessCount +
                ", introduce='" + introduce + '\'' +
                ", collectionCount=" + collectionCount +
                ", tags='" + tags + '\'' +
                ", songListStateId=" + songListStateId +
                '}';
    }
}
