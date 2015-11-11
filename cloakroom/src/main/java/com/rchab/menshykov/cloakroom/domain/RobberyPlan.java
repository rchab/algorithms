package com.rchab.menshykov.cloakroom.domain;

public class RobberyPlan {
    private Integer thievedValue;
    private Integer enterRoomTime;
    private Integer leaveRoomTime;

    public RobberyPlan(Integer enterRoomTime, Integer thievedValue, Integer thievingTime) {
        this.enterRoomTime = enterRoomTime;
        this.thievedValue = thievedValue;
        this.leaveRoomTime = enterRoomTime + thievingTime;
    }

    public Integer getThievedValue() {
        return thievedValue;
    }

    public Integer getEnterRoomTime() {
        return enterRoomTime;
    }

    public Integer getLeaveRoomTime() {
        return leaveRoomTime;
    }
}
