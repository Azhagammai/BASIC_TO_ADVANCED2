package MATHS;
import java.util.*;

public class ARMSTRONGNUMBER {
    public static boolean isArmstrong(int n){
        int original=n;
        int temp=n;
        int count=0;
        while(n!=0){
            n/=10;
            ++count;
        }
        int rem;
        int ans=0;
        while(temp>0){
            rem=temp%10;
            ans+=Math.pow(rem, count);
            temp/=10;

        }
        if(ans==original) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = s.nextInt();
        System.out.println("Enter the Ending number:  ");
        int end=s.nextInt();
        for(int i=start;i<=end;i++){
            if(isArmstrong(i)){
                System.out.println("The Armstrong numbers are: "+i);
            }
        }
    }
    
}
