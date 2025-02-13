package RECURSION.PROBLEMS;

public class Sumofn {
    // public static int sum(int i,int summ){
    //     if(i<1)
    //         return summ ;
    //     return sum(i-1,summ+i);
    // }
    // public static void main(String[] args) {
    //     int i=0;
    //     int number=2;
    //     System.out.println(sum(number,0));
        
       
    // }
    static int sum(int n){
        if(n<=1){
            return n;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(sum(n));
    }
    
}
 