// Uyoojo Okene
// p.522


public class Purchase implements Comparable<Purchase> {

    private final String category;
    private final double price;

    // Constructor
    public Purchase(String category, double price) {
        this.category = category;
        this.price = price;
    }

    // Return the category
    public String getCategory() {
        return category;
    }

    // Return the price
    public double getPrice() {
        return price;
    }

    // Compare purchases by category
    @Override
    public int compareTo(Purchase other) {
        return category.compareTo(other.getCategory());
    }
}

