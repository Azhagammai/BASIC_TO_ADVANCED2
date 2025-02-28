import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Compute discriminant
        double d = (b * b) - (4 * a * c);

        switch (Double.compare(d, 0)) { // Compares d to 0 and returns -1, 0, or 1
            case 1 -> { // Two distinct real roots
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Two real roots: " + root1 + " and " + root2);
            }
            case 0 -> { // One real root (double root)
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
            }
            case -1 -> System.out.println("Imaginary roots (complex numbers)");
        }

        scanner.close();
    }
}
