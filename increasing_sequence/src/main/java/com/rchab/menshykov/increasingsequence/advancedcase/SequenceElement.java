package com.rchab.menshykov.increasingsequence.advancedcase;

public class SequenceElement {
    private Integer value;
    private Integer startIndex;
    private Integer sortedIndex;

    public SequenceElement(Integer value, Integer startIndex) {
        this.value = value;
        this.startIndex = startIndex;
    }


    public Integer getValue() {
        return value;
    }

    public void setSortedIndex(Integer sortedIndex) {
        this.sortedIndex = sortedIndex;
    }

    public Integer getOffset() {
        return startIndex - sortedIndex;
    }

    @Override
    public String toString() {
        int offset = startIndex - sortedIndex;
        return "SequenceElement{" +
                "value=" + value +
                ", startIndex=" + startIndex +
                ", sortedIndex=" + sortedIndex +
                ", sortedOffset=" + offset +
                "} \n";
    }
}
