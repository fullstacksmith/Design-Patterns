package com.example.arrays_hashing;

/**
 * Problem: Given an integer array nums, return true if the array is sorted in ascending order, otherwise return false.

 * Example:
 * plaintext
 * Copiar código
 * Input: nums = [1, 2, 3, 4, 5]
 * Output: true

 * Input: nums = [5, 3, 1, 2, 4]
 * Output: false
 */
public class CheckArraySortedOrder {
    public static void main(String[] args) {
        int[] numsFalse = {1, 6, 3, 4, 5};
        isSorted(numsFalse);

        int[] numsTrue = {1, 2, 3, 4, 5};
        isSorted(numsTrue);

    }

    private static void isSorted(int[] nums) {
        String result = "true";
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                 result = "false";
                break;
            }
        }
        System.out.println("CheckArraySortedOrder.isSorted: " + result);

    }
}
