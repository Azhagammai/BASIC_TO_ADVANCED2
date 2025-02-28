import java.util.*;
public class AUTOMORPHIC {
    public static boolean isAuto(int n){
        if(n<0)n=-n;
        int square=n*n;
        while(n>0){
            if(n%10==square%10)return true;
            n/=10;
            square/=10;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        s.close();
        if(isAuto(number)){
            System.out.println("It is automorphic");
        }
        else{
            System.out.println("It is not a Automorphic");
        }
        
    }
    
}
