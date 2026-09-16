import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = keyboard.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary representation: " + binary);

        keyboard.close();
    }
}