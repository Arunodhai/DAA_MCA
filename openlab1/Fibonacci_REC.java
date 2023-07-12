package openlab1;

import java.util.Scanner;

public class Fibonacci_REC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fibNum = fibonacci(num);

        System.out.println("The " + num + "th Fibonacci number is " + fibNum);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
