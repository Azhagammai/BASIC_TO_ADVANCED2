import java.util.*;
public class HalfDiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        for(int i=n;i>0;i--){
            for(int j=n-i;j>0;j--){
                 System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
            
        }

    }
}
