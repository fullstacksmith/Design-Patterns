package com.example.arrays_hashing;

/**
 * 6. Find the Majority Element
 * Problem: Given an array nums of size n, return the element that appears more than n/2 times. Assume such an element always exists.
 * Example:
 * plaintext
 * Input: nums = [3, 2, 3]
 * Output: 3
 */

public class MajorityElement {

    public static void main(String[] args) {
        int [] nums = {3, 2, 3};

        System.out.println("MajorityElement: " + getMajorityElement(nums));
    }

    private static int getMajorityElement(int[] nums){
        int count = 0;
        int majority = 0;
        for (int num : nums) {

            if (count == 0) {
                majority = num;
            }

            count += (num == majority) ? 1 : -1;
        }
        return majority;
    }

}
