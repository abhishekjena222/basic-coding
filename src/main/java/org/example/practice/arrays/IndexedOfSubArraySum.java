package org.example.practice.arrays;

import java.util.Arrays;

public class IndexedOfSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 12;
        findIndexes(arr, target);
    }

    public static void findIndexes(int[] arr, int target){
        int i = 0;
        int j = 0;
        int sum = 0;
        int len = arr.length;

        while (i<len && j<len){
            if (sum < target){
                sum += arr[j];
                j++;
            } else
                if (sum > target) {
                sum -= arr[i++];
            } else {
                break;
            }
        }

        System.out.println("the indexes of sub array is "+ Arrays.toString(new int[]{i+1, j}));

    }
}
