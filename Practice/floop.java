import java.util.Scanner;

public class floop {
    public static void main(String[] args) {
        // for(int i=0;i<=5;i++){
        //     System.out.print(i+" ");
        // }
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        while (i<=5)
        {
            System.out.println(i);
            i++;
        }
        
    }
}
