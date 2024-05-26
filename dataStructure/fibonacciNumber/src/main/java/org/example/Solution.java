package org.example;

public class Solution {
    public int fib(int n) {
        int result = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int onePreview = 0;
        int twoPreview = 1;
        for (int i = 2; i <= n; i++) {
            result = onePreview + twoPreview;
            onePreview = twoPreview;
            twoPreview = result;
        }
        return result;
    }
}
