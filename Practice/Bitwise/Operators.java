package Bitwise;
import java.util.*;
public class Operators {
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println(and(a,b));
    System.out.println(or(a,b));
    System.out.println(exor(a,b));
    System.out.println(leftshift(a,b));
    System.out.println(rightshift(a,b));
} 
static int and(int a,int b){
    return a&b;
    
}
static int or(int a,int b){
    return a|b;
    
}
static int exor(int a,int b){
    return a^b;
    
}
static int leftshift(int a,int b){
    return a<<1;
    
}
static int rightshift(int a,int b){
    return a>>1;
}
}
