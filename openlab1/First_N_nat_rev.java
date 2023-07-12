package openlab1;

import java.util.Scanner;

public class First_N_nat_rev {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
