package looping;
import java.util.*;
public class Varargu {
    public static void main(String args[]){
       fun(1,2,3,4,5,6);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    
}
 