import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question2 {
    public static void main(String[] args) {
        double[] numbers = {3.5, 12.75, 8.2, 45.0, 1.125};

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("doubles.txt"));

            for (int i = 0; i < numbers.length; i++) {
                writer.println(numbers[i]);
            }

            writer.close();
            System.out.println("Values written to doubles.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}