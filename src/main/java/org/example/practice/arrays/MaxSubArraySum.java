package org.example.practice.arrays;

//  Kadane's Algorithm
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,-3,4,5};
        sumArray(arr);
    }

    public static void sumArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum < 0) sum = 0;
        }
        System.out.println("the max sub array sum is: "+sum);
    }
}
