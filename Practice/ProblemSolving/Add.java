package ProblemSolving;
import java.util.*;

public class Add {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the A:");
    int a=in.nextInt();
    System.out.println("Enter the B:");
    int b=in.nextInt();
    sum(a,b);
    }
static void sum(int a,int b){
    System.out.println("The sum of two number is:"+(a+b));
} 
}
