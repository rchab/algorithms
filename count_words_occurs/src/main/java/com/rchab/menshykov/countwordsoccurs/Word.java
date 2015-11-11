package com.rchab.menshykov.countwordsoccurs;

public class Word {

    private String value;

    private String keyword;

    public Word(String value, String keyword) {
        this.value = value;
        this.keyword = keyword;
    }

    public String getValue() {
        return value;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;

        Word word = (Word) o;
        if (keyword == null && word.keyword == null) {
            if (!value.equals(word.value)) return false;
        } else {
            if (!keyword.equals(word.keyword)) return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + keyword.hashCode();
        return result;
    }
}
