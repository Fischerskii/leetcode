package org.example;

public class Solution {
    public int mySqrt(int x) {
        double approximate = (double) x / 2;
        double previewApproximate = 0;
        while (approximate * approximate != x) {
            approximate = (approximate + x/approximate) / 2;

            if (approximate * approximate < x || approximate == previewApproximate) break;
            previewApproximate = approximate;
        }
        return (int) approximate;
    }
}
