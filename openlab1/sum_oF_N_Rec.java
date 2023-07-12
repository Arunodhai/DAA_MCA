package openlab1;

import java.util.Scanner;

public class sum_oF_N_Rec {

    public static int sumOfN(int n){
        if(n!=0){
            return n + sumOfN(n-1);
        }
        else
            return n;
    }
    public static void main(String[] args) {
        int n ,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        sum=sumOfN(n);
        System.out.println("The sum is : "+sum);
    }



}
