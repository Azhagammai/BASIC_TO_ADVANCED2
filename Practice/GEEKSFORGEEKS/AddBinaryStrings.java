package GEEKSFORGEEKS;

import java.util.Scanner;

public class AddBinaryStrings {

    // Function to add two binary strings
    



    // Function to add two binary strings
    public static String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();

        // Start from the end of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add the digit from string `a` if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add the digit from string `b` if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Add the resulting bit to the result
            result.append(sum % 2);

            // Calculate the new carry
            carry = sum / 2;
        }

        // Reverse the result to get the correct order
        result.reverse();
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take binary strings as input from the user
        System.out.print("Enter the first binary string: ");
        String x = scanner.nextLine();

        System.out.print("Enter the second binary string: ");
        String y = scanner.nextLine();

        // Display the output
        System.out.println("Result of addition: " + addBinary(x, y));
    }
}
