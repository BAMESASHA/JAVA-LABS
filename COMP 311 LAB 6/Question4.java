// Question 4: method overloading
public class Question4 {

    // Overload 1: adds two ints
    public static int combine(int a, int b) {
        return a + b;
    }

    // Overload 2: joins two Strings
    public static String combine(String a, String b) {
        return a + b;
    }

    // Overload 3: adds two doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("combine(3, 4) = " + combine(3, 4));
        System.out.println("combine(\"Hello, \", \"World!\") = " + combine("Hello, ", "World!"));
        System.out.println("combine(2.5, 3.1) = " + combine(2.5, 3.1));
    }
}