package LAB1;
/*
Q2. Even or Odd Number Checker
Write a Java program to take a number from the user and check whether the number is even or odd using an if-else statement.
*/

import java.util.Scanner;

public class EvenOdd {
    public static boolean evenOddChecker(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Enter positive value: ");
        } else {
            if (evenOddChecker(num)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        sc.close();
    }
}
