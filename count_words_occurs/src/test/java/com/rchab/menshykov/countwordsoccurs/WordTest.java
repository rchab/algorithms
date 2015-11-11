package com.rchab.menshykov.countwordsoccurs;

import org.junit.Assert;
import org.junit.Test;

public class WordTest {

    @Test
    public void testToString() throws Exception {
        Word word = new Word("test", "keyword");
        Assert.assertEquals("test", word.toString());
        Assert.assertNotEquals("notTest", word.toString());
    }

    @Test
    public void testEqualsSameKeywords() throws Exception {
        Word word1 = new Word("test1", "keyword");
        Word word2 = new Word("test2", "keyword");
        Word word3 = new Word("test2", "otherKeyword");
        Assert.assertTrue(word1.equals(word2));
        Assert.assertFalse(word1.equals(word3));
        Assert.assertFalse(word2.equals(word3));
    }

    @Test
    public void testEqualsSameValue() throws Exception {
        Word word1 = new Word("test", null);
        Word word2 = new Word("test", null);
        Assert.assertTrue(word1.equals(word2));
    }

    @Test
    public void testEqualsWithKeywordNull() throws Exception {
        Word word1 = new Word("test", "keyword");
        Word word2 = new Word("test", null);
        Assert.assertFalse(word1.equals(word2));
    }

    @Test
    public void testHashCode() throws Exception {

    }
}
