//Uses a while loop to print a countdown from 10 down to 1,
 
public class Question1 {
    public static void main(String[] args) {
        int count = 10;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }
// print "Liftoff!" after the countdown
        System.out.println("Liftoff!");
    }
}