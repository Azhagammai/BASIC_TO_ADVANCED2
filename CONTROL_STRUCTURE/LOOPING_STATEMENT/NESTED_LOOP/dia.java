import java.util.Scanner;

public class dia {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                 System.out.print("*"+" ");
            }
            // for(int j=2*i-1;j>0;j--){
            //     System.out.print("*");
            // }
            // for(int j=n-i;j>0;j--){
            //     System.out.print(" ");
            // }
            System.out.println();
            
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                 System.out.print("*"+" ");
            }
            System.out.println();
            
        }
}
}