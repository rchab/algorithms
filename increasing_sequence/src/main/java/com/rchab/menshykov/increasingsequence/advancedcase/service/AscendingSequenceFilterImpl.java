package com.rchab.menshykov.increasingsequence.advancedcase.service;

import com.rchab.menshykov.increasingsequence.advancedcase.Sequence;

import java.util.List;

public class AscendingSequenceFilterImpl implements AscendingSequenceFilter {

    @Override
    public List<Integer> filterSequence(List<Integer> sequence) {
        Sequence elementSequence = new Sequence(sequence);
        return elementSequence.getLastSequenceElement().getIntegerSequent();
    }
}
