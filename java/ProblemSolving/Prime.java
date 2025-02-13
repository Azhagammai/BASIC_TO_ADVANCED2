import java.util.*;
class Prime{
    public static void main(String args[]){
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=s.nextInt();
        if(n==1||n==0)
            System.out.println("It is not a prime number");
        for(i=2;i<=n*n;i++){
            if(n%i==0){
                System.out.println("It is not a prime number");
            }
        System.out.println("It is  a prime number");
    }
}}
