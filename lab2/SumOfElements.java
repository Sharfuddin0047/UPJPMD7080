package lab2;

/*
You are supposed to take user input from user and create an array
1. sum of all elements
*/
import java.util.Scanner;

public class SumOfElements {
    public static int getSum(int[] arr) {
        int sum=0;
        for(int x: arr) {
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the value: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Total sum of elements is: "+getSum(arr));
        sc.close();
    }
}
