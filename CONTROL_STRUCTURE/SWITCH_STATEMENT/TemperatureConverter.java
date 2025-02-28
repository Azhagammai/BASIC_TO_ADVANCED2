import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the conversion option (C for Celsius to Fahrenheit, F for Fahrenheit to Celsius): ");
        char option = scanner.next().toLowerCase().charAt(0);  // Convert input to lowercase for case insensitivity

        switch (option) {
            case 'f' -> {
                double celsius = (temperature - 32) * 5.0 / 9.0;
                System.out.printf("Converted Temperature: %.2f°C\n", celsius);
            }
            case 'c' -> {
                double fahrenheit = (temperature * 9.0 / 5.0) + 32;
                System.out.printf("Converted Temperature: %.2f°F\n", fahrenheit);
            }
            default -> System.out.println("Invalid option! Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
