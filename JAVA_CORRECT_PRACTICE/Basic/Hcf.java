package Basic;
import java.util.*;

public class Hcf {
    static int get_HCF_Of_TwoNumber(int num1,int num2){
        int hcf=1;
        int ans=(num1<num2)?num1:num2;
        while (true) {
            if(num1%ans==0&&num2%ans==0){
                // hcf=ans;
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
        System.out.println(get_HCF_Of_TwoNumber(a,b));
    }
    
}
