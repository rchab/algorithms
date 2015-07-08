package com.rchab.menshykov.increasingsequence;

/*
Find the longest number increasing sequence in array
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static final int START_SEQUENT_NUMBER = 1;

    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 6, 3, 4, 6, 7, 5, 8, 9, 10, 11};
        List<Integer> numberList = Arrays.asList(array);
        List<Integer> orderList = createArrayWithIncreasingSequenceOrder(numberList);

        System.out.println(numberList);
        System.out.println(orderList);

        Integer maxSequenceLength = Collections.max(orderList);

        Integer indexOfLastElement = orderList.indexOf(maxSequenceLength);
        List<Integer> longestSequent = numberList.subList(indexOfLastElement - maxSequenceLength + 1, indexOfLastElement + 1);

        System.out.println(longestSequent);
    }

    private static List<Integer> createArrayWithIncreasingSequenceOrder(List<Integer> inputList) {
        List<Integer> orderOfElementInSequentList = new LinkedList<>();
        Integer elementOrder = START_SEQUENT_NUMBER;
        orderOfElementInSequentList.add(elementOrder);
        for (int index = 1; index < inputList.size(); index++) {
            elementOrder = getOrderOfElementInIncreasingSequence(inputList.get(index), inputList.get(index - 1), elementOrder);
            orderOfElementInSequentList.add(elementOrder);
        }
        return orderOfElementInSequentList;
    }

    public static Integer getOrderOfElementInIncreasingSequence(Integer element, Integer previousElement, Integer orderInSequentOfPreviousElement){
        return (element >= previousElement ? ++orderInSequentOfPreviousElement : START_SEQUENT_NUMBER);
    }
}
