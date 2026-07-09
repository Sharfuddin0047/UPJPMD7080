package LAB1;
/*
	
Q1. Calculator Using Operators
Write a Java program to take two numbers and an operator (+, -, *, /, %) as input from the user and perform the selected operation using conditional statements.
*/

import java.util.Scanner;

public class Calculator {
    public static void calculator(int a, int b, char c) {
        switch (c) {
            case '+':
                System.out.println("sum is : " + (a + b));
                break;
            case '-':
                System.out.println("sum is : " + (a - b));
                break;

            case '*':
                System.out.println("sum is : " + (a * b));
                break;

            case '/':
                System.out.println("sum is : " + (a / b));
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second value: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator from ( + , - , * , / )");
        char c = sc.next().charAt(0);

        calculator(a, b, c);
        sc.close();
    }
}
