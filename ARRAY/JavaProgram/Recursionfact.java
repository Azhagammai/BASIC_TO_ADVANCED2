package JavaProgram;
import java.util.*;
public class Recursionfact {
    public static int fact(int num){
        return (num<=1)?1:num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(fact(num));
    }
}
