public class NestedLoopsExamples {
    
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n) {
        printPyramid(n);
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void checkPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i < 2) continue;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void printNumberAsteriskPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*");
            }
            System.out.println();
        }
    }

    public static void printArrayCombinations(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            for (int j : arr2) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Multiplication Table:");
        printMultiplicationTable();
        
        System.out.println("\nInverted Triangle:");
        printInvertedTriangle(5);
        
        System.out.println("\nPyramid Pattern:");
        printPyramid(5);
        
        System.out.println("\nDiamond Pattern:");
        printDiamond(5);
        
        System.out.println("\nHollow Square Pattern:");
        printHollowSquare(5);
        
        System.out.println("\nNumber Triangle:");
        printNumberTriangle(5);
        
        System.out.println("\nPrime Numbers in Range (1-50):");
        checkPrimeNumbers(1, 50);
        
        System.out.println("\nPascal's Triangle:");
        printPascalsTriangle(5);
        
        System.out.println("\nNumber Asterisk Pattern:");
        printNumberAsteriskPattern(5);
        
        System.out.println("\nArray Combinations:");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        printArrayCombinations(arr1, arr2);
    }
}
