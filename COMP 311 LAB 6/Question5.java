// Question 5: more overloading practice
public class Question5 {

    // Overload 1: just a name
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overload 2: name and age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Aleone Tlhabano");
        displayInfo("Tshologo Dibeela", 21);
    }
}