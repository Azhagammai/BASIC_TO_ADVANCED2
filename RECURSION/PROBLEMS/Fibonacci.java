package RECURSION.PROBLEMS;

public class Fibonacci {
    public static int fib(int n){
        if(n<=0){
        return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int number=6;
        for(int i=0;i<=number;i++){
            System.out.println("fibonacci numbers: "+fib(i));


    }
    
}
}
