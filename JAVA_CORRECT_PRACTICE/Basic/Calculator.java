package Basic;
import java.util.*;
public class Calculator {
    static int iscal(int a,int b,char o){
        int ans=0;
        switch(o){
            case '+' -> ans=a+b;
            case '-' -> ans=a-b;
            case '*' -> ans=a*b;
            // case '/' -> (b==0)?0:ans=a/b;
            case '/' -> ans=a/b;
            case '%' -> ans=a%b;
            default -> ans=0;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=s.nextInt();
        System.out.println("Enter the second number:");
        int b=s.nextInt();
        System.out.println("Enter the operation:");
        char ch=s.next().charAt(0);
        System.out.println(iscal(a, b,ch));
    }
    
}
