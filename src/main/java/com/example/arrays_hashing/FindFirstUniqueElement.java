package com.example.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the First Unique Element
 * Problem: Given an integer array nums, return the first unique element in the array. If there are no unique elements, return -1.

 * Example:
 * plaintext
 * Copiar código
 * Input: nums = [4, 5, 1, 2, 0, 4, 1]
 * Output: 5
 */
public class FindFirstUniqueElement {
    public static void main(String[] args) {
      int[] nums = {4, 5, 1, 2, 0, 4, 1};
        System.out.println("FindFirstUniqueElement.main: " +haveUniqueElement(nums));
    }

    private static int haveUniqueElement(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for(int num: nums){
            if(countMap.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
}
