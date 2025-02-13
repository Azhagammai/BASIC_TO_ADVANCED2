package excepitionhandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nextederror {
    public static void main(String[] args) {
        // java.util.InputMismatchException
        Scanner s=new Scanner(System.in);
        try{
        int n=s.nextInt();
        int b=10/0;//ith block la error aguthu
        }
        catch(ArithmeticException e){//Exception-->class , e==>object
            System.out.println(e);//ithula error catch panikum

        }
        catch(InputMismatchException o){
            System.out.println(o);
        }
        System.out.println("Program successfully ended");//error handle panitu ithum print agum
    }
    
}
