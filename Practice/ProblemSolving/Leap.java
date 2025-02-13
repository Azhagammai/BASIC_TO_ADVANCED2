package ProblemSolving;
import java.util.*;

public class Leap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year:");
        int y=s.nextInt();
        year(y);

        
    }
static void year(int y){
    if(y%4==0 && (y%400==0||y%100!=0)){
        System.out.println("This " + y +" is leap year");
    }
    else{
        System.out.println("This "+ y+ " is not a leap year");
    }

}
    
}
