// https://chatgpt.com/share/67831ee5-8eb0-8011-a753-d446238d093c7
// Basic Arithmetic and Properties of Integers
import java.util.*;
public class Fisrt {
    static void divi(int n){
        int count=0;
        int l=Integer.MIN_VALUE;
        int m=Integer.MAX_VALUE;
         for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.printf("The factors of %d is: %d\n" ,n, i);
                count ++;
                if(i>l){
                    l=i;
                }
                if(i<m){
                    m=i;
                }
            }

         }
         System.out.println();
         System.out.println("The factors count is: " +count);
         System.out.println("The largest factor is:" +l);
         System.out.println("The smallest factor is:" +m);
         

         
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        divi(n);

    }
}