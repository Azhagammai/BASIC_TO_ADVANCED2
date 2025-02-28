package JavaProgram;
import java.util.*;
import java.lang.*;

public class Consec{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        int count = 1;
        int maxCount = 1;

        for(int i = 0; i < n - 1; i++){
            if(arr[i + 1] - arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count); // Keep track of max length
            } else if (arr[i + 1] != arr[i]) { // Reset count only if numbers are not duplicates
                count = 1;
            }
        }
        System.out.println();
        System.out.println(count);

    }
    
}
