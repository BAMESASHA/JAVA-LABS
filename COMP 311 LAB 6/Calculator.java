// Question 6: static vs instance methods
public class Calculator {

    // Instance field: how many times multiply() has been called
    private int callCount;

    public Calculator() {
        callCount = 0;
    }

    // Static method: belongs to the class, not to any one object
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method: needs an object to run, since it updates callCount
    public int multiply(int a, int b) {
        callCount++;
        return a * b;
    }

    public int getCallCount() {
        return callCount;
    }
}