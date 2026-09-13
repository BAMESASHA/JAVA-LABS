public class Question3 {
    public static void main(String[] args) {
        int number = 1;
// using a while loop to print all even numbers between 1 and 50
        while (number <= 50) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}