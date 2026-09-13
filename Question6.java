import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            /** 
            * Uses a do-while loop to repeatedly ask the user to enter a number,
            * adding each one to a running total, and stops as soon as the user
            * enters 0. Once the loop ends, prints the final total.
            */
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            total += number;
        } while (number != 0);

        System.out.println("The final total is " + total);

        scanner.close();
    }
}