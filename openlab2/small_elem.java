package openlab2;

import java.util.Scanner;

public class small_elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int smll=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<smll){
                smll=arr[i];
            }
        }
        System.out.print("The smallest element is : "+smll);
    }
}
