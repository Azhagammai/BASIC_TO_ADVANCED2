package DATASTRUCTURE.ARRAY.EASYARRAY;
import java.util.*;

public class NormalArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
    
}
