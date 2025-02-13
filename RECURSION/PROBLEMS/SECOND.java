package RECURSION.PROBLEMS;
import java.util.Scanner;
public class SECOND {
    static void fun(int i,int n){
        if(i>n)
           return;
        System.out.println(i);
        fun(i+1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fun(1,n);
    }
    
}
