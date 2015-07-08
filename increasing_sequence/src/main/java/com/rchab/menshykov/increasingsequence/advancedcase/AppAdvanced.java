package com.rchab.menshykov.increasingsequence.advancedcase;

import java.util.Arrays;
import java.util.List;


public class AppAdvanced {
//    private static Integer[] array = new Integer[]{2, 6, 3, 4, 7, 5};
    private static Integer[] array = new Integer[]{1, 3, 2, 4, 5, 3, 6, 4};
//    private static Integer[] array = new Integer[]{2, 3, 9, 9, 8, 7, 6, 5, 4, 1};

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(array);
        Sequence sequence = new Sequence(inputList);
        System.out.println(sequence);
        System.out.println(sequence.getLastSequenceElement().getIntegerSequent());
    }
}
