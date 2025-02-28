package NESTED_IF_ELSE_STATEMENT;
import java.util.Scanner;

public class DAY_OF_WEEK_BRUTE {
    public static boolean isleapyear(int year){
        if((year%4==0&&year%100!=0)||(year%400==0))return true;
        return false;

    }
    public static int countdays(int year,int month,int day,int[] daysInMonth){
        int totaldays=0;
        //add days from a full year
        for(int y=1900;y<year;y++)totaldays+=isleapyear(y)?366:365;

      // Add days from full months of the current year
      for(int m=0;m<month-1;m++)totaldays+=daysInMonth[m];
      totaldays+=day-1;
      return totaldays;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=s.nextInt();
        System.out.println("Enter the month(1-12): ");
        int month=s.nextInt();
        System.out.println("Enter the day (1-31): ");
        int day=s.nextInt();
        int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isleapyear(year)){
            daysInMonth[1]=29;
        }
        int totaldays=countdays(year,month,day,daysInMonth);
        int dayIndex=(totaldays+1)%7;
        String dayofweek;
        if(dayIndex==0){
            dayofweek="Monday";
        }else if(dayIndex==1){
            dayofweek="Tuesday";
        }else if(dayIndex==2){
            dayofweek="Wednesday";
        }
        else if(dayIndex==3){
            dayofweek="Thursday";
        }
        else if(dayIndex==4){
            dayofweek="Friday";
        }
        else if(dayIndex==5){
            dayofweek="Saturday";
        }
        else{
            dayofweek="Sunday";
        }
        System.out.println("The given date falls on: "+dayofweek);
        s.close();


    }
    
}
