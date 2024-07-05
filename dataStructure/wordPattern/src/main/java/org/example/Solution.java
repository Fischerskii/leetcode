package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patternChars = pattern.toCharArray();
        String[] words = s.split(" ");

        if (patternChars.length != words.length) {
            return false;
        }

        Map<Character, String> patternLike = new HashMap<>();
        for (int i = 0; i < patternChars.length; i++) {
            if (!patternLike.containsKey(patternChars[i]) && !patternLike.containsValue(words[i])) {
                patternLike.put(patternChars[i], words[i]);
            } else if ((patternLike.containsKey(patternChars[i]) && !patternLike.get(patternChars[i]).equals(words[i]))
                    || (!patternLike.containsKey(patternChars[i]) && patternLike.containsValue(words[i]))
            ) {
                return false;
            }
        }

        return true;
    }
}
