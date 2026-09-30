// Uyoojo Okene
// p.375

import javax.swing.*;

public class InsuredCar extends Vehicle implements Insured {

    private int coverage;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public InsuredCar() {
        super("gas", 4);
        setCoverage();
    }

    @Override
    public void setPrice() {
        String entry;
        final int MAX = 60000;

        entry = JOptionPane.showInputDialog(
                "Enter car price");

        price = Integer.parseInt(entry);

        if (price > MAX)
            price = MAX;
    }

    @Override
    public void setCoverage() {
        coverage = (int)(price * 0.90);
    }

    @Override
    public int getCoverage() {
        return coverage;
    }

    @Override
    public String toString() {
        return "The car is powered by " +
                getPowerSource() +
                "; it has " + getWheels() +
                " wheels, costs $" + getPrice() +
                ", and is insured for $" + getCoverage();
    }
}
