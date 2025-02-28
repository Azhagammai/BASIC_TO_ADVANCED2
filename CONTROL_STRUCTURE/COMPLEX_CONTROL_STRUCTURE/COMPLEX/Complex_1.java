package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.COMPLEX;

import java.util.HashMap;
import java.util.Scanner;

public class Complex_1 {

    static HashMap<Integer, Integer> memo = new HashMap<>();
    static int fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    static double calculateTax(double income) {
        if (income <= 10000) return 0;
        else if (income <= 20000) return (income - 10000) * 0.1;
        else if (income <= 30000) return 1000 + (income - 20000) * 0.15;
        return 2500 + (income - 30000) * 0.2;
    }

    static void printPrimes(int start, int end) {
        boolean[] isPrime = new boolean[end + 1];
        for (int i = 2; i <= end; i++) isPrime[i] = true;

        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = Math.max(start, 2); i <= end; i++) {
            if (isPrime[i]) System.out.print(i + " ");
        }
        System.out.println();
    }

    static int getValidInput(Scanner sc) {
        int num;
        do {
            System.out.print("Enter a positive number: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Try again.");
                sc.next();
            }
            num = sc.nextInt();
        } while (num <= 0);
        return num;
    }

    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    static void countCharacters(String str) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(countMap);
    }

    static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int r1 = mat1.length, c1 = mat1[0].length, r2 = mat2.length, c2 = mat2[0].length;
        if (c1 != r2) throw new IllegalArgumentException("Invalid matrix dimensions for multiplication.");
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Fibonacci(10): " + fibonacci(10));

     
        System.out.println("Tax on 25000: " + calculateTax(25000));

        
        System.out.print("Prime numbers between 10 and 50: ");
        printPrimes(10, 50);

       
        System.out.println("Valid number: " + getValidInput(sc));

        
        System.out.println("Is 153 an Armstrong number? " + isArmstrong(153));

       
        int[] sortedArr = {1, 3, 5, 7, 9};
        System.out.println("Index of 7 in sorted array: " + binarySearch(sortedArr, 7));

       
        int[] arr = {4, 2, 7, 1, 9};
        System.out.println("Index of 2: " + linearSearch(arr, 2));

        
        System.out.println("Largest number: " + findLargest(arr));

        
        System.out.print("Character count for 'hello world': ");
        countCharacters("hello world");

        
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        int[][] result = multiplyMatrices(mat1, mat2);
        System.out.println("Matrix multiplication result:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }}
