// Uyoojo Okene
//p.315


public class Car {
    private final int year;
    private final Model model;
    private final Color color;
    Car(int yr, Model m, Color c) {
        year = yr;
        model = m;
        color = c;
    }
    public void display() {
        System.out.println("Car is a " + year + " " + color + " " + model);

    }
    
}
