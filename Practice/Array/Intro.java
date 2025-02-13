package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        
        // for(int i=0;i<a.length;i++){
        //     a[i]=ob.nextInt();        }
        //  System.out.println(Arrays.toString(a));
        for(int num:a){
            System.out.print(num +" ");
        }
    }
    
}
