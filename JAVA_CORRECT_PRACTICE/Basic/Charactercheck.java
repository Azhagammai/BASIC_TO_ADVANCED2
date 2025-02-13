package Basic;

import java.util.*;

public class Charactercheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char n=s.next().trim().charAt(0);
        if((char) n=='a'&& (char) n=='e'&& n=='i' && n=='o' && n=='u'){
                System.out.println("It is vowels");
        }
        else
            System.out.println("Consonant");
        for(int i=n;i<='z';i++)
        {
           System.out.println((char)i);
        }
    }
}
