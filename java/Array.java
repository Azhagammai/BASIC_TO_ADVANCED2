import java.util.Scanner;

class Array {
    public static void main(String args[]) {
        int n, i;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the limit:");
        n = s.nextInt();  // Read the array size
        int arr[] = new int[n];  // Initialize the array with size n

        // Input values into the array
        System.out.println("Enter " + n + " elements:");
        for(i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Print the elements of the array
        System.out.println("Array elements are:");
        for(i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        s.close();  // Close the scanner
    }
}
