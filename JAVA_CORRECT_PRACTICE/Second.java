import java.util.*;
public class Second {
    static boolean odd(int a){
        return ((a&1)==1);
    }
    static boolean even( int a){
        return ((a&1)==0);
    }
    static String specific(String greeting,int start,int end){
        String o=greeting.substring(start,end);
        return o;
        
    }
    static int simpleinterest(int p,int t,int r){
        return t*r*p;
    }
    static void operators(char ob,int f,int second){
       
        

    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the a value");
        int a=s.nextInt();
        System.out.println("Odd or not");
        System.out.println(odd(a));
        System.out.println("Even or not");
        System.out.println(even(a));
        s.nextLine();
        System.out.println("Enter the name:");
        String name=s.nextLine();
        System.out.println("Enter the starting point:");
        int start=s.nextInt();
        System.out.println("enter the ending point:");
        int end=s.nextInt();
        System.out.println("Specific name");
        System.out.println(specific(name,start,end));
        System.out.println("Enter the p,r,t");
        int principal =s.nextInt();
        int time=s.nextInt();
        int rate=s.nextInt();
        System.out.println(simpleinterest(principal,time,rate));
        System.out.println("Enter the operator and operands:");
        char ob=s.nextLine().charAt(0);
        int f=s.nextInt();
        int second=s.nextInt();
        operators(ob,f,second);

        
        
        


    }
}
