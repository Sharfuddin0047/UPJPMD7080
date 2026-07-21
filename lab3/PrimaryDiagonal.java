package lab3;

/*
print the primary diagonal
*/
import java.util.Scanner;

public class PrimaryDiagonal {
    public static void printPrimaryDiagonal(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(i==j) {
                    System.out.print(arr[i][j]+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int col = sc.nextInt();
        int[][] arr= new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print("Enter the value: ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("===================================");
        printPrimaryDiagonal(arr);
        sc.close();
    }
}

