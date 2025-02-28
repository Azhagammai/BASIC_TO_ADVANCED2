package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.COMPLEX;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Complex_2 {

   
    static class MyStack {
        private Stack<Integer> stack = new Stack<>();

        public void push(int value) {
            stack.push(value);
            System.out.println(value + " pushed to stack.");
        }

        public void pop() {
            if (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            } else {
                System.out.println("Stack is empty.");
            }
        }

        public void peek() {
            if (!stack.isEmpty()) {
                System.out.println("Top element: " + stack.peek());
            } else {
                System.out.println("Stack is empty.");
            }
        }
    }

    static class MyQueue {
        private Queue<Integer> queue = new LinkedList<>();

        public void enqueue(int value) {
            queue.add(value);
            System.out.println(value + " added to queue.");
        }

        public void dequeue() {
            if (!queue.isEmpty()) {
                System.out.println("Dequeued: " + queue.poll());
            } else {
                System.out.println("Queue is empty.");
            }
        }

        public void front() {
            if (!queue.isEmpty()) {
                System.out.println("Front element: " + queue.peek());
            } else {
                System.out.println("Queue is empty.");
            }
        }
    }

    static class BankAccount {
        private double balance = 0;

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void checkBalance() {
            System.out.println("Current balance: " + balance);
        }
    }

    static class TicketReservation {
        private int availableSeats = 5;

        public void bookTicket() {
            if (availableSeats > 0) {
                availableSeats--;
                System.out.println("Ticket booked! Seats remaining: " + availableSeats);
            } else {
                System.out.println("No seats available.");
            }
        }
    }

    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    static int factorial(int n) {
        return (n<=1) ? 1 : n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void numberGuessingGame() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");
        while (guess != numberToGuess) {
            guess = sc.nextInt();
            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }
    }

    static void printCheckerboard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) System.out.print("X ");
                else System.out.print("O ");
            }
            System.out.println();
        }
    }

    static void vendingMachine(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You selected Coke.");
                break;
            case 2:
                System.out.println("You selected Pepsi.");
                break;
            case 3:
                System.out.println("You selected Water.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.peek();

       
        MyQueue queue = new MyQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.dequeue();
        queue.front();

      
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();

       
        TicketReservation ticket = new TicketReservation();
        ticket.bookTicket();
        ticket.bookTicket();

        System.out.println("2^5 = " + power(2, 5));

        
        System.out.println("Factorial of 5 = " + factorial(5));

        
        System.out.println("Fibonacci(6) = " + fibonacci(6));

        numberGuessingGame();

       
        System.out.println("Checkerboard Pattern:");
        printCheckerboard(5);

       
        System.out.println("Enter choice for vending machine (1: Coke, 2: Pepsi, 3: Water): ");
        int choice = sc.nextInt();
        vendingMachine(choice);

        sc.close();
    }}
