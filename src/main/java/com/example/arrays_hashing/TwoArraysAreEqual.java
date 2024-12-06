package com.example.arrays_hashing;

import java.util.Arrays;

/**
 * 3. Check if Two Arrays are Equal (Ignoring Order)
 * Problem: Given two integer arrays arr1 and arr2, return true if they contain the same elements (even if the order is different), otherwise return false.
 * Example:
 * plaintext
 * Input: arr1 = [1, 2, 3], arr2 = [3, 1, 2]
 * Output: true
  * Input: arr1 = [1, 2, 3], arr2 = [4, 5, 6]
 * Output: false
 */
public class TwoArraysAreEqual {
    public static void main(String[] args) {
        //equals:
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        if(arr1.length != arr2.length) System.out.println("TwoArraysAreEqual.main: " + false);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("TwoArraysAreEqual.main: " +Arrays.equals(arr1, arr2));
    }
}
