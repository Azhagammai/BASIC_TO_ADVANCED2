package DATASTRUCTURE.ARRAY.SORTING;

import java.util.Arrays;

public class reverselogic
 {
    public static void main(String[] args) {
        int arr[]={5,4,8,2,1};
        int n=arr.length-1;
        int start=0;
        int end=arr.length-1;
        while(end>0){
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
          start++;
          end--;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
