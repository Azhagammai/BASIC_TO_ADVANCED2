package looping;
import java.util.*;

public class Methodoverloading {
    public static void main(String args[]){
        int ans=sum(2,4,5);
        System.out.println(ans);
    }
    
    static int sum(int a,int b){
        return a+b; }
    static int sum(int a,int b,int c){
        return a+b+c; }  
    static void sfun(int b){
        System.out.println(b);
         }  

}