package org.example.practice.arrays;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num,numFreq.getOrDefault(num, 0) + 1);
        }
        System.out.println(numFreq);

        List<Integer>[] freqBucket = new List[nums.length+1];
        for (Integer i : numFreq.keySet()) {
            int f = numFreq.get(i);
            if (freqBucket[f] == null){
                freqBucket[f] = new ArrayList<>();
            }
            freqBucket[f].add(i);
        }

        System.out.println(Arrays.toString(freqBucket));
        System.out.println(freqBucket.length);
        List<Integer> result = new ArrayList<>();
        for (int i = freqBucket.length - 1; i>=0 && result.size() < k; i--){
            if (freqBucket[i] != null){
                for (int i1 = 0; i1 < freqBucket[i].size(); i1++) {
                    if (result.size() < k){
                        result.add(freqBucket[i].get(i1));
                    }
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
