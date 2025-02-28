import java.util.*;
public class ANAGRAM {
    public static boolean isAnagaram(String n,String m){
        n = n.replaceAll("\\s", "").toLowerCase();
        m = m.replaceAll("\\s", "").toLowerCase();
        if(n.length()!=m.length())return false;
        char ch1[]=n.toCharArray();
        char ch2[]=m.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first name");
    String name1=s.nextLine();
    System.out.println("Enter the second name");
    String name2=s.nextLine();
    if(isAnagaram(name1,name2)){
        System.out.println("It is anagaram");
    }
    else{
        System.out.println("It is not a anagram");
    }
    
  }
  
    
    
}
