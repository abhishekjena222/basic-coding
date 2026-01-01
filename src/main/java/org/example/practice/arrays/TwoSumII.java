package org.example.practice.arrays;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
//        while (i<j && j < numbers.length) {
//            if (numbers[i] + numbers[j] < target){
//                j++;
//            } else if (numbers[i] + numbers[j] > target) {
//                i++;
//            } else {
//                return new int[]{i+1,j+1};
//            }
//        }
        for (int j = 1; j < numbers.length; j++) {
            for (int i = 0; i < j; i++) {
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }

        return new int[]{};
    }
}
