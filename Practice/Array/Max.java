package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(maximum(arr,0,4));
    }
    static int maximum(int[] a, int start, int end) {
        // Check for invalid range
        if (start > end || start < 0 || end >= a.length) {
            System.out.println("Invalid range specified.");
            return -1;
        }
        int max=a[start];
        for(int i=start+1;i<=end;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
                return max;


}    
}
