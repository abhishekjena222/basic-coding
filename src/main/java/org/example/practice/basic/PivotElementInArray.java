package org.example.practice.basic;

import java.util.Arrays;

public class PivotElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        pivot(arr);
    }

    public static void pivot(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }

        int left = 0;
        int right;
        int i;

        for (i = 0; i < arr.length; i++) {
            right = sum - left - arr[i];
            if (right == left) break;

            left += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("the pivot element is "+ arr[i]+" at index "+i);

    }
}
