package ProblemSolving;
import java.util.*;

public class HcfAndLcm {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=in.nextInt();
        System.out.println("Enter the num2");
        int num2=in.nextInt();
        hcf(num1,num2);
        
        
    }
static void hcf(int a,int b){
    int hcff=0;
    if(a>b){
        for(int i=1;i<=b;i++){
            if(a%i==0&&b%i==0){
                hcff=i;
            }
        }
    }
    else{
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                hcff=i;
            }
        }

    }
    int lcm=(a*b)/hcff;
    System.out.println("The LCM of "+a+" and " +b+" is:" +lcm);

    System.out.println("The HCF of "+a+" and " +b+" is:" +hcff);
    if(hcff==1){
        System.out.println("The number is co-prime number");
    }
    else{
        System.out.println("The number is not  a co-prime number");
    }
}

}
