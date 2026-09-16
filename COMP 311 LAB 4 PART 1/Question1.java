

        import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[20];
        int count = 0;

        try {
            File inputFile = new File("names.txt");
            Scanner fileScanner = new Scanner(inputFile);

            while (fileScanner.hasNext() && count < names.length) {
                names[count] = fileScanner.next();
                count++;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find names.txt");
            return;
        }

        System.out.println("Words read from file: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }
}