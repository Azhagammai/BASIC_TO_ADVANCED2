//string is immutable we can't change object in a heap ;  mutable verson of string is stringbuilder,stringbuffer.
public class lengthofstring {
    public static void main(String[] args) {
        String ch="Hello";
        int n=0;
        try {
            while (true) {
                ch.charAt(n);  // Try accessing characters
                n++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(n);  // Output: 5
        }
    }
}
