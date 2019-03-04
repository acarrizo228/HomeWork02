package com.epam.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number >> ");
        int number = sc.nextInt();

        switch (number){
            default:
                System.out.println("What is the number?");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        System.out.println("Good bye :)");

    }
}
