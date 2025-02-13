package Intro;
import java.util.*;

public class Typecast {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = in.nextInt();

        System.out.print("Enter integer b: ");
        int b = in.nextInt();

        // Explicit typecasting (narrowing)
        byte c = (byte) a;         // int to byte
        short s = (short) a;       // int to short
        long l = (long) a;         // int to long
        float f = (float) a;       // int to float
        double d = (double) a;     // int to double

        System.out.println("Typecasting examples:");
        System.out.println("Original int a: " + a);
        System.out.println("Int to byte (may overflow): " + c); 
        System.out.println("Int to short: " + s);
        System.out.println("Int to long: " + l);
        System.out.println("Int to float: " + f);
        System.out.println("Int to double: " + d);

        // Example of casting a larger type to a sm2aller type
        double doubleValue = 300.99;
        int intValue = (int) doubleValue;  // Double to int, fraction is lost
        System.out.println("Double to int (fraction lost): " + intValue);

        // Explicit casting of char
        char ch = 'A';
        int chInt = (int) ch;  // Char to int
        System.out.println("Char to int: " + chInt);
    }
}
 