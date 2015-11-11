package com.rchab.menshykov.cloakroom;

import com.rchab.menshykov.cloakroom.domain.CloakRoom;
import com.rchab.menshykov.cloakroom.domain.RobberyPlan;
import com.rchab.menshykov.cloakroom.resolver.PlanResolver;

public class App {

    public static void main(String[] args) {
        CloakRoom room = AppInput.createDemoCloakRoom();
        for (RobberyPlan plan :AppInput.createDemoRobberyPlanList()) {
            PlanResolver planResolver = new PlanResolver(plan);
            System.out.println(planResolver.isPlanFeasibleForRoom(room));
        }
    }

}
