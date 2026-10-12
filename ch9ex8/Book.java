// Uyoojo Okene
// p.387


public abstract class Book {

    private final String title;
    protected double price;

    // Constructor
    public Book(String title) {
        this.title = title;
    }

    // Get book title
    public String getTitle() {
        return title;
    }

    // Get book price
    public double getPrice() {
        return price;
    }

    // Abstract method
    public abstract void setPrice();
}

