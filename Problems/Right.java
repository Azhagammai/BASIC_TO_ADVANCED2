package PROBLEMS;
import java.util.*;

public class Right{
    // Function to reverse the array
    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) { // Fix: start < end instead of start <= end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to Rotate k elements to the right
    public static void rotateRight(int[] arr, int n, int k) {
        k = k % n; // Handle cases where k > n

        if (k == 0) return; // No need to rotate if k is 0

        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse the whole array
        Reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int ind = 0; ind < size; ind++) {
            arr[ind] = sc.nextInt();
        }
        int N = sc.nextInt();

        rotateRight(arr,size, N);

        for (int ind = 0; ind < size; ind++) {
            System.out.print(arr[ind] + " ");
        }
        sc.close();
    }
}
