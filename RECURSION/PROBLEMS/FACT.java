package RECURSION.PROBLEMS;


public class FACT {
    static int factorial(int n){
        if(n==0){//base case
            return 1;
        }
        return n*factorial(n-1); // recursive
    }
    public static void main(String[] args) {
        int number=5;
        System.out.println("The factorial of 5 is: "+factorial(number));
    }
}
