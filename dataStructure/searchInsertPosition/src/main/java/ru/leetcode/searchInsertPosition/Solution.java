package ru.leetcode.searchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length;
        int low = 0;
        int mid;
        int index = nums.length;
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        while (high >= low) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }
}
