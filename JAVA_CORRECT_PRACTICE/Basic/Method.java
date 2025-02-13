package Basic;
import java.util.*;
public class Method {
    static int cube(int num){
        return num*num*num;
    }
    static int sumofcubes(int number1,int number2){
        // int cube1=
        return cube(number1)+cube(number2);
        // int cube2=
        
    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=s.nextInt();
        System.out.println("Enter the second element:");  
        int b=s.nextInt();
        // Method ob=new Method();
        System.out.println(sumofcubes(a, b)); 
    }
        }
