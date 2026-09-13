import java.util.Scanner;

/**
 * Question 4 - Repeating Menu
 * Repeatedly displays a simple menu (1. Continue, 2. Exit) using a do-while loop.
 * Keeps showing the menu until the user enters 2.
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Continuing...");
            } else if (choice == 2) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }
}