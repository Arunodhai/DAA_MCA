package openlab1;

import java.util.Scanner;

public class ReverseNumber_REC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reversedNum = reverseNum(num);

        System.out.println("The reversed number is " + reversedNum);
    }

    public static int reverseNum(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDigit = num % 10;
            int remainingDigits = num / 10;
            return lastDigit * (int)Math.pow(10, numDigits(remainingDigits)) + reverseNum(remainingDigits);
        }
    }

    public static int numDigits(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + numDigits(num / 10);
        }
    }
}
