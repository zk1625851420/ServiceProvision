package com.zb.entity;

/**
 * 歌曲状态信息实体
 */
public class SongState {
    private int songStateId;
    private String songStateName;

    public int getSongStateId() {
        return songStateId;
    }

    public void setSongStateId(int songStateId) {
        this.songStateId = songStateId;
    }

    public String getSongStateName() {
        return songStateName;
    }

    public void setSongStateName(String songStateName) {
        this.songStateName = songStateName;
    }

    @Override
    public String toString() {
        return "SongState{" +
                "songStateId=" + songStateId +
                ", songStateName='" + songStateName + '\'' +
                '}';
    }
}
