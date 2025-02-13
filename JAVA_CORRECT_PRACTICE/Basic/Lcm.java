package Basic;
import java.util.*;

public class Lcm {
    static int get_LCM_Of_TwoNumber(int num1,int num2){
        int ans=(num1>num2)? num1: num2;
        while (true) {
            if(ans%num1==0 && ans%num2==0){
                break;
            }
            ans++;
        }
        return ans;
     } 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(get_LCM_Of_TwoNumber(a,b));
    }
}
