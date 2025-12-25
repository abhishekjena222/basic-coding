package org.example.practice.basic;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,9};
        int[] arr2 = {3,4,5,6,9};
        int[] arr3 = new int[arr1.length + arr2.length];
        addSortedArr(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void addSortedArr(int[] arr1, int[] arr2, int[] arr3){
        int i = 0, j = 0, k = 0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i] <= arr2[j]){
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            }
        }

        while (i < arr1.length){
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length){
            arr3[k++] = arr2[j++];
        }

    }
}
