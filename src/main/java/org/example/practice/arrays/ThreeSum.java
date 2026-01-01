package org.example.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
//        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr = {-2, 0, 0, 0, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> listOfList = new ArrayList<>();
        int left,right;
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            left = i + 1;
            right = length - 1;

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while (left < right){
                if (nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    listOfList.add(triplet);
                    left++;right--;

                    while (left<right && nums[left] == nums[left-1]) left++;
                    while (left<right && nums[right] == nums[right+1]) right--;


                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
            }
        }

        return listOfList;
    }
}
