// Question 1: creating a method
public class Question1 {

    // Returns true if n is even, false otherwise
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("4 is even: " + isEven(4));
        System.out.println("7 is even: " + isEven(7));
        System.out.println("0 is even: " + isEven(0));
        System.out.println("-3 is even: " + isEven(-3));
    }
}