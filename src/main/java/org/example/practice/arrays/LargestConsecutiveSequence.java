package org.example.practice.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(longestConsecutive(arr));

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        int largest = 0;

        for (Integer i : numsSet) {

            if (!numsSet.contains(i-1)){
                int currentNum = i;
                int currentStreak = 1;

                while (numsSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                largest = Math.max(largest, currentStreak);
            }

        }

        return largest;
    }
}
