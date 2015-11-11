package com.rchab.menshykov.countwordsoccurs;

import java.util.HashMap;
import java.util.Map;

public class SynonymUtils {

    private static Map<String, String> synonymMap = new HashMap<>();

    static {
        synonymMap.put("illustration", "case");
        synonymMap.put("lesson", "case");
        synonymMap.put("case", "case");

        synonymMap.put("pattern", "rule");
        synonymMap.put("canon", "rule");
        synonymMap.put("rule", "rule");
    }

    public static String getKeywordIfExist(String word) {
        return synonymMap.get(word);
    }
}
