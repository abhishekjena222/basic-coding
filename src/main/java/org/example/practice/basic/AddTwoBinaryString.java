package org.example.practice.basic;

public class AddTwoBinaryString {

    public static void main(String[] args) {
        String a = "011011";
        String b = "1010111";
        System.out.println(addUsingMethods(a,b));
        System.out.println(addBruteforce(a,b));
    }

    public static String addUsingMethods(String a, String b){
        int i = Integer.parseInt(a,2);
        int j = Integer.parseInt(b,2);
        System.out.printf("i = %d, j = %d\n",i,j);
        i+=j;
        return Integer.toBinaryString(i);
    }

    public static String addBruteforce(String x, String y){
        int i = x.length() - 1;
        int j = y.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0){
                sum += x.charAt(i) - '0';
            }
            if (j >= 0){
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1){
                result.append(sum);
                carry = 0;
            } else if (sum == 2) {
                result.append("0");
                carry = 1;
            } else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1){
            result.append("1");
        }

        return result.reverse().toString();
    }
}
