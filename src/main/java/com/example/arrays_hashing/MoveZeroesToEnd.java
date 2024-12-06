package com.example.arrays_hashing;


import java.util.Arrays;

/**
 * Problem: Given an integer array nums, move all the zeros to the end of the array while maintaining the relative order of the non-zero elements.
 * Input: nums = [0, 1, 0, 3, 12]
 * Output: [1, 3, 12, 0, 0]
 */

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveToZero(nums);
    }

    private static void moveToZero (int[] nums){
        int numsNotZero =  0;

        for(int num: nums){
            if(num != 0){
                nums[numsNotZero++] = num;
            }
        }

        for( int i = numsNotZero; i < nums.length; i++){
            nums[i]=0;
        }
        System.out.println(numsNotZero + "  - MoveZeroesToEnd.moveToZero: " + Arrays.toString(nums));
    }
}
