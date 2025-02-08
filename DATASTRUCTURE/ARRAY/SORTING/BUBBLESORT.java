package DATASTRUCTURE.ARRAY.SORTING;

import java.util.Arrays;
import java.util.Scanner;

public class BUBBLESORT {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            // else{
            //     j++;
            // }
        }}
        System.out.println(Arrays.toString(arr));

    }
    
}
