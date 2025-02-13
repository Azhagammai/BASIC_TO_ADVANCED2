import java.util.*;

public class Greatest {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=0;
        max=Math.max(c,Math.max(a,b));
        System.out.println(max);
        
    }
}