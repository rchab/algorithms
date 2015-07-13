package com.rchab.menshykov.increasingsequence.advancedcase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppAdvancedTest {

    @Test
    public void testLogSet() {
        List<Integer> inputList = new ArrayList<>();
        int size = 10000;
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            inputList.add(random.nextInt(size));
//            inputList.add(i+1);
        }
//        System.out.println(inputList);
        long startTime = System.currentTimeMillis();
        Sequence sequence = new Sequence(inputList);

        final List<Integer> result = sequence.getLastSequenceElement().getIntegerSequent();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("totalTime: " + totalTime + "; size=" + result.size());
        System.out.println(result);
    }
}
