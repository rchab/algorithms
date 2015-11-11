package com.rchab.menshykov.cloakroom.resolver;

import java.util.List;

public class SubSetSumResolver {
    private List<Integer> elements;

    public SubSetSumResolver(List<Integer> elements) {
        this.elements = elements;
    }

    public boolean hasSum(Integer sum){
        return subSetWithIndexHasSum(elements.size() - 1, sum);
    }

    private boolean subSetWithIndexHasSum(int index, Integer sum) {
        if (elements.size() == 0) {
            return false;
        }
        Integer elementValue = elements.get(index);
        if (index == 0) {
            return elementValue == sum;
        }
        int previousIndex = index - 1;
        return subSetWithIndexHasSum(previousIndex, sum) || elementValue == sum || subSetWithIndexHasSum(previousIndex, sum - elementValue);
    }

}
