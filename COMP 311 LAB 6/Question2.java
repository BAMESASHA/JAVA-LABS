// Question 2: a method with a return value
public class Question2 {

    // Returns the area of a circle with the given radius
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double area1 = circleArea(2.0);
        double area2 = circleArea(5.5);

        System.out.println("Area of circle with radius 2.0: " + area1);
        System.out.println("Area of circle with radius 5.5: " + area2);
    }
}