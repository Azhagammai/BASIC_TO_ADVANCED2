package Basic;
import java.util.*;
public class Loops {
    static void iscount(int n){
        // for loop
        int count=0;
        for(int i=1;i<=n;i++){
            System.out.println(i);
            count++;
           
        }
        System.out.println("====COUNT======");
        System.out.println(count);
        System.out.println("===   ODD   ========");
       
        for(int j=1;j<=n;j+=2){
            System.out.println(j);
        }
        System.out.println("=====  EVEN  ======");
        for(int k=2;k<=n;k+=2){
            System.out.println(k);
        }
        System.out.println("=========reverse====");
        for(int l=n;l>=0;l--){
            System.out.println(l);
        }

       
     

    }
    static int islcm(int num1,int num2,int highestnumber){
        
        while(true){
        // for(int i=highestnumber;;i++){
            if(highestnumber%num1==0 &&highestnumber%num2==0){
                    return highestnumber;
            }
            highestnumber++;
            

        }
     
       
    }
    static void iswhile(int number){
        Scanner s = new Scanner(System.in);
        System.out.println("If you want to exit the loop, you should print 'x':");

        // Initial user input
        String x = s.nextLine();

        // While loop continues until 'x' is entered
        while (!(x.equals("x"))) {
            System.out.println(number); // Print the given number

            // Prompt the user for input again to continue or exit
            System.out.println("Enter 'x' to exit, or any other key to continue:");
            x = s.nextLine(); // Update the value of 'x'
        }

        System.out.println("Loop has been exited.");
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter the iteration limit:");
        int n=s.nextInt();
        System.out.println("================================");
        iscount(n);
        System.out.println("==========LCM====================");
        System.out.println("Enter the number1:");
        int num1=s.nextInt();
        System.out.println("Enter the number2:");
        int num2=s.nextInt();
        int highestnumber=(num1>num2)?num1:num2;
        System.out.println(islcm(num1,num2,highestnumber));
        System.out.println("=========whileloop--no iteration unlnown======");
        System.out.println("Enter the input:");
        int number=s.nextInt();
        iswhile(number);
        char start=s.next().trim().charAt(0);
        for(int i=start;i<='z';i++){
                System.out.println((char)i);
        }
    }
    
}
