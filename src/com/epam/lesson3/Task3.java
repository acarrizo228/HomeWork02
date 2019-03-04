package com.epam.lesson3;

public class Task3 {
    public static void main(String[] args) {

        int line = 1;
        while (line < 10){
            int value = line;
            while(value > 0) {
                System.out.print(value);
                value--;
            }
            System.out.println();
            line++;
        }
    }
}
