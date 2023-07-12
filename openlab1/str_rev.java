package openlab1;

import java.util.Scanner;

public class str_rev {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        str= sc.nextLine();
        char[] chars = str.toCharArray();
        System.out.println("The reversed string is : ");
        for (int i = (str.length())-1; i >=0; i--) {
            System.out.print(chars[i]);

        }
    }
}
