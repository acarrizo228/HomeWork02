package com.epam.lesson3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;
        final int TEN = 10;

        number = number < 0 ? -number : number;
        while (number > 0){
            int temp = number % TEN;
            sum += temp * temp;
            number /= TEN;
            System.out.println(number + " " + temp + " " + sum);
        }
        System.out.println("Sum = " + sum);
    }
}
