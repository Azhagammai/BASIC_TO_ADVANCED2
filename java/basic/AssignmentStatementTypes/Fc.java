package basic.AssignmentStatementTypes;
import java.util.Scanner;

public class Fc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Farenheit:");
        float f=s.nextFloat();
        System.out.println((f-32)*5/9);
        System.out.println("Enter the Celsius:");
        float c=s.nextFloat();
        System.out.println((c*9/5)+32);
        
    }
    
}
