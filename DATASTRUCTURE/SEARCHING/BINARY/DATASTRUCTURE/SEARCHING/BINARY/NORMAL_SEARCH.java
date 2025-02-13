package DATASTRUCTURE.SEARCHING.BINARY;
import java.util.Scanner;
public class NORMAL_SEARCH {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
        int arr[]={100,200,300,400,500}; // only array should sort then only we use binary search
        int start=0;
        int end=arr.length-1;
        int flag=0;
        while(start<=end){
            int  mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element Found "+mid);
                flag=1;
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
         

        }
        if(flag==0){
            System.out.println("Element not Found");
        }
    }
}

