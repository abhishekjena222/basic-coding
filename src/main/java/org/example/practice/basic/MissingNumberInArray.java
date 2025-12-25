package org.example.practice.basic;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = findLargest(arr);
        findMissingNum(arr, n);
        findUsingJustArr(arr);
    }

    public static void findUsingJustArr(int[] arr){
        int sum = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum = sum + i+1;
//            sum = sum - arr[i];
        }

        System.out.println("(without n) the missing number is "+sum);
    }

    public static void findMissingNum(int[] arr, int n){
        int sum = n*(n+1)/2;

        for(int i = 0; i<arr.length; i++){
            sum -= arr[i];
        }

        System.out.println("the missing number is "+sum);

    }

    public static int findLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            max = Math.max(j, max);
        }
        return max;
    }
}
