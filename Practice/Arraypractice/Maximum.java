package Arraypractice;
import java.util.*;
public class Maximum {
    public static void main(String[] args) {;

        int[] arr={1,2,3,4,5};
        System.out.println(maxrangee(arr,0,arr.length-1));
     }
     static int maxrangee(int[] a,int start,int end){
        if(start>end){
            return -1;
        }
        if(a.length==0){
            return -1;
        }
        int maxvalue=a[start];
        for(int i=start;i<=end;i++){
            if(a[i]>maxvalue){
                 maxvalue=a[i];
            }
        }
        return maxvalue;



     }
    }
