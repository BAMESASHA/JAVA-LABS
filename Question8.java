import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Asks the user to enter a word or sentence, then uses a for loop
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));
 // to count and print how many vowels (a, e, i, o, u) it contains.
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                    || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }
}