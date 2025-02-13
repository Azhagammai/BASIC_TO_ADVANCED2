package StringPractice;
import java.util.*;

public class Splited {
    public static void main(String[] args) {
        String a="Azhagammai";
        System.out.println(a.substring(0));
        System.out.println(a.substring(0,10));
        String b = "Azhagammai is a string";
        
        // Split by space
        String[] ah = b.split("");  // Split by space
        System.out.println(Arrays.toString(ah));  // Print array

        System.out.println(b.subSequence(0,4));
        System.out.println(a.replace('A', 'a'));
        System.out.println(a.replaceAll(a, b));
        System.out.println(a.compareTo(b));
    }
    
}
