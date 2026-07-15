package lab2;
/*
You are supposed to take user input from user and create an array
2. print the reverse array of string
eg: [Banana, Mango, Apple]
o/p: [Apple, Mango, Banana]
*/
import java.util.Scanner;

public class ReverseArrayPrint {
    public static void printInReverse(String[] arr){
        System.out.print("[");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        String[] arr = new String[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the value: ");
            arr[i]=sc.next();
        }
        printInReverse(arr);
        sc.close();
    }
}
