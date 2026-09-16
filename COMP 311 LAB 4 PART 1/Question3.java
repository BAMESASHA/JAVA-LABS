import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {23, 4, 56, 12, 89, 3, 45, 67};

        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("results.txt"));

            writer.println("Sum: " + sum);
            writer.println("Smallest: " + smallest);
            writer.println("Largest: " + largest);

            writer.close();
            System.out.println("Results written to results.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}