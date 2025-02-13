package Arraypractice;
import java.util.*;

public class Inputtoall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Integer Array Input
        System.out.println("Enter the Integer limitation:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Printing Integer Array
        System.out.println("Integer Array:");
        System.out.println(Arrays.toString(arr));

        // Input and Print for double array
        System.out.println("Enter size of double array:");
        int doubleSize = s.nextInt();
        double[] doubleArray = new double[doubleSize];
        System.out.println("Enter " + doubleSize + " doubles:");
        for (int i = 0; i < doubleSize; i++) {
            doubleArray[i] = s.nextDouble();
        }
        System.out.println("Double Array:");
        System.out.println(Arrays.toString(doubleArray));

        // Input and Print for char array
        System.out.println("Enter size of character array:");
        int charSize = s.nextInt();
        char[] charArray = new char[charSize];
        System.out.println("Enter " + charSize + " characters:");
        for (int i = 0; i < charSize; i++) {
            charArray[i] = s.next().charAt(0);
        }
        System.out.println("Character Array:");
        System.out.println(Arrays.toString(charArray));

        // Input and Print for boolean array
        System.out.println("Enter size of boolean array:");
        int boolSize = s.nextInt();
        boolean[] boolArray = new boolean[boolSize];
        System.out.println("Enter " + boolSize + " booleans (true/false):");
        for (int i = 0; i < boolSize; i++) {
            boolArray[i] = s.nextBoolean();
        }
        System.out.println("Boolean Array:");
        System.out.println(Arrays.toString(boolArray));

        // Input and Print for String array
        System.out.println("Enter size of String array:");
        int stringSize = s.nextInt();
        String[] stringArray = new String[stringSize];
        System.out.println("Enter " + stringSize + " strings:");
        for (int i = 0; i < stringSize; i++) {
            stringArray[i] = s.next();
        }
        System.out.println("String Array:");
        System.out.println(Arrays.toString(stringArray));

        s.close();
    }
}
