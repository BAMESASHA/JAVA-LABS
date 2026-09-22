// Question 3: void vs returning methods
public class Question3 {

    // void method: prints the banner directly, returns nothing
    public static void printBanner() {
        System.out.println("COMP 311");
    }

    // returning method: builds and returns the same line as a String
    public static String getBanner() {
        return "COMP 311 ";
    }

    public static void main(String[] args) {
        // Using the void method
        printBanner();

        // Using the returning method
        String banner = getBanner();
        System.out.println(banner);
    }
}