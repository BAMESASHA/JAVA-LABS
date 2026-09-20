
public class Question3 {
    public static void main(String[] args) {
        Book book1 = new Book("Things Fall Apart", "Chinua Achebe", 149.99);
        Book book2 = new Book("Head Above Water", "Bessie Head", 120.50);

        System.out.println("Title:  " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price:  " + book1.getPrice());
        System.out.println();
        System.out.println("Title:  " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price:  " + book2.getPrice());
    }
}