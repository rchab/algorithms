package com.rchab.menshykov.cloakroom.resolver;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.rchab.menshykov.cloakroom.domain.CloakRoom;
import com.rchab.menshykov.cloakroom.domain.Item;
import com.rchab.menshykov.cloakroom.domain.RobberyPlan;

import java.util.List;

public class PlanResolver {
    private RobberyPlan plan;

    public PlanResolver(RobberyPlan plan) {
        this.plan = plan;
    }

    public boolean isPlanFeasibleForRoom(CloakRoom room) {
        List<Item> availableItems = room.getAvailableItemsForTimeFrame(plan.getEnterRoomTime(), plan.getLeaveRoomTime());
        List<Integer> availableItemValues = getItemValues(availableItems);
        SubSetSumResolver sumResolver = new SubSetSumResolver(availableItemValues);
        return sumResolver.hasSum(plan.getThievedValue());
    }

    private static List<Integer> getItemValues(List<Item> itemList) {
        Function<Item, Integer> getValueFunction = new Function<Item, Integer>() {
            @Override
            public Integer apply(Item input) {
                return input.getValue();
            }
        };
        return Lists.newArrayList(Collections2.transform(itemList, getValueFunction));
    }
}
