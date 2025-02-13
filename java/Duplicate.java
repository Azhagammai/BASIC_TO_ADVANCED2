/******************************************************************************

                            Online Java Debugger.
                Code, Run and Debug Java program online.
Write your code in this editor and press "Debug" button to debug program.

*******************************************************************************/
import java.util.*;
public class Main

{
	public static void main(String[] args) {
	    
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int n = s.nextInt();
System.out.println("Enter the number that you want find the count of Duplicate");
int i = s.nextInt();
int count = 0;

while (n > 0) {
    int rem = n % 10;
    if (rem == i) {
    count++;
}
 n /= 10;
}
System.out.println(count);
	}
}