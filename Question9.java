import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Asks the user to enter a whole number, then uses a for loop
        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();
// calculating factorial
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
// printing the factorial of the entered number
        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}