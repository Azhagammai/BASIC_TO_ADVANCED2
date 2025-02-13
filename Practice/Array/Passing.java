package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Passing {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a[]={"Azhagu","143","Pragu"};
        char b[]={'b','b','c'};

        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
        System.out.println("The character modify");
        System.out.println(Arrays.toString(b));
        alpha(b);
        System.out.println(Arrays.toString(b));


    }
    static void change(String a[]){
        a[0]="Azhaguu";
    }
    static void alpha(char a[]){
        a[0]='a';

    }
}
