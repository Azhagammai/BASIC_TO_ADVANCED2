package CONTROL_STRUCTURE.COMPLEX_CONTROL_STRUCTURE.ADVANCED;

import java.util.*;

public class Advanced_2 {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Advanced_2 program = new Advanced_2();


       program.weatherApp();
       program.bubbleSort();
       program.insertionSort();
       program.quickSort();
       program.selectionSort();
       program.binarySearch();
       program.bankAccountManagement();
       program.linearSearch();
       program.depthFirstSearch();
       program.breadthFirstSearch();
   }

   void weatherApp() {
       System.out.println("Enter temperature: ");
       int temp = scanner.nextInt();
       if (temp < 0) System.out.println("It's freezing!");
       else if (temp < 20) System.out.println("It's cold");
       else System.out.println("It's warm");
   }

   void bubbleSort() {
       int[] arr = {5, 3, 8, 1, 2};
       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = 0; j < arr.length - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }
       System.out.println("Sorted array: " + Arrays.toString(arr));
   }

   void insertionSort() {
       int[] arr = {9, 7, 5, 3, 1};
       for (int i = 1; i < arr.length; i++) {
           int key = arr[i];
           int j = i - 1;
           while (j >= 0 && arr[j] > key) {
               arr[j + 1] = arr[j];
               j--;
           }
           arr[j + 1] = key;
       }
       System.out.println("Sorted array: " + Arrays.toString(arr));
   }

   void quickSort() {
       int[] arr = {10, 7, 8, 9, 1, 5};
       quickSortHelper(arr, 0, arr.length - 1);
       System.out.println("Sorted array: " + Arrays.toString(arr));
   }

   void quickSortHelper(int[] arr, int low, int high) {
       if (low < high) {
           int pi = partition(arr, low, high);
           quickSortHelper(arr, low, pi - 1);
           quickSortHelper(arr, pi + 1, high);
       }
   }

   int partition(int[] arr, int low, int high) {
       int pivot = arr[high];
       int i = low - 1;
       for (int j = low; j < high; j++) {
           if (arr[j] < pivot) {
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;
       return i + 1;
   }

   void selectionSort() {
       int[] arr = {29, 10, 14, 37, 13};
       for (int i = 0; i < arr.length - 1; i++) {
           int minIndex = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
       System.out.println("Sorted array: " + Arrays.toString(arr));
   }

   void binarySearch() {
       int[] arr = {1, 3, 5, 7, 9};
       System.out.print("Enter number to search: ");
       int target = scanner.nextInt();
       System.out.println("Found at index: " + binarySearchHelper(arr, target, 0, arr.length - 1));
   }

   int binarySearchHelper(int[] arr, int target, int low, int high) {
       if (low > high) return -1;
       int mid = low + (high - low) / 2;
       if (arr[mid] == target) return mid;
       return target < arr[mid] ? binarySearchHelper(arr, target, low, mid - 1) : binarySearchHelper(arr, target, mid + 1, high);
   }

   void bankAccountManagement() {
       class BankAccount {
           int balance = 1000;
           void deposit(int amount) { balance += amount; }
           void withdraw(int amount) { if (balance >= amount) balance -= amount; }
       }
       BankAccount account = new BankAccount();
       account.deposit(500);
       account.withdraw(300);
       System.out.println("Final balance: " + account.balance);
   }
   
   void linearSearch() {
    int[] arr = {10, 20, 30, 40, 50};
    System.out.print("Enter number to search: ");
    int target = scanner.nextInt();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            System.out.println("Found at index: " + i);
            return;
        }
    }
    System.out.println("Not found");
}

void depthFirstSearch() {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    graph.put(1, Arrays.asList(2, 3));
    graph.put(2, Arrays.asList(4, 5));
    graph.put(3, Arrays.asList(6, 7));
    graph.put(4, Collections.emptyList());
    graph.put(5, Collections.emptyList());
    graph.put(6, Collections.emptyList());
    graph.put(7, Collections.emptyList());
    
    Stack<Integer> stack = new Stack<>();
    Set<Integer> visited = new HashSet<>();
    stack.push(1);
    while (!stack.isEmpty()) {
        int node = stack.pop();
        if (!visited.contains(node)) {
            System.out.print(node + " ");
            visited.add(node);
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                stack.push(neighbor);
            }
        }
    }
    System.out.println();
}

void breadthFirstSearch() {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    graph.put(1, Arrays.asList(2, 3));
    graph.put(2, Arrays.asList(4, 5));
    graph.put(3, Arrays.asList(6, 7));
    graph.put(4, Collections.emptyList());
    graph.put(5, Collections.emptyList());
    graph.put(6, Collections.emptyList());
    graph.put(7, Collections.emptyList());
    
    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();
    queue.add(1);
    while (!queue.isEmpty()) {
        int node = queue.poll();
        if (!visited.contains(node)) {
            System.out.print(node + " ");
            visited.add(node);
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                queue.add(neighbor);
            }
        }
    }
    System.out.println();
}}

