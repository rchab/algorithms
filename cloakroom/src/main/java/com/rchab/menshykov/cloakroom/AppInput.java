package com.rchab.menshykov.cloakroom;

import com.rchab.menshykov.cloakroom.domain.CloakRoom;
import com.rchab.menshykov.cloakroom.domain.Item;
import com.rchab.menshykov.cloakroom.domain.RobberyPlan;

import java.util.ArrayList;
import java.util.List;

public class AppInput {
    public static CloakRoom createDemoCloakRoom() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(6, 2, 7));
        itemList.add(new Item(5, 4, 9));
        itemList.add(new Item(1, 2, 4));
        itemList.add(new Item(2, 5, 8));
        itemList.add(new Item(1, 3, 9));
        return new CloakRoom(itemList);
    }

    public static List<RobberyPlan> createDemoRobberyPlanList() {
        List<RobberyPlan> planList = new ArrayList<>();
        planList.add(new RobberyPlan(2, 7, 1));
        planList.add(new RobberyPlan(2, 7, 2));
        planList.add(new RobberyPlan(3, 2, 0));
        planList.add(new RobberyPlan(5, 7, 2));
        planList.add(new RobberyPlan(4, 1, 5));
        return planList;
    }
}
