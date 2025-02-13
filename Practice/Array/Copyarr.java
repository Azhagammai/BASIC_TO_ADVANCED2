package Array;

import java.util.Arrays;

public class Copyarr {
    public static void main(String[] args) {
        String affection[]={"Azhagu","Pragu","Pramizh"};
        String a[]=new String[2];
        System.arraycopy(affection,0,a,0,2);
        System.out.println(Arrays.toString(a));



    }
    
}
