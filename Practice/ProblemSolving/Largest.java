package ProblemSolving;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt(); 
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(Math.max(c,Math.max(a,b)));

    }
    
}
