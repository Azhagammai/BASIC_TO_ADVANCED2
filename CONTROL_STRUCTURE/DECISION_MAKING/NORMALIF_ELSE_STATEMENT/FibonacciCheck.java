package CONTROL_STRUCTURE.DECISION_MAKING.NORMALIF_ELSE_STATEMENT;

import java.util.Scanner;

public class FibonacciCheck {
    static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println(num + " is a Fibonacci number.");
        } else {
            System.out.println(num + " is NOT a Fibonacci number.");
        }
    }
}
