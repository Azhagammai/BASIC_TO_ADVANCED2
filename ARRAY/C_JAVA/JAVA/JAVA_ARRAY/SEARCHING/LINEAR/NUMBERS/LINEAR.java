package C_JAVA.JAVA.JAVA_ARRAY.SEARCHING.LINEAR.NUMBERS;
// phone book 
import java.util.Scanner;
public class LINEAR{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int arr[]={100,20,50,8};
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        boolean f=false;
        s.close();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Found");
                f=true;
                break;
            }
        }
        if(!f){
            System.out.println("Not found");
        }
       
    }
}