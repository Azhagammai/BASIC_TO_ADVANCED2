import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1, b = -3, c = 2;
        double d = b * b - 4 * a * c;

        switch ((d > 0) ? 1 : (d == 0) ? 2 : 3) {
            case 1: 
                double root1 = (-b + Math.sqrt(d)) / (2 * a);
                double root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Real and Different: " + root1 + ", " + root2);
                break;
            case 2: 
                double root = -b / (2 * a);
                System.out.println("Real and Same: " + root);
                break;
            case 3:
                System.out.println("Complex Roots");
                break;
        }
    }
}
