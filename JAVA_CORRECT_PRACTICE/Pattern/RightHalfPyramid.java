package Pattern;
import java.util.*;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=5;
        System.out.println("==========RightHalfPyramid Pattern=======");
        for(int i=0;i<n;i++){
            // for(int k=0;k<2*(n-i-1);k++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++)
                // System.out.print((char) (j+'A') +" ");
                System.out.print(j);
            System.out.println("\n");
        }
    }
}
