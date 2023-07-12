package openlab2;

import java.util.Scanner;

public class small_nor_larg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the value of arr : ");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        if(arr[0]>arr[1]){
            if(arr[0]>arr[2]){
                    if(arr[1]<arr[2]){
                        System.out.print("The element is : "+arr[2]);
                    }
                    else {
                        System.out.print("The element is : "+arr[1]);
                    }
            }
        }else{
            if(arr[1]>arr[2]){
                if(arr[0]<arr[2]){
                    System.out.print("The element is : "+arr[2]);
                }
                else {
                    System.out.print("The element is : "+arr[0]);
                }
            }
            else{
                    System.out.print("The element is : " + arr[1]);
                }
            }

        }

    }

