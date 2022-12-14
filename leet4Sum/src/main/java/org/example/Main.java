package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> leet4Sum = new RecursionSolution().result(new int[]{1,0,-1,0,-2,2}, 0);
        System.out.println(leet4Sum);
    }
}