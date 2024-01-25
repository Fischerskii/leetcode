package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        char[] romanNumbers = s.toCharArray();

        Map<Character, Integer> numbers = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for (int i = 0; i < romanNumbers.length; i++) {
            int currentNum = numbers.get(romanNumbers[i]);
            int prevNum = 0;

            if (i < romanNumbers.length - 1) {
                prevNum = numbers.get(romanNumbers[i + 1]);
            }

            if (prevNum > currentNum) {
                result += prevNum - currentNum;
                i++;
            } else {
                result += currentNum;
            }
        }
        return result;
    }
}
