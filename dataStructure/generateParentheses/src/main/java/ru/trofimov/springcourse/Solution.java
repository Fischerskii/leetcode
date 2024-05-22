package ru.trofimov.springcourse;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        recursion(parenthesis, "", 0, 0, n);
        return parenthesis;
    }

    public void recursion(List<String> parenthesis, String curr, int open, int close, int n) {

        if (n*2 == curr.length()) {
            parenthesis.add(curr);
            return;
        }

        if (open < n) {
            recursion(parenthesis, curr + "(", open + 1, close, n);
        }

        if (close < open) {
            recursion(parenthesis, curr + ")", open, close + 1, n);
        }
    }
}