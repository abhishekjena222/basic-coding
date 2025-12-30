package org.example.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram { //a word or phrase made by transposing the letters of another word or phrase
//    The word "secure" is an anagram of "rescue."
    //anagrammed the letters of "battle" to form "tablet"
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));;

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charMap = new HashMap<>();
        for (char sChar : s.toCharArray()){
            if (charMap.containsKey(sChar)) {
                charMap.replace(sChar, charMap.get(sChar) + 1);
            } else {
                charMap.put(sChar, 1);
            }
            System.out.println(charMap);
        }

        System.out.println("--------------");
        for (char tChar : t.toCharArray()){
            if (charMap.containsKey(tChar) && charMap.get(tChar) > 0){
                charMap.replace(tChar, charMap.get(tChar) - 1);
            } else {
                return false;
            }
            System.out.println(charMap);
        }
        return true;
    }
}
