package org.example.practice.arrays;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strArr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.toString(strArr));
        System.out.println(groupAnagrams(strArr));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String >> stringListMap = new HashMap<>();
        for (String st : strs){
            char[] chars = st.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!stringListMap.containsKey(key)){
                stringListMap.put(key, new ArrayList<>());
            }
            stringListMap.get(key).add(st);
        }

        return new ArrayList<>(stringListMap.values());
    }
}
