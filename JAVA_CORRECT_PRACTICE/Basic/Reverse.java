package Basic;
import java.util.*;
public class Reverse {
    static int isreverse(int m){
        int ans=0;
        while(m>0){
            int rem=m%10;
            m/=10;
            ans=ans*10+rem;
            
        }
        return ans;
    }
    static void isNeon(int a){
        int b=a*a;
        
        int ans=0;
        while(b>0){
            int rem=b%10;
            b/=10;
            ans+=rem;
            
        }
        if(a==ans){
            System.out.println("This is neon number");
        }
        else{
            System.out.println("This is not neon number");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");   // 1234==>1000+200+30+4===>40+3==>430+2=>4320+1==>4321
        int n=s.nextInt();
        System.out.println(isreverse(n));
        System.out.println("Enter the number:");
        int a=s.nextInt();
        isNeon(a);

    }
    
}
