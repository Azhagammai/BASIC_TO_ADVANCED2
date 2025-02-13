import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter the number to sum of all the number till x");
            String f=s.nextLine();
            if (f.equalsIgnoreCase("x")){
                    break;
                
            }
            try{
                Integer d=Integer.parseInt(f);
                sum+=d;
            }
            catch(Exception e){
                System.out.println(e);
            }
            

        }
            System.out.println(sum);    }
}
