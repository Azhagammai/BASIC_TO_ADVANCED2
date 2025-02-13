package CONTROL_STRUCTURE.DECISION_MAKING.NESTED_IF_ELSE_STATEMENT;
import java.util.Scanner;
public class NESTED_IF_ELSE_STATEMENT{

    public static boolean isprime(int num){
        
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void isLarge(){
        
    }
        
    
    public static void print(int start,int end){
        System.out.print("Prime numbers: ");
        for (int num = start; num <= end; num++) {
            if (isprime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

       
       
       
        

        
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Starting number:");
     int n=s.nextInt();
     System.out.println("Ending number:");
     int m=s.nextInt();

     print(n,m);

    }
}
