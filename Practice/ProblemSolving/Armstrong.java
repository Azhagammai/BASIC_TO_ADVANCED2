package ProblemSolving;
import java.util.*;


public class Armstrong {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            sum=sum+rem*rem*rem;

        }
        if(sum==original){
            System.out.println("It is a Armstrong number");
        }
        else{
            System.out.println("It is not  a Armstrong number");
        }
    }
    
}
