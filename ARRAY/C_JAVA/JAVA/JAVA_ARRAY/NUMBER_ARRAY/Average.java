package C_JAVA.JAVA.JAVA_ARRAY.NUMBER_ARRAY;
import java.util.Scanner;
public class Average{
    public static void islinear(int[]arr, int n,int target){
        boolean found=false;
        int a=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                a=i;

            }
        }
        if(found)System.out.println("The value is found at index : "+a);
    }
    
    public static void reverselinear(int[] arr,int n,int target){
        boolean found=false;
        int a=0;
        for(int i=n-1;i<=0;i++){
            if(arr[i]==target){
                found=true;
                a=i;

            }
        }
        if(found)System.out.println("It is found at index: "+a);
    }
   
    public static void isaverage(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The Average of a number is: "+(sum/n));
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        } 
        int target=s.nextInt();
        // isaverage(arr,n);
        // islinear(arr,n,target);
        reverselinear(arr,n,target);

        
    }
}