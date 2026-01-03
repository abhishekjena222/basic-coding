package org.example.practice.arrays;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int wid = right - left;
            int hit = Math.min(height[left],height[right]);
            int prod = hit * wid;

            result = Math.max(result, prod);

            if (height[left] < height[right]){
                left++;
            } else {
                right--;
            }

        }
        return result;
    }
}
