import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a traffic light color (Red, Yellow, Green): ");
        String lightColor = scanner.next().toUpperCase();  // Convert input to uppercase

        switch (lightColor) {
            case "RED" -> System.out.println("STOP");
            case "YELLOW" -> System.out.println("GET READY");
            case "GREEN" -> System.out.println("GO");
            default -> System.out.println("INVALID COLOR! Please enter Red, Yellow, or Green.");
        }

        scanner.close();
    }
}
