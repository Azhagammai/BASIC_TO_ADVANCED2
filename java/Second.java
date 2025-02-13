class Second {
    public static void main(String[] args) {
        int a = 10, b = 8, c = 0;

        if (a >= b && a >= c) {
            System.out.println("A is the greatest or equal.");
        } else if (b >= a && b >= c) {
            System.out.println("B is the greatest or equal.");
        } else {
            System.out.println("C is the greatest.");
        }
    }
}
