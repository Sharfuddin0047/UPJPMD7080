package lab3;

/*
Sum of each row and each columns
*/
import java.util.Scanner;

public class RowSumColumnSum {
    public static void printRowColumnSum(int[][] arr) {
        int row=arr.length;
        int col= arr[0].length;

        int rowSum=0;
        int colSum=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Row "+i+" sum = "+rowSum);
            rowSum=0;
        }

        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                colSum+=arr[i][j];
            }
            System.out.println("Col "+i+" sum = "+colSum);
            colSum=0;
        }
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
        printRowColumnSum(arr);
        sc.close();
    }
}
