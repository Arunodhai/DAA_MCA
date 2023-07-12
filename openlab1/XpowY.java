package openlab1;

import java.util.Scanner;

public class XpowY {
    public static void main(String[] args) {
        int x,pow=1,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for X : ");
        x = sc.nextInt();
        System.out.print("Enter the value for Y : ");
        y = sc.nextInt();
        for (int i = 1; i <=y ; i++) {
            pow=pow*2;
        }
        System.out.println("The answer is : "+pow);
    }
}
