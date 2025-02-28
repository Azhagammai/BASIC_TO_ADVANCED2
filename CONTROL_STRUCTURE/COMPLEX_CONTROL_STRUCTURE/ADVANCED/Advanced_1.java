package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.ADVANCED;

import java.io.*;
import java.util.*;

public class Advanced_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Advanced_1 program = new Advanced_1();
        program.textBasedGame();
        program.passwordValidation();
        program.ticTacToe();
        program.fileIO();
        program.phoneBook();
        program.ticketBooking();
        program.guessingGame();
        program.simpleCalendar();
        program.emailValidation();
        program.encryptionDecryption();
    }

    void textBasedGame() {
        System.out.println("Welcome to the adventure game!");
        System.out.print("Choose your path (left/right): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You found a treasure!");
        } else {
            System.out.println("You encountered a monster!");
        }
    }

    void passwordValidation() {
        String correctPassword = "Secure123";
        String input;
        do {
            System.out.print("Enter password: ");
            input = scanner.next();
        } while (!input.equals(correctPassword));
        System.out.println("Access Granted!");
    }

    void ticTacToe() {
        char[][] board = new char[3][3];
        for (char[] row : board) Arrays.fill(row, '-');
        int moves = 0;
        while (moves < 9) {
            System.out.println("Enter row and column (0-2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][col] == '-') {
                board[row][col] = moves % 2 == 0 ? 'X' : 'O';
                moves++;
            }
            for (char[] r : board) System.out.println(Arrays.toString(r));
        }
    }

    void fileIO() {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File I/O!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void phoneBook() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "1234567890");
        phoneBook.put("Alice", "9876543210");
        System.out.print("Enter name to search: ");
        String name = scanner.next();
        System.out.println(phoneBook.getOrDefault(name, "Not found"));
    }

    class Ticket {
        String passenger;
        Ticket(String name) { this.passenger = name; }
    }
  
    void ticketBooking() {
        System.out.print("Enter passenger name: ");
        String name = scanner.next();
        Ticket ticket = new Ticket(name);
        System.out.println("Ticket booked for " + ticket.passenger);
    }

    void guessingGame() {
        int number = new Random().nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if (guess < number) System.out.println("Too low!");
            else if (guess > number) System.out.println("Too high!");
        } while (guess != number);
        System.out.println("Correct!");
    }

    void simpleCalendar() {
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Days in month: " + (month == 2 ? 28 : (Arrays.asList(4, 6, 9, 11).contains(month) ? 30 : 31)));
    }

    void emailValidation() {
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.println(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$") ? "Valid email" : "Invalid email");
    }

    void encryptionDecryption() {
        System.out.print("Enter number to encrypt: ");
        int number = scanner.nextInt();
        int encrypted = number * 3 + 7;
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + ((encrypted - 7) / 3));
    }}
