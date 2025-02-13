package Basic;
import java.util.*;
public class Conditional {
    static String pnz(int n){
        if(n==0)
            return "Zero";
        else if(n<0)
            return "Negative";
        else
            return "Positive";
        
    }
    static String oddoreven(int n){
        if(n%2==0)
            return "EVEN";
        else
            return "ODD";  
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println(pnz(n));
        System.out.println("========ODD OR EVEN======");
        System.out.println("Enter the number:");
        int number=s.nextInt();
        System.out.println(oddoreven(number));
        System.out.println("=====ODD=====");
        for(int i=1;i<=number;i+=2){
            System.out.println(i);
        } 
        System.out.println("=====EVEN======");
        for(int j=2;j<=number;j+=2){
                System.out.println(j);
        }
        

       
    }
    
}
