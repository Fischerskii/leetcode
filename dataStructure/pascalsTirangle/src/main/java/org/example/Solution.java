package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalsTriangle = new ArrayList<>() {{add(new ArrayList<>() {{add(1);}});}};
        if (numRows == 2) {
            pascalsTriangle.add(new ArrayList<>(Collections.nCopies(2, 1)));
        } else if (numRows > 2) {
            for (int externalArrayCell = 1; externalArrayCell < numRows; externalArrayCell++) {
                pascalsTriangle.add(new ArrayList<>(Collections.nCopies(pascalsTriangle.get(externalArrayCell - 1).size() + 1, 1)));
                for (int internalArrayCell = 1; internalArrayCell < pascalsTriangle.get(externalArrayCell).size() - 1; internalArrayCell++) {
                    pascalsTriangle.get(externalArrayCell)
                            .set(internalArrayCell, calculatingSumTwoHighestNumbers(pascalsTriangle, externalArrayCell, internalArrayCell));
                }
            }
        }
        System.out.println(pascalsTriangle);
        return pascalsTriangle;
    }

    private int calculatingSumTwoHighestNumbers(List<List<Integer>> twoDimensionalArray,
                                                int externalArrayCell, int internalArrayCell) {
        return twoDimensionalArray.get(externalArrayCell - 1).get(internalArrayCell - 1)
                + twoDimensionalArray.get(externalArrayCell - 1).get(internalArrayCell);
    }
}
