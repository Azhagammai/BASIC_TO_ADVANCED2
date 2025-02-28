import java.util.*;
public class FIBONACCIICHECK {
    public static boolean isperfect(int num){
        int sqrt = (int)Math.sqrt(num);
        return sqrt*sqrt == num;

    }
    public static boolean isfib(int num){
        return isperfect(5*num*num+4)||isperfect(5*num*num-4);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        s.close();
        if(isfib(num)){
            System.out.println("It is fibonocci");
        }
        else{
            System.out.println("It is not a fibonocci number");
        }




    }
    
}
