package Basic;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /* =====args[] this a array that store the string
        System.out.println("Hello World!");
        System.out.println(1);
        System.out.println('A');
        System.out.println(1000000);
        System.out.println("'A'+3");
        System.out.println('A'+3);
        System.out.println('A'+0);
        System.out.print("1 3 4");

        */
        // int a=s.nextInt();
        // char c=s.next().trim().charAt(0);
        // String b=s.next();
        // String p=s.nextLine();
        
         while (true) {
            System.out.println("Please enter an integer: ");
            
            try {
                
                while(s.hasNext()){

                    Integer n = s.nextInt();  // Read the integer input
                    System.out.println("You entered: " + n);  // Output the integer
                    break;  // Exit the loop if valid input is received
            } }catch (InputMismatchException e) {
                System.out.println("Input only allows integers. Please try again.");
                s.nextLine();  // Consume the invalid input
            }
        }
        // try{
        // {
        //     Integer n=s.nextInt();
        //     System.out.println(n);
        // }}
        // catch(Exception e)  {
        //     System.out.println("Input only allow integer");
        
        // }      
       
     
    }
}
