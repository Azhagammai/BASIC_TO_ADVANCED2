import java.util.Scanner;

public class Largest {
    public static void isbubble(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) { // Corrected loop condition
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;  // Corrected 'att[j+1]' to 'arr[j+1]'
                }
            }
        }
    }

    public static int iscons(int[] arr, int n) {
        int max = 1;
        int curr = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                curr++;
            } else if (arr[i] != arr[i - 1]) {
                max = Math.max(max, curr);  // Corrected logic
                curr = 1;  // Reset for new sequence
            }
        }
        return Math.max(max, curr); // Ensure max is updated at the end
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n]; // Corrected array initialization

        for (int i = 0; i < n; i++) { // Corrected loop condition
            arr[i] = s.nextInt();
        }

        isbubble(arr, n);
        System.out.println(iscons(arr, n));
        
        s.close(); // Close the scanner to avoid resource leaks
    }
}
