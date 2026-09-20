
public class Book {

    // Q1 + Q5: fields, made private for encapsulation
    private String title;
    private String author;
    private double price;

    // Q2: constructor; "this" separates the fields from the parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Q5: getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Q5: setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Q4: returns one String combining title, author and price
    public String getSummary() {
        return title + " by " + author + " - " + String.format("%.2f", price);
    }
}    

