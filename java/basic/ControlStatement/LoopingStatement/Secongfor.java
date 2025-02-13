package Com.kunal.ControlStatement.LoopingStatement;
import java.util.Scanner;

class Secondfor
 {
    public static void main(String[] args) {
        int i, cal = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a positive number: ");
        int n = s.nextInt(); // Reads user input
        
        for (i = 2; i <= n; i++) {
            if (i % 2 == 0) { // Check if 'i' is even
                cal = i * i;  // Square the even number
                sum += cal;   // Add the square to the sum
            }
        }
        
        // Print the sum of squares of even numbers
        System.out.println("Sum of squares of even numbers up to " + n + " is: " + sum);
        
        s.close(); // Properly close the scanner
    }
}
