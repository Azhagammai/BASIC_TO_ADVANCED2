package Basic;

import java.util.Scanner;

public class Prime {
    static boolean isprime(int number){
        if(number<=1){
            return false;
        }
        
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        isprime(n);
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }

        s.close();
    }
}