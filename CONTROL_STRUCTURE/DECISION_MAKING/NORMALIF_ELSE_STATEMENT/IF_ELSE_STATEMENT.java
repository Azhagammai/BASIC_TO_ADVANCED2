package CONTROL_STRUCTURE.DECISION_MAKING.NORMALIF_ELSE_STATEMENT;
import java.util.*;
public class IF_ELSE_STATEMENT {
    
    // // 1. Check whether a number is positive or negative (O(1))
    // public static void checkPositiveNegative(int num) {
    //     if (num > 0) System.out.println(num + " is Positive");
    //     else if (num < 0) System.out.println(num + " is Negative");
    //     else System.out.println("Zero");
    // }
    
    // 2. Check whether a number is even or odd (O(1))
    // public static void checkEvenOdd(int num) {
    //     System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
    // }
    
    // // 3. Check divisibility by 3 and 5 (O(1))
    // public static void checkDivisibility(int num) {
    //     if (num % 3 == 0 && num % 5 == 0) System.out.println(num + " is divisible by 3 and 5");
    //     else System.out.println(num + " is not divisible by 3 and 5");
    // }
    
    // // 4. Find the largest of three numbers (O(1))
    // public static void findLargest(int a, int b, int c) {
    //     System.out.println("Largest: " + Math.max(a, Math.max(b, c)));
    // }
    
    // 5. Check whether a number is prime (O(√N))
    // public static boolean isPrime(int num) {
    //     if (num <= 1) return false;
    //     for (int i = 2; i * i <= num; i++) {
    //         if (num % i == 0) return false;
    //     }
    //     return true;
    // }
    
    // // 6. Check whether a year is a leap year (O(1))
    // public static boolean isLeapYear(int year) {
    //     return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    // }
    
    // 7. Find the greatest of four numbers (O(1))
    // public static void findGreatest(int a, int b, int c, int d) {
    //     System.out.println("Greatest: " + Math.max(a, Math.max(b, Math.max(c, d))));
    // }
    
    // 8. Check if a number is a palindrome (O(N))
    // public static boolean isPalindrome(int num) {
    //     int original = num, reverse = 0;
    //     while (num > 0) {
    //         reverse = reverse * 10 + num % 10;
    //         num /= 10;
    //     }
    //     return original == reverse;
    // }
    
    // 9. Check if a character is a vowel or consonant (O(1))
    public static void checkVowel(char ch) {
        if ("AEIOUaeiou".indexOf(ch) != -1) System.out.println(ch + " is a Vowel");
        else System.out.println(ch + " is a Consonant");
    }
    
    // 10. Find the smallest of three numbers (O(1))
    public static void findSmallest(int a, int b, int c) {
        System.out.println("Smallest: " + Math.min(a, Math.min(b, c)));
    }
    
    // 11. Check if a number is perfect (O(N))
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) sum += i + (i == num / i ? 0 : num / i);
        }
        return sum == num && num != 1;
    }
    
    // 12. Check Armstrong number (O(logN))
    public static boolean isArmstrong(int num) {
        int sum = 0, original = num, digits = (int) Math.log10(num) + 1;
        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == original;
    }
    
    // 13. Factorial using recursion (O(N))
    public static int factorial(int num) {
        return num == 0 ? 1 : num * factorial(num - 1);
    }
    
    // 14. Check if a number is automorphic (O(logN))
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return square % (int) Math.pow(10, (int) Math.log10(num) + 1) == num;
    }
    
    // 15. Fibonacci number check (O(1))
    public static boolean isFibonacci(int num) {
        int x = 5 * num * num;
        return isPerfectSquare(x + 4) || isPerfectSquare(x - 4);
    }
    
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    // 16. Count digits in a number (O(logN))
    public static int countDigits(int num) {
        return num == 0 ? 1 : (int) Math.log10(num) + 1;
    }
    
    // 17. String palindrome check (O(N))
    public static boolean isStringPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    
    // 18. Check if two strings are anagrams (O(N log N))
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        // checkPositiveNegative(-5); // Output: Negative
        // checkEvenOdd(10); // Output: Even
        // checkDivisibility(15); // Output: Divisible by 3 and 5
        // findLargest(3, 7, 9); // Output: 9
        // System.out.println(isPrime(11)); // Output: true
        // System.out.println(isLeapYear(2024)); // Output: true
        // findGreatest(4, 7, 2, 9); // Output: 9
        // System.out.println(isPalindrome(121)); // Output: true
        checkVowel('a'); // Output: Vowel
        findSmallest(5, 8, 2); // Output: 2
    }
}
