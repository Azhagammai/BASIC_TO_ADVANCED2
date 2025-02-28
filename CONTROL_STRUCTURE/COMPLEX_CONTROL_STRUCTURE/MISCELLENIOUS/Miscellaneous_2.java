package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.MISCELLENIOUS;


import java.util.*;

public class Miscellaneous_2 {

    static class VotingSystem {
        private final HashMap<String, Integer> votes = new HashMap<>();
        
        void addCandidate(String name) {
            votes.put(name, 0);
        }

        void castVote(String name) {
            if (votes.containsKey(name)) {
                votes.put(name, votes.get(name) + 1);
            } else {
                System.out.println("Invalid candidate!");
            }
        }

        void displayResults() {
            System.out.println("Voting Results:");
            votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count + " votes"));
        }
    }

    static String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    static String numberToWords(int num) {
        if (num == 0) return "Zero";
        if (num < 10) return ones[num];
        if (num < 20) return teens[num - 10];
        if (num < 100) return tens[num / 10] + " " + ones[num % 10];
        return ones[num / 100] + " Hundred " + numberToWords(num % 100);
    }

    static class BankAccount {
        private double balance;

        BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }

        void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            }
        }

        void checkBalance() {
            System.out.println("Current Balance: $" + balance);
        }
    }

    static void menuDrivenProgram(Scanner sc) {
        while (true) {
            System.out.println("1. Greet  2. Display Time  3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Hello, User!");
                case 2 -> System.out.println("Current Time: " + new Date());
                case 3 -> { return; }
                default -> System.out.println("Invalid option, try again.");
            }
        }
    }

    static class TicTacToe {
        private final char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        private final Scanner sc = new Scanner(System.in);

        void playGame() {
            int turn = 0;
            while (true) {
                printBoard();
                System.out.println("Enter row and column (0-2) for X: ");
                int row = sc.nextInt(), col = sc.nextInt();
                if (board[row][col] == ' ') board[row][col] = 'X';
                else { System.out.println("Invalid move! Try again."); continue; }
                
                if (checkWin('X')) { printBoard(); System.out.println("Player X wins!"); return; }
                if (++turn == 9) { printBoard(); System.out.println("It's a draw!"); return; }

                System.out.println("AI is making a move...");
                aiMove();
                if (checkWin('O')) { printBoard(); System.out.println("AI wins!"); return; }
            }
        }

        void aiMove() {
            for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) if (board[i][j] == ' ') { board[i][j] = 'O'; return; }
        }

        boolean checkWin(char player) {
            for (int i = 0; i < 3; i++) 
                if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player))
                    return true;
            return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                   (board[0][2] == player && board[1][1] == player && board[2][0] == player);
        }

        void printBoard() {
            for (char[] row : board) System.out.println(Arrays.toString(row));
        }
    }

    static double convertCurrency(double amount, double rate) {
        return amount * rate;
    }

    static void countWordFrequency(String sentence) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : sentence.toLowerCase().split("\\s+")) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        System.out.println(freqMap);
    }

    static String findLongestWord(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                     .max(Comparator.comparingInt(String::length))
                     .orElse("");
    }

    static void atmSimulation(Scanner sc) {
        BankAccount account = new BankAccount(1000);
        while (true) {
            System.out.println("1. Deposit  2. Withdraw  3. Check Balance  4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> { System.out.print("Amount to deposit: "); account.deposit(sc.nextDouble()); }
                case 2 -> { System.out.print("Amount to withdraw: "); account.withdraw(sc.nextDouble()); }
                case 3 -> account.checkBalance();
                case 4 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static class Student {
        String name;
        int age;
        double grade;
        Student(String name, int age, double grade) { this.name = name; this.age = age; this.grade = grade; }
    }

    static void manageStudentRecords() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 22, 3.5));
        System.out.println("Student Records:");
        for (Student s : students) System.out.println(s.name + " | Age: " + s.age + " | GPA: " + s.grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VotingSystem voting = new VotingSystem();
        voting.addCandidate("Alice");
        voting.addCandidate("Bob");
        voting.castVote("Alice");
        voting.castVote("Bob");
        voting.castVote("Bob");
        voting.displayResults();

        System.out.println("Number to words: " + numberToWords(456));

        BankAccount myAccount = new BankAccount(500);
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.checkBalance();

        menuDrivenProgram(sc);

        TicTacToe game = new TicTacToe();
        game.playGame();

        System.out.println("Converted amount: " + convertCurrency(100, 1.1));

        countWordFrequency("hello world hello");

        System.out.println("Longest word: " + findLongestWord("Java is an amazing programming language"));

        atmSimulation(sc);

        manageStudentRecords();

        sc.close();
    }}

