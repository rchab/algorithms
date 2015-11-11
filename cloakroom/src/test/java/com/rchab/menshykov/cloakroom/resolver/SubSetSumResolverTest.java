package com.rchab.menshykov.cloakroom.resolver;

import com.rchab.menshykov.cloakroom.resolver.SubSetSumResolver;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

public class SubSetSumResolverTest {

    // 50 = 50
    @Test
    public void shouldHaveSumForOneElementList(){
        Integer sum = 50;
        List<Integer> testElements = new ArrayList<>();
        testElements.add(50);
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertTrue(subSetSumResolver.hasSum(sum));
    }

    // 50 != 55
    @Test
    public void shouldNotHaveSumForOneElementList(){
        Integer sum = 55;
        List<Integer> testElements = new ArrayList<>();
        testElements.add(50);
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertFalse(subSetSumResolver.hasSum(sum));
    }

    // 50 = 50
    @Test
    public void shouldNotHaveSumForEmptyElementList(){
        Integer sum = 50;
        List<Integer> testElements = new ArrayList<>();
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertFalse(subSetSumResolver.hasSum(sum));
    }

    //36 + 34 = 60
    @Test
    public void shouldHaveSumForTwoElementList(){
        Integer sum = 60;
        List<Integer> testElements = new ArrayList<>();
        testElements.add(36);
        testElements.add(24);
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertTrue(subSetSumResolver.hasSum(sum));
    }

    // 0 + 60 = 60
    @Test
    public void shouldHaveSumForTwoElementListWithZero(){
        Integer sum = 60;
        List<Integer> testElements = new ArrayList<>();
        testElements.add(0);
        testElements.add(60);
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertTrue(subSetSumResolver.hasSum(sum));
    }

    // 3 + 33 +64 = 100
    @Test
    public void shouldHaveSumForFiveElementList(){
        Integer sum = 100;
        List<Integer> testElements = new ArrayList<>();
        testElements.add(3);
        testElements.add(57);
        testElements.add(33);
        testElements.add(87);
        testElements.add(64);
        SubSetSumResolver subSetSumResolver = new SubSetSumResolver(testElements);
        assertTrue(subSetSumResolver.hasSum(sum));
        assertFalse(subSetSumResolver.hasSum(sum + 1));
    }
}
