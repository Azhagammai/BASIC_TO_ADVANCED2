package CONTROL_STRUCTURE.DECISION_MAKING.NORMALIF_ELSE_STATEMENT;

import java.util.Arrays;
import java.util.Scanner;

public class FIRST {
    public static void isCheck() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt();
        if (number > 0) System.out.println("It is a positive number");
        else if (number < 0) System.out.println("It is a negative number");
        else System.out.println("Zero");
    }

    public static void isEvenOdd() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt();
        if (number % 2 == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }

    public static void isDivisibleBy3And5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt();
        if (number % 3 == 0 && number % 5 == 0) System.out.println("Divisible by both 3 and 5");
        else System.out.println("Not divisible by both 3 and 5");
    }

    public static void isLargest() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = s.nextInt(), num2 = s.nextInt(), num3 = s.nextInt();
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println(largest + " is the largest");
    }

    public static void isPrime() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt();
        if (number <= 1) {
            System.out.println("It is not a prime number");
            return;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("It is not a prime number");
                return;
            }
        }
        System.out.println("It is a prime number");
    }

    public static void isLeapYear() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = s.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println("It is a leap year");
        else System.out.println("It is not a leap year");
    }

    public static void isPalindrome() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt(), original = number, reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        if (reverse == original) System.out.println(original + " is a Palindrome");
        else System.out.println(original + " is not a Palindrome");
    }

    public static void isVowel() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = s.next().charAt(0);
        if ("AEIOUaeiou".indexOf(c) != -1) System.out.println(c + " is a VOWEL");
        else System.out.println(c + " is a CONSONANT");
    }

    public static void isPerfectSquare() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt();
        double sqrt = Math.sqrt(number);
        if ((int) sqrt * (int) sqrt == number) System.out.println("It is a perfect square");
        else System.out.println("It is not a perfect square");
    }

    public static void isArmstrong() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt(), original = number, temp = number, remainder, answer = 0, count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        temp = number;

        while (temp > 0) {
            remainder = temp % 10;
            answer += Math.pow(remainder, count);
            temp /= 10;
        }
        if (answer == original) System.out.println(original + " is an Armstrong number");
        else System.out.println(original + " is not an Armstrong number");
    }

    public static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }

    public static void isPerfectNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt(), sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        if (sum == number) System.out.println("It is a perfect number");
        else System.out.println("It is not a perfect number");
    }

    public static void countDigits() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = s.nextInt(), count = 0, temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println("The digit count is: " + count);
    }

    public static void isPalindromeString() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.nextLine(), rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev)) System.out.println(str + " is a Palindrome");
        else System.out.println(str + " is NOT a Palindrome");
    }

    public static void isAnagram(String s, String t) {
        if (s.length() != t.length()) System.out.println( false); 

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));
    }
   
   public static boolean isAutomorphic(){
    Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        s.close();
        if(number<0)number=-number;
        int square=number*number;
    while(number>0){
        if(number%10==square%10)return true;
        
        
        number/=10;
        square/=10;
    }
    return false;

   }
   
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int number = s.nextInt();
        // String sg="clinent";
        // String sv="silent";
        // isAnagram(sg,sv);
        
        // isCheck();
        // isEvenOdd();
        // isDivisibleBy3And5();
        // isLargest();
        // isPrime();
        // isLeapYear();
        // isPalindrome();
        // isVowel();
        // isPerfectSquare();
        // isArmstrong();
        // System.out.println("Factorial: " + factorial(number));
        // isPerfectNumber();
        // countDigits();
        // isPalindromeString();
        isAutomorphic();
        if(isAutomorphic()){
            System.out.println("It is Automorphic number");
        }
        else{
            System.out.println("It is not a Automorphic number");
        }

        // s.close();
    }
}
