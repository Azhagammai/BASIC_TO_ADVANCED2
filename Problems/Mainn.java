package PROBLEMS;
import java.util.*;

public class Mainn {
    public static void left_rotate(int size, int[] arr, int N) {
        // Handle cases where N > size
        N = N % size;
        if (N == 0) return; // No rotation needed

        // Reverse first N elements
        Reverse(arr, 0, N - 1);
        // Reverse remaining elements
        Reverse(arr, N, size - 1);
        // Reverse whole array
        Reverse(arr, 0, size - 1);
    }

    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int ind = 0; ind < size; ind++) {
            arr[ind] = sc.nextInt();
        }
        int N = sc.nextInt();

        left_rotate(size, arr, N);

        for (int ind = 0; ind < size; ind++) {
            System.out.print(arr[ind] + " ");
        }
        sc.close();
    }
}
