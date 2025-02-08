import java.util.Scanner;
public class CreditCardValidator {
    static boolean isValid(long num) {
        String str = Long.toString(num);
        int sum = 0, len = str.length();
        boolean doubleDigit = false;

        for (int i = len - 1; i >= 0; i--) {
            int digit = str.charAt(i) - '0';
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) digit -= 9;
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number: ");
        long num = sc.nextLong();

        System.out.println(isValid(num) ? "Valid Card" : "Invalid Card");
        sc.close();
    }
}
