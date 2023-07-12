package openlab2;

import java.util.Scanner;

public class small_larg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The smallest element is : "+arr[0]);
        System.out.print("The largest element is : "+arr[n-1]);

    }
}
