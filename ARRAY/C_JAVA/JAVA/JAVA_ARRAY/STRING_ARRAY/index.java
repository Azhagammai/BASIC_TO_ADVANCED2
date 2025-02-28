import java.util.Scanner;
//string is immutable we can't change object in a heap ;  mutable verson of string is stringbuilder,stringbuffer.
public class index {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // char str[]={{"Hello"},{"JI"}};--> we can't do this
        String str ="Hello";
        // System.out.println(str[0]); --> it is not posile 
        System.out.println(str.charAt(1));
        String arr[]={"Hello","HI"};
        System.out.println(arr[0]);
        s.close();

    }
}
