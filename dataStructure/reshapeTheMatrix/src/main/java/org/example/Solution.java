package org.example;
public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] result = new int[r][c];
        int resultCount = 0, resultIndex = 0, matCount = 0, matIndex = 0;

        for (int i = 0; i < mat.length * mat[0].length; i++) {
            result[matCount][matIndex] = mat[resultCount][resultIndex];
            resultIndex++;
            matIndex++;
            if (matIndex == c) {
                matCount++;
                matIndex = 0;
            }
            if (resultIndex == mat[0].length) {
                resultCount++;
                resultIndex = 0;
            }
        }
        return result;
    }
}