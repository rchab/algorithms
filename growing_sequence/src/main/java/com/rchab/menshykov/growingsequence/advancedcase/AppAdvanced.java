package com.rchab.menshykov.growingsequence.advancedcase;

import com.rchab.menshykov.growingsequence.ArrayUtils;


public class AppAdvanced {
//    private static Integer[] array = new Integer[]{2, 6, 3, 4, 7, 5};
//    private static Integer[] array = new Integer[]{1, 3, 2, 4, 5, 3, 6};
    private static Integer[] array = new Integer[]{2, 3, 10, 9, 8, 7, 6, 5, 4, 1};

    public static void main(String[] args) {
        ArrayUtils.printArrayInOneLine(array);
        Sequence sequence = new Sequence(array);
        sequence.sortList();
        System.out.println(sequence);
        Sequence filteredSequence = sequence.getFilterSequence();
        System.out.println(filteredSequence);
    }


}
