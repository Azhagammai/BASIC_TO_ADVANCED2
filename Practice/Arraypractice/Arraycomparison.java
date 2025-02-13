package Arraypractice;
import java.util.*;

public class Arraycomparison {
    public static void main(String[] args) {
        int[] arr1={1,2,3,5};
        int[] arr2={1,2,3,4};
        int a=Arrays.compare(arr1,arr2);
        System.out.println(a);
        System.out.println(Arrays.equals(arr1,arr2));
        int[] c=Arrays.copyOf(arr2, 6);
        System.out.println(Arrays.toString(c));
        int[][] a1={{1,2,3,4},{5,6,7,8}};
        int[][] a2={{1,2,3},{5,6,7}};
        System.out.println(Arrays.deepEquals(a1, a2));
        int[] f=new int[5];
        Arrays.fill(f, 8);
        System.out.println(Arrays.toString(f));
        int mismatchIndex = Arrays.mismatch(arr1, arr2);
        System.out.println(mismatchIndex);
        int[] array = {5, 3, 8, 1, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    
    }
    
}
