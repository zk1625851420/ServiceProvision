package com.zb.entity;

/**
 * 专辑状态信息实体
 */
public class CdState {

    private int cdStateId;
    private String cdStateName;

    public int getCdStateId() {
        return cdStateId;
    }

    public void setCdStateId(int cdStateId) {
        this.cdStateId = cdStateId;
    }

    public String getCdStateName() {
        return cdStateName;
    }

    public void setCdStateName(String cdStateName) {
        this.cdStateName = cdStateName;
    }

    @Override
    public String toString() {
        return "CdState{" +
                "cdStateId=" + cdStateId +
                ", cdStateName='" + cdStateName + '\'' +
                '}';
    }
}
