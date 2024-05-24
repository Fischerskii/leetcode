package org.example;

public class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] == 9) {
             return incDigits(digits, lastIndex);
        } else {
            digits[digits.length - 1]++;
            return digits;
        }
    }

    public int[] incDigits(int[] digits, int index) {
        digits[index] = 0;
        if (index == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        } else if (digits[index - 1] == 9) {
            return incDigits(digits, index - 1);
        }
        digits[index - 1]++;
        return digits;
    }
}
