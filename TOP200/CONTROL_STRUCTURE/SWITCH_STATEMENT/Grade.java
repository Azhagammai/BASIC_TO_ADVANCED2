import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
        } else {
            switch (marks / 10) {
                case 10, 9 -> System.out.println("Grade A");  // 90-100
                case 8 -> System.out.println("Grade B");      // 80-89
                case 7 -> System.out.println("Grade C");      // 70-79
                case 6 -> System.out.println("Grade D");      // 60-69
                case 5 -> System.out.println("Grade E");      // 50-59
                default -> System.out.println("Grade F (Fail)"); // Below 50
            }
        }

        scanner.close();
    }
}
