package excepitionhandle;
import java.util.*;

public class Exercise {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        try{
        a=s.nextInt();
        b=s.nextInt();
        c=0;
            c=a/b;
        }
         catch(ArithmeticException e){
            System.out.println(e);

         }
         catch(InputMismatchException o){
            System.out.println(o);

         }
         if(c!=0){
         System.out.println("Final Answer:"+c);
         }
    }
    
}
