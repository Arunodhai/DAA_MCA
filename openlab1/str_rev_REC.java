package openlab1;

import java.util.Scanner;

public class str_rev_REC {
    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);

        }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
