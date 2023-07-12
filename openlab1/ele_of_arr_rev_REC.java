package openlab1;

import java.util.Scanner;

public class ele_of_arr_rev_REC {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are : ");
        printArrayReverse(arr, 0);
    }

    public static void printArrayReverse(int[] arr, int index) {
        if (index < arr.length) {
            printArrayReverse(arr, index + 1);
            System.out.print(arr[index] + " ");
        }
    }
}
