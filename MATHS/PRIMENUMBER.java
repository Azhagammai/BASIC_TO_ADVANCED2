package MATHS;
import java.util.*;
public class PRIMENUMBER {
    public static boolean isprime(int m){
        if(m<2)return false;
        for(int i=2;i<=Math.sqrt(m);i++){
            if(m%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter range of number:");
        int number=s.nextInt();
        for(int i=0;i<=number;i++){
            if(isprime(i)){
                System.out.println("The Prime numbers are: "+i);
            }
           
        }
        System.out.println();
    }
    
}
