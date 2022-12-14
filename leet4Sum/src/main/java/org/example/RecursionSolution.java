package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RecursionSolution {

    private final static int SUBARRAY_SIZE = 4;
    public List<List<Integer>> result(int[] nums, int target) {
        List<List<Integer>> appropriateCombination = new ArrayList<>();

        int[] initializedArray = subarrayFirstInitialization(nums);

        for (int currentCell = 0; currentCell < SUBARRAY_SIZE; currentCell++) {
            List<List<Integer>> subarrayForCurrentIteration = new ArrayList<>();


            List<List<Integer>> currentElementMatches = new ArrayList<>();
            int iterationPass = currentCell < target ? currentCell : 0;
            for (int i = (target - iterationPass); i < nums.length; i++) {
                if (busyCellsSkipper(currentCell, i)) continue;

                initializedArray[currentCell] = nums[i];
                int currentIterationSum = Arrays.stream(initializedArray).sum();
                if (currentIterationSum == target) {
                    currentElementMatches.add(converterArrayToList(initializedArray));
                }
            }
            appropriateCombination.addAll(currentElementMatches);
            if (currentCell == SUBARRAY_SIZE) {

            }
        }

        return appropriateCombination;
    }

    private int[] subarrayFirstInitialization(int[] nums) {
        int[] subarray = new int[SUBARRAY_SIZE];
        for (int i = 0; i < SUBARRAY_SIZE; i++) {
            subarray[i] = nums[i];
        }
        return subarray;
    }

    private List<List<Integer>> loopThroughOneElement(int[] nums, int[] initializedArray, int currentCell, int target) {
        List<List<Integer>> currentElementMatches = new ArrayList<>();
        int iterationPass = currentCell < target ? currentCell : 0;
        for (int i = (target - iterationPass); i < nums.length; i++) {
            if (busyCellsSkipper(currentCell, i)) continue;

            initializedArray[currentCell] = nums[i];
            int currentIterationSum = Arrays.stream(initializedArray).sum();
            if (currentIterationSum == target) {
                currentElementMatches.add(converterArrayToList(initializedArray));
            }
        }
        return currentElementMatches;
    }

    private List<Integer> converterArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int number : array) {
            list.add(number);
        }
        return list;
    }

    private boolean busyCellsSkipper(int currentCell, int iteration) {
        return iteration < SUBARRAY_SIZE && iteration != currentCell;
    }
}
