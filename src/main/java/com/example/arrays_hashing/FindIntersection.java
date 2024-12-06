package com.example.arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        System.out.println("FindIntersection: " + Arrays.toString(finIntersection(arr1, arr2)));
    }

    private static int[] finIntersection(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num: arr1) {
            set1.add(num);
        }

        for(int num2: arr2){
            if(set1.contains(num2)){
                result.add(num2);
            }
        }

        int[] intersection =new int[result.size()];
        int index = 0;

        for (int numResult : result){
            intersection[index++] = numResult;
        }
        return intersection;
    }
}
