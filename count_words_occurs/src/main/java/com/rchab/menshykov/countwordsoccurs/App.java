package com.rchab.menshykov.countwordsoccurs;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String text = "This is very canon very some is simple rule is text.";
        Multiset<Word> wordsSet = HashMultiset.create();
        for (String value : Arrays.asList(text.split("\\s+"))) {
            Word word = new Word(value, SynonymUtils.getKeywordIfExist(value));
        }

        List<Multiset.Entry<Word>> sortedList = Lists.newArrayList(wordsSet.entrySet());
        Collections.sort(sortedList, new Descending());
        for (Multiset.Entry<Word> stringEntry : sortedList) {
            System.out.println(stringEntry.getElement() + ": " + stringEntry.getCount());
        }
    }

    private static class Descending implements Comparator<Multiset.Entry<?>> {
        @Override
        public int compare(final Multiset.Entry<?> a, final Multiset.Entry<?> b){
            return Ints.compare(b.getCount(), a.getCount());
        }
    }
}
