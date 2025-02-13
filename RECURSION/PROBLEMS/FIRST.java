package RECURSION.PROBLEMS;
import java.util.Scanner;

public class FIRST {
    // static int i=1;
    
    // public static void f(int n){
    //     if(i==n)
    //       return;
    //     System.out.println("Pragu");
    //     f();//error
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     f(n);
    // }
   
    
    public static void f(int i,int n){
        if(0>n)
          return;
        System.out.println("Pragu");
        f(i+1,n);// we 
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        f(1,n);
    }
    
}
