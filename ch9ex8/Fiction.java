// Uyoojo Okene
// p.387


public class Fiction extends Book {

    // Constructor
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    // Set fiction book price
    @Override
    public final void setPrice() {
        price = 24.99;
    }
}

