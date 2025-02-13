import java.io.*;
import java.util.*;
class Add{
    Add(){
        int a,b,square;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the a value:");
        a=s.nextInt();
        square=a*a;
        System.out.println("The square value:"+square);

    }

}
class  Constructor{
    public static void main(String args[]){
        Add o=new Add();
    }
}