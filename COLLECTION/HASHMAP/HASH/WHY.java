package COLLECTION.HASHMAP.HASH;
import java.util.*;

public class WHY {
    public static int ishash(int[] arr, int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.print("Enter number to count: ");
        for(int i=0;i<10;i++){
            int target=i;
            System.out.println(target + " appears " + ishash(arr, n, target) + " times.");

        }
     
        
        s.close();

      
    }
}
