import java.util.*;
public class Countt {
    static void fact(int m){
        // why we use sqrt because example m=36 ==>sqrt(36)==>6  athoda factor ===>1*36=36, 2×18, 3×12, 4×9, 6×6
        for(int i=1;i<=Math.sqrt(m);i++){
            if(m%i==0){
                System.out.println(i); //first factor print  aguraku
            
            if(i!=m/i){
                System.out.println(m/i);
            }
        }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int m=s.nextInt();
        fact(m);
        System.out.println("===================");
        System.out.println("Enter the number");
        int n=s.nextInt();
        int count=0;
        while(n>0){
            n/=10;
            count++;

        }
        System.out.println(count);
// array==>length
        }

    }

