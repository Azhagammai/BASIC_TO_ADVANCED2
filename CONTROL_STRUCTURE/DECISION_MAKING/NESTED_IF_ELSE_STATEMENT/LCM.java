package CONTROL_STRUCTURE.DECISION_MAKING.NESTED_IF_ELSE_STATEMENT;

import java.util.Scanner;

public class LCM {
    public static void islcm(int a,int b){
        int maximum=Math.max(a, b);
        int hcf=1;
        if(a%maximum==0&&b%maximum==0)System.out.println(maximum+" is ");
        
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a=s.nextInt(0);
        int b=s.nextInt();
        islcm(a,b);
    }
    
}
