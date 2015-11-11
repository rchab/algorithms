package com.rchab.menshykov.cloakroom.domain;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;

public class CloakRoom {
    List<Item> itemList;

    public CloakRoom(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getAvailableItemsForTimeFrame(final Integer startTime, final Integer endTime) {
        Predicate<Item> availablePredicate = new Predicate<Item>() {
            @Override
            public boolean apply(Item input) {
                return (input.getLeftMoment() <= startTime) && (input.getTakeMoment() > endTime);
            }
        };
        return Lists.newArrayList(Iterables.filter(itemList, availablePredicate));
    }
}
