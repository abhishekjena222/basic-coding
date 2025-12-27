package org.example.practice.basic;

import java.util.HashMap;
import java.util.Map;

public class ArrayIsSubSetOfAnotherArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2};
        int[] arr2 = {1,4,4,2};
        //check weather arr2 is a subset of arr1
        findSubSet(arr1, arr2);
    }

    public static void findSubSet(int[] arr1, int[] arr2){
        Map<Integer, Integer> numberFrequency = new HashMap<>();

        for (int num : arr1){
            if (numberFrequency.get(num) == null) {
                numberFrequency.put(num,1);
            } else {
                numberFrequency.replace(num, numberFrequency.get(num) + 1);
            }
        }

        System.out.println(numberFrequency);
        boolean isSubSet = true;
        for (int num : arr2){
            if (numberFrequency.get(num) == null || numberFrequency.get(num) == 0){
                isSubSet = false;
                break;
            } else {
                numberFrequency.replace(num, numberFrequency.get(num) - 1);
            }
        }
        System.out.println(numberFrequency);

        if (isSubSet){
            System.out.println("the arr2 is a sub set of arr1");
        } else {
            System.out.println("the arr2 is not a sub set of arr1");
        }

    }
}
