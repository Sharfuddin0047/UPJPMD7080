package LAB1;
/*
Q3. Positive, Negative, or Zero Checker
Write a Java program that takes a number as input and checks whether the number is positive, negative, or zero.
*/

import java.util.Scanner;

public class PositiveNegetiveZero {
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is negetive number");
        } else {
            System.out.println("Given number is zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        int num = sc.nextInt();
        checkNumber(num);
        sc.close();
    }
}
