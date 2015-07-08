package com.rchab.menshykov.increasingsequence;

/*
Find the longest number increasing sequence in array
 */

import java.util.Arrays;
import java.util.List;

public class App {
    public static final int START_SEQUENT_NUMBER = 1;
    private static Integer[] array = new Integer[]{2, 6, 3, 4, 6, 7, 5, 8, 9, 10, 11};

    public static void main(String[] args) {
        ArrayUtils.printArrayInOneLine(array);
        Integer[] orderOfElementInSequent = new Integer[array.length];
        orderOfElementInSequent[0] = START_SEQUENT_NUMBER;

        for(int index = 1; index < array.length; index++) {
            orderOfElementInSequent[index] = getNumberInSequent(array[index - 1], array[index], orderOfElementInSequent[index - 1]);
        }
        System.out.println();
        ArrayUtils.printArrayInOneLine(orderOfElementInSequent);

        List<Integer> numberList = Arrays.asList(array);
        List<Integer> orderList = Arrays.asList(orderOfElementInSequent);

        Integer maxSequenceLength = getMaxNumberFromArray(orderOfElementInSequent);

        System.out.println();
        Integer indexOfLastElement = orderList.indexOf(maxSequenceLength);
        List<Integer> longestSequent = numberList.subList(indexOfLastElement - maxSequenceLength + 1, indexOfLastElement + 1);

        System.out.println(longestSequent);
    }

    public static Integer getNumberInSequent(Integer previousNumber, Integer currentNumber, Integer orderInSequentOfPreviousElement){
        Integer orderInSequent = START_SEQUENT_NUMBER;
        if(currentNumber >= previousNumber){
            orderInSequent = ++orderInSequentOfPreviousElement;
        }
        return orderInSequent;
    }

    public static Integer getMaxNumberFromArray(Integer[] array){
        Integer max = 0;
        for(Integer element: array){
            if (element > max) {
                max = element;
            }
        }
        return max;
    }


}
