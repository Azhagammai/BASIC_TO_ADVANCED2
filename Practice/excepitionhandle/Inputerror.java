package excepitionhandle;
import java.util.*;

public class Inputerror {
    public static void main(String[] args) {
        // java.util.InputMismatchException
        Scanner s=new Scanner(System.in);
        try{
        int n=s.nextInt();//ith block la error aguthu
        }
        catch(Exception e){//Exception-->class , e==>object
            System.out.println(e);//ithula error catch panikum

        }
        System.out.println("Program successfully ended");//error handle panitu ithum print agum
    }
}
