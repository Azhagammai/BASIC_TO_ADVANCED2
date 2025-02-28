package C_JAVA.JAVA.JAVA_ARRAY.NUMBER_ARRAY;

import java.util.*;

public class Length {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // while
        int n=s.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            count++;
        }
        System.out.println("The length of arr is : "+count);
    }
    
}
