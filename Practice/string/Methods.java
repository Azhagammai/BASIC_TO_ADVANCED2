package string;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n1="Azhagu";
        String n2="Azhagu";
        System.out.println(n1==n2);
        System.out.println("After we use stringpool");
        System.out.println(n1==n2.intern());
        System.out.println("After create new string");
        String n=new String(n2);
        System.out.println(n1==n2);
        System.out.println(n1.length());
        System.out.println((char)'a'+4);
        System.out.println(n1.compareTo(n));
        String str1="6";
        String str2="6";
        System.out.println(String.valueOf(Integer.parseInt(str1)+Integer.parseInt(str2)));
        int i=0;
        System.out.printf("This number is %d",i);
        // String str = "Hello, World!";
        // char[] charArray = new char[5];
        // str.getChars(0, 5, charArray, 0); // Extracts characters from index 0 to 4 (5th character not included)
        // System.out.println(charArray); // Output: Hello
        String h="Azhagu143Pragu";
        char[] ca=new char[h.length()];
        h.getChars(0,h.length(),ca,0);
        System.out.println("Integer to string");
        int b=49;
        String re=String.valueOf(b);
        System.out.println(re);
        // <datatype> parse<Type>(String s)
        System.out.println("String to convert any primitive data type");
        String pookie="143";
        int baby=Integer.parseInt(pookie);
        System.out.println(baby);
        System.out.println("Object that represent as the string using this method");
        // object.toString()
        Integer num=9;
        String meth =num.toString();
        System.out.println(meth);
        int Index1=pookie.indexOf('1');
        System.out.println(Index1);
        String you="Azhagammai";
        System.out.println(you.substring(0,3));
        System.out.println(you.substring(0));
        String[] ou=you.split(0,3);





    }
    
}
