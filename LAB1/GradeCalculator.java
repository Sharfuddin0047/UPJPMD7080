package LAB1;
/*
Q4. Student Grade Calculator
Write a Java program to take marks of a student as input and display the grade according to the following conditions:

90 and above → Grade A
75 to 89 → Grade B
60 to 74 → Grade C
Below 60 → Grade D
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void gradingCalculator(int num) {
        if (num >= 90 && num <= 100) {
            System.out.println(num + " -> Grade A");
        } else if (num >= 75 && num <= 89) {
            System.out.println(num + " -> Grade B");
        } else if (num >= 60 && num <= 74) {
            System.out.println(num + " -> Grade C");
        } else {
            System.out.println(num + " -> Grade D");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number in integer greater (0 <= num <= 100)");
        int num = sc.nextInt();
        gradingCalculator(num);
        sc.close();
    }
}
