package lab3;

/*
count how many even and how many odd numbers are present in 2D arry
*/
import java.util.Scanner;

public class CountEvenOdd {
    public static void printEvenOddCount(int[][] arr){
        int evenCount =0;
        int oddCount=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>=0 && arr[i][j]%2==0){
                    evenCount++;
                } else if(arr[i][j]>=0 && arr[i][j]%2!=0) {
                    oddCount++;
                }
            }
        }
        System.out.println("count of odd numbers: "+oddCount);
        System.out.println("count of even numbers: "+evenCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("===================================");
        printEvenOddCount(arr);
        sc.close();
    }
}
