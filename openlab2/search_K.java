package openlab2;

import java.util.Scanner;

public class search_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to be searched for : ");
        int k = sc.nextInt();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == k) {
                flag = 1;
                break;
            }
        }

         if(flag==1){
        System.out.println("Element Found"); }
}
}
