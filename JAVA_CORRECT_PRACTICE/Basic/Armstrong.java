package Basic;

import java.util.Scanner;


public class Armstrong

{
    static void isArmstrong(int limit){
       
        for(int i=1;i<=limit;i++){
            int original=i;
            int n=0;
            int rem=0;
            int ans=0;
          //It check only count 
            while(original!=0){
                original/=10;
                ++n;
            }
            original=i;
            while(original>0){
                rem=original%10;
                ans+=Math.pow(rem,n);
                original/=10;
            }
            if(ans==i){
                System.out.println(i);
            }

        }
      
        
    }
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=s.nextInt();
    System.out.println("The number of 1 to nth Armtrong number is:");
    isArmstrong(n);

    
 }
}