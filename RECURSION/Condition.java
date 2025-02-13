package RECURSION;

public class Condition {
    static int count=1;
        public static void fun(){
          
            if(count==4)       
               return;
            // break; it is only looping 
        System.out.println(count);
           
        count++;
        fun();
        
    }

    public static void main(String[] args) {
        fun();
    }
    
}
