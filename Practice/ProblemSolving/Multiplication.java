package ProblemSolving;
import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Multiplication Number:");
        int m=in.nextInt();
        System.out.println("Enter the limit");
        int n=in.nextInt();
        multi(m,n);

    }
static void multi(int m,int n){
    for(int i=1;i<=n;i++){
        System.out.println(i+"*"+m+"="+i*m);
    }
}
}
