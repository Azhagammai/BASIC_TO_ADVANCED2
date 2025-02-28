

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5; 
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.println(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
