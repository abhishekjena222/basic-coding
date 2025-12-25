package org.example.practice.basic;

import java.util.Arrays;

public class SortArrayOf0s1s2s {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,1,1,0,2,2,2};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArr(int[] arr){
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                two++;
            }
            else if (arr[i] == 1) {
                one++;
            }
            else {
                zero++;
            }
        }

        int length = arr.length - 1;

        while (two>0){
            arr[length--] = 2;
            two--;
        }

        while (one>0){
            arr[length--] = 1;
            one--;
        }

        while (zero>0){
            arr[length--] = 0;
            zero--;
        }
    }
}
