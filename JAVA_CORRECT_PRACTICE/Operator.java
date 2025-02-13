import java.util.*;

public class Operator {

    // Method for Arithmetic operators
    public void arithmetic(int a, int b) {
        try {
            System.out.println("Arithmetic Operations:");
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            if (b != 0) {
                System.out.println("Division: " + (a / b)); // Check division by zero
            } else {
                System.out.println("Division: Cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("Error in Arithmetic operations: " + e.getMessage());
        }
    }

    // Method for Unary operators
    public void unary(int a, int b) {
        try {
            System.out.println("Unary Operations:");
            System.out.println("Increment a: " + (++a));
            System.out.println("Decrement b: " + (--b));
            System.out.println("Decrement b: " + (a++));
            System.out.println("Decrement b: " + (b--));

        } catch (Exception e) {
            System.out.println("Error in Unary operations: " + e.getMessage());
        }
    }

    // Method for Assignment operators
    public void assign(int a, int b) {
        try {
            System.out.println("Assignment Operations:");
            a += b; // a = a + b
            System.out.println("a += b: " + a);
            a -= b; // a = a - b
            System.out.println("a -= b: " + a);
            a *= b; // a = a * b
            System.out.println("a *= b: " + a);
            a /= b; // a = a / b
            System.out.println("a /= b: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Error in Assignment operations: Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Error in Assignment operations: " + e.getMessage());
        }
    }

    // Method for Relational operators
    public void relational(int a, int b) {
        try {
            System.out.println("Relational Operations:");
            System.out.println("a == b: " + (a == b));
            System.out.println("a != b: " + (a != b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
        } catch (Exception e) {
            System.out.println("Error in Relational operations: " + e.getMessage());
        }
    }

    // Method for Logical operators
    public void logical(int a, int b) {
        try {
            System.out.println("Logical Operations:");
            System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));
            System.out.println("a > 0 || b > 0: " + (a > 0 || b > 0));
            System.out.println("!(a > 0): " + !(a > 0));
        } catch (Exception e) {
            System.out.println("Error in Logical operations: " + e.getMessage());
        }
    }

    // Method for Ternary operator
    public void ternary(int a, int b) {
        try {
            System.out.println("Ternary Operations:");
            String result = (a > b) ? "a is greater" : "b is greater";
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error in Ternary operations: " + e.getMessage());
        }
    }

    // Method for Bitwise operators
    public void bitwise(int a, int b) {
        try {
            System.out.println("Bitwise Operations:");
            System.out.println("a & b: " + (a & b));
            System.out.println("a | b: " + (a | b));
            System.out.println("a ^ b: " + (a ^ b));
            System.out.println("~a: " + (~a));
            System.out.println("a << 2: " + (a << 2));
            System.out.println("a >> 2: " + (a >> 2));
        } catch (Exception e) {
            System.out.println("Error in Bitwise operations: " + e.getMessage());
        }
    }

    // Method for Shift operators
    public void shift(int a, int b) {
        try {
            System.out.println("Shift Operations:");
            System.out.println("a << b: " + (a << b));
            System.out.println("a >> b: " + (a >> b));
        } catch (Exception e) {
            System.out.println("Error in Shift operations: " + e.getMessage());
        }
    }

    // Method for Instanceof operator
    public void instance(int a, int b) {
        try {
            System.out.println("Instanceof Operations:");
            Object obj = a; // Treating 'a' as an Object
            System.out.println("a instanceof Integer: " + (obj instanceof Integer));
        } catch (Exception e) {
            System.out.println("Error in Instanceof operations: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = s.nextInt();
            System.out.print("Enter second number: ");
            int b = s.nextInt();
            Operator ob = new Operator();
            ob.arithmetic(a, b);
            ob.unary(a, b);
            ob.assign(a, b);
            ob.relational(a, b);
            ob.logical(a, b);
            ob.ternary(a, b);
            ob.bitwise(a, b);
            ob.shift(a, b);
            ob.instance(a, b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            s.close();
        }
    }
}
