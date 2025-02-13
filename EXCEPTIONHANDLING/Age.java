package EXCEPTIONHANDLING;
import java.util.Scanner;

public class Age {
   
    public static void main(final String[] args) {
       Scanner s=new Scanner(System.in);
       int age=s.nextInt();
       
          
                 try{
                    if(age>=18){ 
                System.out.println("Eligible");

            }
            else{
                System.out.println("Not Eligible");
            }
               
            }
            catch( Exception e){
                    System.out.println(e);
                }
           
          
                

          
          
       
        // catch( IllegalArgumentException e){
        //     System.out.println("Not Eligible");
        // }
            // else{
            //     throw new IllegalArgumentException("Not Eligible for Voting"); 
            // }
            

        
        
    }
    
}
