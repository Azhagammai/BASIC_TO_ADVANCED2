package C_JAVA.JAVA.JAVA_ARRAY.NUMBER_ARRAY;
import java.util.*;

public class Consecutive {
    public static void fun(int num) {
        // Base case to stop recursion
        if (num <= 0) {
            System.out.println(num);
            return;
        }

        if (num < 0) {
            num += 3;
        } else {
            num -= 3;
        }

        fun(num); // Recursive call
        System.out.println(num); // Print after recursion to show sequence
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        s.close();

        fun(number);
    }
}
