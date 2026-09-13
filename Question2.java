import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// asking user to enter a positive whole number

        System.out.print("Enter a positive whole number: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int currentNumber = 1;
// calculating the sum of whole numbers from 1 to the entered number using while loop
        while (currentNumber <= limit) {
            sum += currentNumber;
            currentNumber++;
        }
// printing the sum of all whole numbers from 1 to the entered number
        System.out.println("The sum of all whole numbers from 1 to " + limit + " is " + sum);

        scanner.close();
    }
}