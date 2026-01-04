package org.example.practice.arrays;

import java.util.Arrays;

public class FourDivisors {
    public static void main(String[] args) {
        int[] arr = {1,3,7,21};
        System.out.println(Arrays.toString(arr));
        System.out.println(sumFourDivisors(arr));
    }

    public static int sumFourDivisors(int[] nums) {
        int result = 0;
        int count, sum;
        for (int num : nums) {
            count = 0; sum = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    sum += i;
                    if (count>4) break;
                }
            }
            if (count == 4){
                result += sum;
            }
        }
        return result;
    }
}
