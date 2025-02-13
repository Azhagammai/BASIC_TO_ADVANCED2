package Linearsearch;

public class Main {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int target=100;
        boolean ans=linearSearch3(a,target);
        System.out.println(ans);
    }
    static boolean linearSearch3(int[] arr,int tar){
        if(arr.length==0){
            return false;

        }
        for(int num:arr){
            if(num==tar){
                return true;

            }
        }
        return false;

    }

    
}
