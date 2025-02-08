package PROBLEMS;
public class Rightroat{
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rightroation(int[] arr,int n,int k){
        k=k%n;
        if(k==0) return;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
   
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int size=arr.length;
        int k=2;
        rightroation(arr,size,k);

        
    }
    
}