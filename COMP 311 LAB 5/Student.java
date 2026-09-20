
public class Question6 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Things Fall Apart", "Chinua Achebe", 149.99);
        books[1] = new Book("Head Above Water", "Bessie Head", 120.50);
        books[2] = new Book("Half of a Yellow Sun", "Chimamanda Ngozi Adichie", 175.00);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getSummary());
        }
    }
}