package lab2;

/*
You are supposed to take user input from user and create an array
3. find the largest element in array
*/

import java.util.Scanner;

public class LargestElement {
    public static void printLargestElement(int[] arr) {
        int max=arr[0];
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println("Largest Element is: "+max);
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
        printLargestElement(arr);
        sc.close();
    }
}
