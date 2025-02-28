public class FOR_LOOP_TASK {
    

        public static void pyramidPattern(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void reverseTriangle(int n) {
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static int findLargest(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    
        public static void printSquares(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.print((i * i) + " ");
            }
            System.out.println();
        }
    
        public static int countEvens(int start, int end) {
            int count = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    
        public static void printPrimes(int start, int end) {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
        private static boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    
        public static int sumArray(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    
        public static double averageArray(int[] arr) {
            int sum = sumArray(arr);
            return (double) sum / arr.length;
        }
    
        public static void numberPattern(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    
        public static void pascalsTriangle(int n) {
            for (int i = 0; i < n; i++) {
                int number = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int[] array = {1, 3, 5, 7, 9};
            int n = 5;
    
            System.out.println("Pyramid Pattern:");
            pyramidPattern(n);
    
            System.out.println("Reverse Triangle Pattern:");
            reverseTriangle(n);
    
            System.out.println("Largest Number in Array: " + findLargest(array));
    
            System.out.println("Squares Series:");
            printSquares(n);
    
            System.out.println("Even Numbers Count: " + countEvens(1, 10));
    
            System.out.println("Prime Numbers Between 1 and 20:");
            printPrimes(1, 20);
    
            System.out.println("Sum of Array Elements: " + sumArray(array));
    
            System.out.println("Average of Array Elements: " + averageArray(array));
    
            System.out.println("Number Pattern:");
            numberPattern(n);
    
            System.out.println("Pascal's Triangle:");
            pascalsTriangle(n);
        }
    }
    
    

