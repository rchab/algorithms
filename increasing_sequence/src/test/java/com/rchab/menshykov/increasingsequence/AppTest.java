package com.rchab.menshykov.increasingsequence;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

@Ignore
public class AppTest {

    @Test
    public void testGetNumberInSequentGrowingCase(){
        Integer previousNumber = 2;
        Integer currentNumber = 5;
        Integer previousOrderNumber = 3;

        Integer expectedResult = 4;

        assertEquals(expectedResult, App.getOrderOfElementInIncreasingSequence(previousNumber, currentNumber, previousOrderNumber));
    }

    @Test
    public void testGetNumberInSequentGrowingCaseEqualsNumbers(){
        Integer previousNumber = 6;
        Integer currentNumber = 6;
        Integer previousOrderNumber = 2;

        Integer expectedResult = 3;

        assertEquals(expectedResult, App.getOrderOfElementInIncreasingSequence(previousNumber, currentNumber, previousOrderNumber));
    }

    @Test
    public void testGetNumberInSequentNotGrowingCase(){
        Integer previousNumber = 3;
        Integer currentNumber = 1;
        Integer previousOrderNumber = 2;

        Integer expectedResult = App.START_SEQUENT_NUMBER;

        assertEquals(expectedResult, App.getOrderOfElementInIncreasingSequence(previousNumber, currentNumber, previousOrderNumber));
    }


}
