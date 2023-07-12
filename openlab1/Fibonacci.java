package openlab1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fibNum = fibonacci(num);

        System.out.println("The " + num + "th Fibonacci number is " + fibNum);
    }

    public static int fibonacci(int n) {
            int fib = 0;
            int fibMinusOne = 1;
            int fibMinusTwo = 0;

            for (int i = 2; i <= n; i++) {
                fib = fibMinusOne + fibMinusTwo;
                fibMinusTwo = fibMinusOne;
                fibMinusOne = fib;
            }

            return fib;

    }
}

