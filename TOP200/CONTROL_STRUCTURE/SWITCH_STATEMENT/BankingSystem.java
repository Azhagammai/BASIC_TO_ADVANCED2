import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 0;  // Initial balance
        int option;

        System.out.println("==== Welcome to the Banking System ====");

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {  // Input validation for integers
                System.out.println("Invalid input! Please enter a valid option (1-4).");
                scanner.next();
            }
            
            option = scanner.nextInt();

            switch (option) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful! Current balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive number.");
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! Current balance: $" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds! Your current balance is $" + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount. Please enter a positive number.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the Banking System! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        } while (option != 4);

        scanner.close();
    }
}
