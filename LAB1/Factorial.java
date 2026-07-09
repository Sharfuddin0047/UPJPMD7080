package LAB1;
/*
Q7. Factorial of a Number
Write a Java program to take a number from the user and find its factorial using a for loop.
*/

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the Factorial: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid input , Enter a positive value: ");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
        sc.close();
    }
}
