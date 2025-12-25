package org.example.practice.basic;

import java.util.Arrays;

public class MinMaxFromArrayLeastComarison {
    public static void main(String[] args) {
        int[] arr = {2,6,5,3,9,8,1};
        int length = arr.length;
        minMax(arr, length);
    }

    public static void minMax(int[] arr, int length){
        int min;
        int max;
        int i;

        if (length % 2 == 0){
            if (arr[0] > arr[1]) {
                min = arr[1];
                max = arr[0];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        } else {
            max = arr[0];
            min = arr[0];
            i = 1;
        }


        System.out.println(i + " "+length+" "+(length - 1));
        while (i < length - 1){
            System.out.println(arr[i] +" "+ arr[i + 1]);
            if (arr[i] > arr[i + 1]){
                if (max < arr[i]) max = arr[i];
                if (min > arr[i + 1]) min = arr[i + 1];
            } else {
                if (max < arr[i + 1]) max = arr[i + 1];
                if (min > arr[i]) min = arr[i];
            }
            i+=2;
        }

        System.out.println("arr: "+ Arrays.toString(arr));
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}
