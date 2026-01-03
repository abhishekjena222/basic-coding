package org.example.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(repeatedNTimes(arr));
    }


    public static int repeatedNTimes(int[] nums) {
//        Map<Integer,Integer> numFreq = new HashMap<>();
//        for (int num : nums){
//            if (numFreq.containsKey(num)){
//                numFreq.replace(num, numFreq.get(num) + 1);
//            } else {
//                numFreq.put(num, 1);
//            }
//            int length = nums.length;
//            for (int keyNum : numFreq.keySet()){
//                if (numFreq.get(keyNum) * 2 == length){
//                    return keyNum;
//                }
//            }
//        }
//        return 0;

        HashSet<Integer> intSet = new HashSet<>();
        for (int num : nums){
            if (intSet.contains(num)){
                return num;
            } else {
                intSet.add(num);
            }
        }
        return 0;
    }
}
