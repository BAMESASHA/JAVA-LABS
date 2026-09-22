// Question 6: testing Calculator
public class Question6 {
    public static void main(String[] args) {
        // Static method: called directly on the class, no object needed
        int sum = Calculator.add(3, 4);
        System.out.println("3 + 4 = " + sum);

        // Instance method: needs a Calculator object
        Calculator calc = new Calculator();
        System.out.println("2 * 5 = " + calc.multiply(2, 5));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("multiply() was called " + calc.getCallCount() + " times");
    }
}