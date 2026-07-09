package LAB1;
/*
Q6. Sum of Numbers Using While Loop
Write a Java program to take a number from the user and calculate the sum of all numbers from 1 to that number using a while loop.
*/

import java.util.Scanner;

public class SumUptoN {
    public static int sumToN(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get sum upto that number: ");
        int num = sc.nextInt();
        System.out.println("Sum upto " + num + " is: " + sumToN(num));
        sc.close();
    }
}
