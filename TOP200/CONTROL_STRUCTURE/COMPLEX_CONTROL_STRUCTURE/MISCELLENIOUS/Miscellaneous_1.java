package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.MISCELLENIOUS;



import java.io.*;
import java.util.*;

public class Miscellaneous_1 {

    static double calculator(double a, double b, char operation) {
        switch (operation) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? a / b : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operation.");
        }
    }

   
    static HashMap<Integer, Integer> memo = new HashMap<>();
    
    static int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder password = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return password.toString();
    }

    static void chatApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Chat - Type 'exit' to quit.");
        while (true) {
            System.out.print("You: ");
            String message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            System.out.println("Bot: " + new StringBuilder(message).reverse().toString());  // Simple echo logic
        }
    }

    static void quizProgram() {
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "Which planet is known as the Red Planet?"
        };
        String[] answers = { "Paris", "12", "Mars" };

        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String response = sc.nextLine();
            if (response.equalsIgnoreCase(answers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i]);
            }
        }
        System.out.println("Your final score: " + score + "/" + questions.length);
    }

    static int countWords(String sentence) {
        return sentence.trim().split("\\s+").length;
    }

    static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }

    static List<Integer> generateNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            if (isPrime(num)) primes.add(num);
            num++;
        }
        return primes;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void userDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your country: ");
        sc.nextLine(); // Consume newline
        String country = sc.nextLine();
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    static final String FILE_NAME = "database.txt";

    static void saveToDatabase(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to database.");
        }
    }

    static void readDatabase() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("Database Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading database.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator: 10 + 5 = " + calculator(10, 5, '+'));

       
        System.out.println("Fibonacci(10): " + fibonacci(10));

        
        System.out.println("Random Password: " + generatePassword(10));

       
        chatApp();

       
        quizProgram();

        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Word Count: " + countWords(sentence));

     
        System.out.println("Compressed String (aaabbbccc -> a3b3c3): " + compressString("aaabbbccc"));

        
        System.out.print("First 10 Prime Numbers: ");
        System.out.println(generateNPrimes(10));

        userDetails();

        
        System.out.print("Enter data to store in database: ");
        String data = sc.nextLine();
        saveToDatabase(data);
        readDatabase();

        sc.close();
    }}
