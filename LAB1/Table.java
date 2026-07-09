package LAB1;
/*
Q5. Multiplication Table Using For Loop
Write a Java program to take a number from the user and print its multiplication table from 1 to 10 using a for loop.

*/

import java.util.Scanner;

public class Table {
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer value to print Table: ");
        int num = sc.nextInt();
        printTable(num);
        sc.close();
    }
}
