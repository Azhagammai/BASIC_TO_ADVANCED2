package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        fun(a,0,3);
        System.out.println(Arrays.toString(a));

    }
    static void fun(int a[],int index1,int index2){

        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;

    }
    
}
