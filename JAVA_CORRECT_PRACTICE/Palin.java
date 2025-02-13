import java.util.*;
public class Palin {
    static boolean ispalin(String name){
        // Two pointer method==> start ==end compare if that compare is true that is palin or not
        String f=name.replaceAll("^[a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=name.length()-1;
        while(start<end){
            if(name.charAt(start)!=name.charAt(end)){
                    return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String ob=s.nextLine();
        if(ispalin(ob)){  
            System.out.println("This string is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
