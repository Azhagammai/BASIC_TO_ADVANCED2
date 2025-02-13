package Basic;
import java.util.*;
public class AddBinaryStringsWithInput {

    // Method to add two binary strings
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To store the result
        int carry = 0; // To keep track of carry during addition
        int i = a.length() - 1; // Pointer for the first binary string
        int j = b.length() - 1; // Pointer for the second binary string

        // Loop until all digits are processed or carry is non-zero
        while (i >= 0 || j >= 0 || carry != 0) {
            // Add the digit from 'a' if it exists
            carry += (i >= 0 ? a.charAt(i--) - '0' : 0);

            // Add the digit from 'b' if it exists
            carry += (j >= 0 ? b.charAt(j--) - '0' : 0);

            // Append the current binary digit to the result (sum % 2)
            result.append(carry % 2);

            // Update the carry (sum / 2)
            carry /= 2;
        }

        // Since we built the result in reverse, reverse it back
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input

        // Prompt the user for two binary strings
        System.out.print("Enter the first binary string: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary string: ");
        String binary2 = scanner.nextLine();

        // Call the addBinary method
        String result = addBinary(binary1, binary2);

        // Print the result
        System.out.println("The sum of " + binary1 + " and " + binary2 + " is: " + result);

        scanner.close(); // Close the scanner
    }
}

   
