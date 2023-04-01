package org.example;

import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        byte sudokuSize = 9;

        for (byte i = 0; i < sudokuSize; i++) {

            Set<Character> setByRows = new HashSet<>(sudokuSize);
            Set<Character> setByColumns = new HashSet<>(sudokuSize);
            Set<Character> setBySquare = new HashSet<>(sudokuSize);
            int charactersNotEqualDotRows = 0;
            int charactersNotEqualDotColumns = 0;

            for (byte j = 0; j < sudokuSize; j++) {
                if (board[i][j] != '.') charactersNotEqualDotRows++;
                if (board[j][i] != '.') charactersNotEqualDotColumns++;
                setByRows.add(board[i][j]);
                setByColumns.add(board[j][i]);

                int charactersNotEqualDotSquare = 0;
                //subsquare analysis
                if (i % 3 == 0 && j % 3 == 0) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (board[i + k][j + l] != '.') charactersNotEqualDotSquare++;
                            setBySquare.add(board[i + k][j + l]);
                        }
                    }

                    //check square
                    if (uniquenessCheck(sudokuSize, setBySquare, charactersNotEqualDotSquare)) return false;
                }
                setBySquare.clear();
            }

            //check rows
            if (uniquenessCheck(sudokuSize, setByRows, charactersNotEqualDotRows)) return false;

            //check columns
            if (uniquenessCheck(sudokuSize, setByColumns, charactersNotEqualDotColumns)) return false;
        }

        return true;
    }

    private boolean uniquenessCheck(byte sudokuSize, Set<Character> subjectOfVerification, int charactersNotEqualDot) {
        if (charactersNotEqualDot < sudokuSize) charactersNotEqualDot++;
        return charactersNotEqualDot != subjectOfVerification.size();
    }
}
