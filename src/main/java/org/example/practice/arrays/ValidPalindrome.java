package org.example.practice.arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(s);
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s.isBlank()) return true;

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        char[] charsArr = s.toCharArray();
        int length = charsArr.length;

        for (int i = 0; i < length/2; i++) {
            if (charsArr[i] != charsArr[length - 1 - i]){
                return false;
            }
        }

        return true;
    }
}
