package PROBLEMS;
import java.util.*;
public class Prime_with_range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int start =s.nextInt();
        int end=s.nextInt();
        int max=0;
        // int num=s.nextInt();
        for(int num=start;num<=end;num++){
          
            if(num<=1) continue;
            boolean isprime= true;
            for(int i=2;i*i<=end;i++){
                
                if(num%i==0) 
                     isprime =false;
                     break;
            }
          
            // if(isprime){
            //     if(max<num)
            //         max=num;
               
            // }
            do {
                if (isprime) {
                    if(max<num)
                    max = num;
                    break;
                }
                
            } while (end >= start);
        }
        System.out.println(max);
        }
    
}
