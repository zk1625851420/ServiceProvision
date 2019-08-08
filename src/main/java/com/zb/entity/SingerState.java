package com.zb.entity;

/**
 * 歌手状态信息实体
 */
public class SingerState {
    private int singerStateId;
    private String singerStateName;

    public int getSingerStateId() {
        return singerStateId;
    }

    public void setSingerStateId(int singerStateId) {
        this.singerStateId = singerStateId;
    }

    public String getSingerStateName() {
        return singerStateName;
    }

    public void setSingerStateName(String singerStateName) {
        this.singerStateName = singerStateName;
    }

    @Override
    public String toString() {
        return "SingerState{" +
                "singerStateId=" + singerStateId +
                ", singerStateName='" + singerStateName + '\'' +
                '}';
    }
}
