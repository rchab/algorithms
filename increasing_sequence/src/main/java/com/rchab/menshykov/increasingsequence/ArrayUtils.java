package com.rchab.menshykov.increasingsequence;

public class ArrayUtils {

    public static void printArrayInOneLine(Object[] array){
        for(Object element: array){
            System.out.print(element + ", ");
        }
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
