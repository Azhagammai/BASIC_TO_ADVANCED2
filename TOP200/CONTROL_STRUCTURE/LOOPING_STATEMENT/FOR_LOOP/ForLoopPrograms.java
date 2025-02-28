import java.util.Scanner;

public class ForLoopPrograms {

    public static void printNumbers() {
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTable() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        System.out.print("Enter limit: ");
        int limit = s.nextInt();
        
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void fibonacci() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int number = s.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void sumOfDigits() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void primeNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = s.nextInt();
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void reverseNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }

    public static void checkPrime() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        System.out.println(number + (isPrime(number) ? " is a prime number." : " is not a prime number."));
    }

    public static void sumEvenNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    public static void sumOddNumbers() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a program (61-70) or 0 to exit: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 61: printNumbers(); break;
                case 62: printTable(); break;
                case 63: factorial(); break;
                case 64: fibonacci(); break;
                case 65: sumOfDigits(); break;
                case 66: primeNumbers(); break;
                case 67: reverseNumber(); break;
                case 68: checkPrime(); break;
                case 69: sumEvenNumbers(); break;
                case 70: sumOddNumbers(); break;
                case 0: System.out.println("Exiting..."); scanner.close(); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
