// Uyoojo Okene
// p.387


public class NonFiction extends Book {

    // Constructor
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    // Set nonfiction book price
    @Override
    public final void setPrice() {
        price = 37.99;
    }
}

