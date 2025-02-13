package StringPractice;
import java.util.*;

public class Index {
    public static void main(String[] args) {
        // String a="Azhagu";
        // String b="Azhagu";
        // String c=new String(b);
        // System.out.println(c);
        // System.out.println(a==c);
        // System.out.println(a.equals(c));
        // String a="Azhagammai";
        // for(int i=0;i<a.length();i++){
        //     System.out.print(a.charAt(i));
        // }
        // for(int i=0;i<=5;i++){
        //     System.out.println(i);
        // }
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=S.nextInt();
        int rem;
        int ans=0;
        for(;a!=0;a/=10){
            rem=a%10;
            // a/=10;
            ans=ans*10+rem;

        }
        System.out.println(ans);


    }
}
