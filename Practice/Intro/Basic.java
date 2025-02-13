package Intro;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Scanner input = new Scanner(System.in);
        // System.out.println(input.nextLine());
        int a = 10; 
        // Primitive data type
        // int rollno = 64;
        // char letter = 'r';
        // float marks = 98.67f;
        // double largeDecimalNumbers = 4567654.4567;
        // long largeInteger = 34567834567876543L;
        // boolean check = false;
        a=in.nextInt();
        if (a == 10) {
            System.out.println("Hello World");
       }
       int count = 1;
       while(count != 5) {
           System.out.println(count);
           count++;

       }
       
    }
}
