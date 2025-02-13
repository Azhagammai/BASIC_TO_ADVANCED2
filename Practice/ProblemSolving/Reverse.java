package ProblemSolving;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int original=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n/=10;
             ans=ans*10+rem;


        }
        System.out.println(ans);
        if(ans==original){
            System.out.println("It is a palindrome");

        }
        else{
            System.out.println("It is not a palindrome");
        }
        
    }
    
}
