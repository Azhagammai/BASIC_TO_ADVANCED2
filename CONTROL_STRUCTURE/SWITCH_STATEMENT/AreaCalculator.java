import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== Area Calculator =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("The Area of the Circle is: " + (Math.PI * radius * radius));
                }
                case 2 -> {
                    System.out.print("Enter the Length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the Breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.println("The Area of the Rectangle is: " + (length * breadth));
                }
                case 3 -> {
                    System.out.print("Enter the Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the Height: ");
                    double height = scanner.nextDouble();
                    System.out.println("The Area of the Triangle is: " + (0.5 * base * height));
                }
                case 4 -> System.out.println("Exiting the program. Thank you!");
                default -> System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        } while (option != 4);

        scanner.close();
    }
}
