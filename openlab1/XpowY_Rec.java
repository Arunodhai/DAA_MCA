package openlab1;

import java.util.Scanner;

public class XpowY_Rec {
    public static void main(String[] args) {
        int x,pow,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for X : ");
        x = sc.nextInt();
        System.out.print("Enter the value for Y : ");
        y = sc.nextInt();
        pow=POW(x,y);
        System.out.println("The answer is : "+pow);
    }

    private static int POW(int x, int y) {
        if(y!=0){
            return 2 *POW(x,y-1);
        }
        else
            return 1;
    }
}
