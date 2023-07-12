package openlab1;

import java.util.Scanner;

public class sum_Of_N {
    public static void main(String[] args) {
        int n ,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for N : ");
        n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println("The sum is : "+sum);
    }

}
