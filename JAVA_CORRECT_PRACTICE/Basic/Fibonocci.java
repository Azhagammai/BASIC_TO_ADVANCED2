package Basic;
import java.util.*;


public class Fibonocci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n;i++){
           
            // if(b==1){
            //     System.out.println(1);
            // }

            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);

            
           
        }

       

    }
    
}
