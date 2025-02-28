package RECURSION.PROBLEMS;
import java.util.*;

public class FACT {
    static int factorial(int n){
        if(n==0){//base case
            return 1;
        }
        return n*factorial(n-1); // recursive
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println("The factorial of 5 is: "+factorial(number));
    }
}
