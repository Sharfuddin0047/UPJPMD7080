package lab2;

import java.util.Scanner;

public class SortArray {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        printArray(arr);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        sc.close();
    }
}
