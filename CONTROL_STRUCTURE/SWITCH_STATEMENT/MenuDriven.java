import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, quantity;
        double total = 0;

        System.out.println("===== SHOPPING MENU =====");
        System.out.println("Enter your choice: VEG or NON_VEG");
        String category = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity

        switch (category) {
            case "VEG" -> {
                System.out.println("---- VEG MENU ----");
                System.out.println("1. Paneer Tikka - $5.99");
                System.out.println("2. Veg Biryani - $7.99");
                System.out.print("Enter your choice (1-2): ");
                choice = scanner.nextInt();

                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();

                switch (choice) {
                    case 1 -> total += quantity * 5.99;
                    case 2 -> total += quantity * 7.99;
                    default -> System.out.println("Invalid item choice!");
                }
            }
            case "NON_VEG" -> {
                System.out.println("---- NON-VEG MENU ----");
                System.out.println("1. Chicken Curry - $8.99");
                System.out.println("2. Mutton Biryani - $12.99");
                System.out.print("Enter your choice (1-2): ");
                choice = scanner.nextInt();

                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();

                switch (choice) {
                    case 1 -> total += quantity * 8.99;
                    case 2 -> total += quantity * 12.99;
                    default -> System.out.println("Invalid item choice!");
                }
            }
            default -> System.out.println("Invalid category choice!");
        }

        if (total > 0) {
            System.out.printf("Total Bill: $%.2f\n", total);
        }
        
        scanner.close();
    }
}
