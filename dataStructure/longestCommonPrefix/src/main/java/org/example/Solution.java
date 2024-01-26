package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        short learnItem = 0;
        boolean flag = false;
        char currentSymbol;
        if (!strs[0].isEmpty()) {
            currentSymbol = strs[0].charAt(0);
        } else {
            return "";
        }
        List<Character> intermediatePrefixList = new ArrayList<>();
        int arrayItem = 0;
        while (arrayItem < strs.length) {

            if (arrayItem == 0) {
                currentSymbol = strs[arrayItem].charAt(learnItem);
            }

            if (strs[arrayItem].length() == learnItem) {
                flag = true;
            }

            if (arrayItem == strs.length - 1 && flag) {
                break;
            }

            if (strs[arrayItem].length() <= learnItem) {
                break;
            }

            if (currentSymbol != strs[arrayItem].charAt(learnItem)) {
                if (intermediatePrefixList.isEmpty()) {
                    return "";
                } else {
                    break;
                }
            }

            if (arrayItem == strs.length - 1) {
                arrayItem = 0;
                intermediatePrefixList.add(currentSymbol);
                if (learnItem < strs[arrayItem].length() - 1) {
                    learnItem++;
                } else {
                    break;
                }
            } else {
                arrayItem++;
            }
        }
        return intermediatePrefixList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}