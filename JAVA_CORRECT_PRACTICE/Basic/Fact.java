package Basic;
import java.util.*;
public class Fact {
    
    static void isfact(int n){
        int fact=1;
        
        for(int i=1;i<=n;i++){

         fact*=i;
         System.out.println(fact);
          
        }
       
       
    }
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    // int a=0,b=1;
    int n=s.nextInt();
    isfact(n);
    }
}
