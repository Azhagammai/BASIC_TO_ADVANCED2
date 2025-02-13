package MATHS;
import java.util.*;
public class FACTORS {
    public static void isfact(int num){
        System.out.print("Factors of " + num + ": ");
        for(int i=1;i<=num;i++){

            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Starting number: ");
        int start=s.nextInt();
        System.out.println("Enter the Ending number: ");
        int end=s.nextInt();
        for(int i=start;i<=end;i++){
            isfact(i);

        }
        
    }
    
}
