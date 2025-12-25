package org.example.practice.basic;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 4, b = 8;
        System.out.printf("a = %d, b = %d\n",a,b);

        int tmp = b;
        b = a;
        a = tmp;

        System.out.printf("a = %d, b = %d",a,b);
    }
}
