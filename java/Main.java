import java.io.*;
import java.util.*;
class Add{
    void sum(){
        int a, b, sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = s.nextInt();
        System.out.println("Enter second number:");
        b = s.nextInt();
        sum = a + b;
        System.out.println("Addition is: " + sum);
        }
} 
class Main{
    public static void main(String args[]){
        Add ob=new Add();
        ob.sum();

        
    }
}