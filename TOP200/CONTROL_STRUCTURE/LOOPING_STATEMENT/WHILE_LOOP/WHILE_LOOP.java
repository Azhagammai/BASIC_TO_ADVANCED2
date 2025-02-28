package WHILE_LOOP;
import java.util.Scanner;

public class WHILE_LOOP {

    public static void isnaturalnumber() {
        System.out.println("The numbers 1 to 10 are:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void iseven() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int i = 2;
        while (i <= number) {
            System.out.println(i);
            i += 2;
        }
        s.close();
    }

    public static void isfact() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial: " + fact);
        s.close();
    }

    public static void isreverse() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans * 10 + rem;
            number /= 10;
        }
        System.out.println("Reversed number: " + ans);
        s.close();
    }

    public static void isfibonacci(int number) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        int i = 0;
        while (i < number) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        System.out.println();
    }

    public static void issumdigit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        s.close();
    }

    public static void isodd() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i += 2;
        }
        s.close();
    }

    public static void issumofnatural() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural numbers: " + sum);
        s.close();
    }

    public static void iscount() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        s.close();
    }

    public static void isproduct() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = s.nextInt();
        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        System.out.println("Product of digits: " + product);
        s.close();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for factorial calculation: ");
        int num = s.nextInt();
        isfact();
        s.close();
    }}
