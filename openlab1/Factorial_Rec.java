package openlab1;

import java.util.Scanner;

public class Factorial_Rec {
    public static void main(String[] args) {
        int n,fact;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        fact=FACT(n);
        System.out.println("Factorial : "+fact);
    }

    private static int FACT(int n) {
        if(n!=0){
            return n*FACT(n-1);
        }
        else return 1;
    }

}
