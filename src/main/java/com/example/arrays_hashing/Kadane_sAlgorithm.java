package com.example.arrays_hashing;

/**
 * 5. Find the Maximum Subarray Sum (Kadane's Algorithm)
 * Problem: Given an integer array nums, find the contiguous subarray with the largest sum and return the sum.
  * Example:
 * plaintext
 * Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: [4, -1, 2, 1] has the largest sum = 6.
 */
public class Kadane_sAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Kadane_sAlgorithm: " + kadane_sAlgorithm(nums));
    }

    private static int kadane_sAlgorithm(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
