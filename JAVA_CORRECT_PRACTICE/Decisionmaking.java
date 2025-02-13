import java.util.*;
public class Decisionmaking {
    static void prin(int n){
        for(int i=0;i<=n;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("==========");
        int sum=0;
        for(int i=n;i>=0;i--){
            sum+=i;
            
        }
        System.out.println("The sum of N number is:" +sum);
        
    }
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        System.out.println("Enter the number:");
      
        int l=Integer.MIN_VALUE;
        int number;
        while(true){
            number=s.nextInt();
            System.out.println("Enter the number -1 for exit");
            if(number==-1){
                
                break;
            }
            
            if(number>l){
               l =number;
            }
        }
        if(l==number){
            System.out.println("No were minvalue");
        }
        else{
            System.out.println("The largeat number is:" +l);
        }

        prin(n);
      
        s.close();
    }
}
