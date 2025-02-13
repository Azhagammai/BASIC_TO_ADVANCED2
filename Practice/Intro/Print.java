package Intro;
import java.util.*;

public class Print {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 2;
        if(n<=1){
            System.out.println("Not prime");
            return;
        }

        // If the intention is to print numbers starting from 2 up to but not exceeding 'n'
        while (cnt*cnt <= n) {  // Corrected condition to ensure cnt does not exceed 'n'
            if (n % cnt == 0) {
                System.out.println("Not Prime");
            return;
        }
            cnt++;
        // c++;
    }
   

        System.out.println("Prime");
           
        }
    }
