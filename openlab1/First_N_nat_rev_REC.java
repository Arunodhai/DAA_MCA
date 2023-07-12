package openlab1;

import java.util.Scanner;

public class First_N_nat_rev_REC {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        print_N_Nat(n);
    }

    private static void print_N_Nat(int n) {
        if(n!=0){
            System.out.print(n);
            System.out.print(" ");
            print_N_Nat(n-1);
        }
    }
}
