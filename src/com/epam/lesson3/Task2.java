package com.epam.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int a = -10;
        int b = 5;
        int c = 0;

        if (a > b && a > c) {
            System.out.println("Max = " + a);
        } else if (b > a && b > c) {
            System.out.println("Max = " + b);
        } else {
            System.out.println("Max = " + c);
        }



        // 2
        int maxValue = a > b ? a : b;
        maxValue = maxValue > c ? maxValue : c;
        System.out.println("Max value = " + maxValue);
    }
}
