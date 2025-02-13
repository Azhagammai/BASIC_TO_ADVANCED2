import java.util.*;

public class First {
    // Optimized leap year check
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
    static int add(int a,int b){
        return a+b;
    }
    static void multi(int n,int m){
        for(int i=1;i<n;i++){
            System.out.println(i+"*"+m+"="+i*m);
            
        }
    }
        static int hcf(int o, int t) {
            int hcf = 1; // Initialize HCF to 1 (smallest possible value)
            int small = Math.min(o, t); // Smallest of the two numbers
        
            // Iterate from 1 to the smallest number
            for (int i = 1; i <= small; i++) {
                // Check if i is a divisor of both numbers
                if (o % i == 0 && t % i == 0) {
                    hcf = i; // Update HCF
                }
            }
            return hcf; // Return the highest common factor
        }
        static int hcfOfThree(int o, int t, int c) {
            int hcfAB = hcf(o, t); // Find HCF of the first two numbers
            return hcf(hcfAB, c); // Find HCF of the result with the third number
        }
        static int hcff(int p, int az) {
            int hcfff = 1;
            int smalll = Math.min(p, az);
            for (int i = 1; i <= smalll; i++) {  // Fix the loop to iterate correctly
                if (p % i == 0 && az % i == 0) {
                    hcfff = i;  // Update hcfff with the largest common divisor
                }
            }
            return hcfff;
        }
        
        static int lcmtwo(int p, int az) {
            return Math.abs(p * az) / hcff(p, az);  // Calculate LCM of two numbers
        }
        
        static int lcm(int p, int az, int pr) {
            return lcmtwo(lcmtwo(p, az), pr);  // Calculate LCM of three numbers by applying LCM on pairs
        }
        

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        System.out.println("===================="); 
        System.out.print("Enter the a value: ");
        int a = s.nextInt();
        System.out.print("Enter the b value: ");
        int b = s.nextInt();
        System.out.println("===================="); 
        System.out.print("Enter the limit value: ");
        int n = s.nextInt();
        System.out.print("Enter the multiplication number value: ");
        int m = s.nextInt();  
        System.out.println("===================="); 
        System.out.println("HCF of three number"); 
        System.out.println("===================="); 
        System.out.print("Enter the first number: ");
        int o = s.nextInt();      
        System.out.print("Enter the Second number :  ");
        int t = s.nextInt();
        System.out.print("Enter the Third number : ");
        int c = s.nextInt(); 
        System.out.println("LCM of three number");
        System.out.println("====================");
        System.out.print("Enter the first number: ");
        int p = s.nextInt();      
        System.out.print("Enter the Second number :  ");
        int az = s.nextInt(); 
        System.out.print("Enter the Third number : ");
        int pr = s.nextInt(); 

        System.out.println("Find the leap year"); 
        System.out.println(isLeapYear(year)); 
        System.out.println("Sum of two number"); 
        System.out.println(add(a,b)); // Prints true if leap year, false otherwise
        System.out.println("Multiplication table"); 
        multi(n,m);
        System.out.println("HCF of three number"); 
        int result = hcfOfThree(o, t, c);
    
        System.out.println(result); 
        System.out.println("LCM of three number"); 
        System.out.println(lcm(p,az,pr));       
        s.close(); // Closing scanner to avoid resource leak
    }

}