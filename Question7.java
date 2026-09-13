import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //Asks the user to enter a number, then uses a for loop to print
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 12; i++) {

        // that number's multiplication table from 1 to 12.
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}