package RECURSION.PROBLEMS;
import java.util.Scanner;

public class THREE {
    static void fun(int i,int n){
        // if(i>n)
        if(i<1)
           return;
        System.out.println(i);
        // System.out.println(n);
        fun(i-1,n);
        // fun(i,n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // fun(1,n)
        fun(n,n);
    }
    
}
