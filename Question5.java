import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
// using a do-while loop to repeatedly ask the user for a number between 1 and 10
        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (number < 1 || number > 10);
        
 // 1 and 10 (inclusive), only stopping once a valid number has been entered

        System.out.println("You entered a valid number: " + number);

        scanner.close();
    }
}