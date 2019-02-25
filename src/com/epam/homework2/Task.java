package com.epam.homework2;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        System.out.println("Enter number of task: ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        if(menu == 1) {
            int y, x;

            System.out.println("Enter y: ");
            Scanner sc1 = new Scanner(System.in);
            y = sc1.nextInt();

            System.out.println("Enter x: ");
            Scanner sc2 = new Scanner(System.in);
            x = sc2.nextInt();
            System.out.println("X1 = " + x + "; " + "Y1 = " + y);

            x = x + y;
            y = x - y;
            x = x - y;

            System.out.println("X2 = " + x + "; " + "Y2 = " + y);
        }
        else if(menu == 2){
            int number, x, y, z;

            System.out.println("Enter number: ");
            Scanner sc2 = new Scanner(System.in);
            number = sc2.nextInt();
            x = number % 10;
            y = (number - x) / 10 % 10;
            z = (number - (y * 10 + x))/100;
            int number2 = x * 100 + y * 10 + z;

            System.out.println(number + " - " + number2 + " = " + (number - number2));
        }
        else if(menu == 3){
            System.out.println("Enter Pounds: ");
            Scanner sc3 = new Scanner(System.in);
            double Pound = sc3.nextDouble();

            double Metric = Pound / 2.2046;
            int kilo = (int) Metric;

            double gramDouble = (Metric - kilo) * 1000;
            int gram =  (int) gramDouble;

            System.out.println(Pound + " Pounds = " + kilo + " Kilograms " + gram + " grams");
        }
        else if(menu == 4){
            System.out.println("Enter Deposit: ");
            Scanner sc4 = new Scanner(System.in);
            double dep = sc4.nextDouble();

            System.out.println("Enter Months: ");
            Scanner sc5 = new Scanner(System.in);
            int month = sc5.nextInt();

            System.out.println("Enter Percent: ");
            Scanner sc6 = new Scanner(System.in);
            int per = sc6.nextInt();

            double profit = (dep / 100 * per) / 12 * month;
            System.out.println("Result = " + profit);
        }
        else System.out.println("Error!!!!! You must enter number 1, 2, 3 or 4!!!!!!!");
    }
}
