package org.example;

public class Solution {
    public boolean isPalindrome(int x) {
        char[] charArray = String.valueOf(x).toCharArray();

        if (charArray.length == 2 && charArray[0] != charArray[1]) {
            return false;
        }

        int leftIndex = 0;
        for (int rightIndex = charArray.length - 1; rightIndex > charArray.length / 2 - 1; rightIndex--) {
            if (charArray[leftIndex] != charArray[rightIndex]) {
                return false;
            }
            leftIndex++;
        }
        return true;
    }
}
