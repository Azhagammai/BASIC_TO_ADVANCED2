package Basic;
import java.util.*;

public class Prime {
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
          
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
            }
        return true;
    }
      
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }

        }
        
    }
    
}
