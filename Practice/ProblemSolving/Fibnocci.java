package ProblemSolving;
import  java.util.*;

 
public class Fibnocci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        System.out.println(a + " ");
        if (n > 1) {
            System.out.println(b + " ");
        }
        int count=2;

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
            System.out.println(b);


        }
        
    }
    
}
