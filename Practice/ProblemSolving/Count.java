package ProblemSolving;
import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while (n>0){
            int rem=n%10;
            n/=10;
            count++;
            
            

            
        }
        System.out.println("The count of the number " +count);
    }
    
}
