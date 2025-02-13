package Com.kunal.ControlStatement.LoopingStatement;
import java.util.Scanner;

class Forloop {
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in); // Corrected scanner instantiation
        System.out.println("Enter a positive number: ");
        
        int n = s.nextInt(); // Reads user input
        
        for (i = 1; i <= n; i++) { // Corrected loop syntax with semicolons
            System.out.println(i);  // Prints numbers from 1 to n
        }
      
        s.close(); // Properly close the scanner
    }
}
