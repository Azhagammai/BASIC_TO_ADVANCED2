import java.util.Scanner;

public class NestedLoops {
    
    public static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        printMatrix(transposed);
    }
    
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        String vowelSet = "AEIOUaeiou";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowelSet.contains(String.valueOf(ch))) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
    
    public static void multiplicationMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
    
    public static void alphabetPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    public static void findPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static int[][] create2DArray(int rows, int cols, Scanner scanner) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    
    public static void printDiagonals(int[][] matrix) {
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < matrix.length; i++) System.out.print(matrix[i][i] + " ");
        System.out.println();
    }
    
    public static void numberGrid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static void christmasTree(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) System.out.print(" ");
            for (int j = 0; j <= i * 2; j++) System.out.print("*");
            System.out.println();
        }
    }
    
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter size of matrix:");
        int size = scanner.nextInt();
        int[][] matrix = create2DArray(size, size, scanner);
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        System.out.println("Transpose Matrix:");
        transposeMatrix(matrix);
        
        System.out.println("Diagonal Elements:");
        printDiagonals(matrix);
        
        System.out.println("Enter a string to count vowels and consonants:");
        scanner.nextLine();
        String str = scanner.nextLine();
        countVowelsConsonants(str);
        
        System.out.println("Multiplication Matrix:");
        multiplicationMatrix(5);
        
        System.out.println("Alphabet Pattern:");
        alphabetPattern(5);
        
        System.out.println("Prime Numbers between 10 and 50:");
        findPrimes(10, 50);
        
        System.out.println("Number Grid:");
        numberGrid(5);
        
        System.out.println("Christmas Tree:");
        christmasTree(5);
        
        System.out.println("Matrix Addition:");
        int[][] matrixB = create2DArray(size, size, scanner);
        int[][] result = addMatrices(matrix, matrixB);
        printMatrix(result);
        
        scanner.close();
    }
}