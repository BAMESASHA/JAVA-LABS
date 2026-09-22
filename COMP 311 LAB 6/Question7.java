// Question 7: pass by value
public class Question7 {

    // Doubles the LOCAL copy of number; the caller's variable is untouched
    public static void tryToDouble(int number) {
        number = number * 2;
        System.out.println("Inside tryToDouble, number = " + number);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.println("Before call, value = " + value);

        tryToDouble(value);

        // Java passes primitives by value, so value is unchanged here
        System.out.println("After call, value = " + value);
    }
}