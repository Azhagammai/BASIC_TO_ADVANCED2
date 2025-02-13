package ProblemSolving;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=in.nextInt();
    if(n<=1){
        System.out.println("The number is not prime nor composite");
        return;
    }
    int c=2;
    while(c*c<=n){
        if(n%c==0){
            System.out.println("The number is not prime");
            return;
        }
        c++;
    }   
        System.out.println("The number is prime");
    }
}
