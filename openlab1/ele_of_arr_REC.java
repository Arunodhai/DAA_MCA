package openlab1;

import java.util.Scanner;

public class ele_of_arr_REC {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array elements are : ");
        printArray(arr, 0);;
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
}
