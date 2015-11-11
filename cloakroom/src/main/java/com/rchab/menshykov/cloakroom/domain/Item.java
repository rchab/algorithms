package com.rchab.menshykov.cloakroom.domain;

public class Item {

    private Integer value;
    private Integer leftMoment;
    private Integer takeMoment;

    public Item(Integer value, Integer leftMoment, Integer takeMoment) {
        if (leftMoment > takeMoment) throw new IllegalArgumentException("Left time can't be more than take time");
        this.value = value;
        this.leftMoment = leftMoment;
        this.takeMoment = takeMoment;
    }

    public Integer getValue() {
        return value;
    }

    public Integer getLeftMoment() {
        return leftMoment;
    }

    public Integer getTakeMoment() {
        return takeMoment;
    }
}
