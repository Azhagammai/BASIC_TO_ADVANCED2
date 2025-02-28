import java.util.Scanner;

public class Calculator {
    public static int calculate(char ch, int a, int b) {
        switch (ch) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Integer.MIN_VALUE; // Return a special value indicating an error
                }
                return a / b;
            case '%': 
                if (b == 0) {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    return Integer.MIN_VALUE;
                }
                return a % b;
            default:
                System.out.println("Error: Invalid operator.");
                return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int result = calculate(operator, a, b);
        if (result != Integer.MIN_VALUE) {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}
