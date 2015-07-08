package com.rchab.menshykov.growingsequence.advancedcase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sequence {

    private List<SequenceElement> elementList;

    private Sequence filteredList;

    public Sequence(List<SequenceElement> elementList) {
        this.elementList = elementList;
    }

    public Sequence(Integer[] array) {
        elementList = new LinkedList<>();
        int startIndex = 0;
        for (int startElement : array) {
            SequenceElement sequenceElement = new SequenceElement(startElement, startIndex);
            elementList.add(sequenceElement);
            startIndex++;
        }
    }

    public void sortList() {
        int length = elementList.size();
        for (int i = length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                SequenceElement firstElement = elementList.get(j);
                SequenceElement secondElement = elementList.get(j+1);
                if (firstElement.getValue() > secondElement.getValue()) {
                    swap(j + 1, j, secondElement);
                }
            }
        }
        updateSortedIndex();
    }

    private void swap(int oldPosition, int newPosition, SequenceElement newElement) {
        elementList.remove(oldPosition);
        elementList.add(newPosition, newElement);
    }

    private void updateSortedIndex(){
        int sortedIndex = 0;
        for (SequenceElement sequenceElement: elementList){
            sequenceElement.setSortedIndex(sortedIndex);
            sortedIndex++;
        }
    }

    public Sequence getFilterSequence() {
        List<SequenceElement> filteredElementList = new ArrayList<>();
        for(SequenceElement element: elementList){
            if(element.getOffset() >= 0){
                filteredElementList.add(element);
            }
        }
        return new Sequence(filteredElementList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Element List: \n");
        for(SequenceElement element: elementList) {
            sb.append(element.toString());
        }
        return sb.toString();

    }
}

