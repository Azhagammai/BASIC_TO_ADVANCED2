import java.io.*;
import java.util.*;
class Numbers{
    int a, b, sum;
    void print(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = s.nextInt();
        System.out.println("Enter second number:");
        b = s.nextInt();
        
        }
}
class Display extends Numbers{
    void put(){
        sum = a + b;
        System.out.println("Addition is: " + sum);

    }
}
class Inherit{
    public static void main(String args[]){
        Display l=new Display();
        l.print();
        l.put();
    }
}