package openlab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        if(n==0){
            System.out.println("The factorial is : "+fact);

        }
        else if(n==1){
            System.out.println("The factorial is : "+fact);
        }
        else
            {

            for (int i = 1; i <=n ; i++) {
                fact=fact*i;
            }
                System.out.println("The factorial is : "+fact);
        }
    }
}
