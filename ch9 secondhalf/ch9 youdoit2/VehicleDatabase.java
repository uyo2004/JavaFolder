// Uyoojo Okene
//p.362

// Uyoojo Okene
// p.355

import javax.swing.*;

public class VehicleDatabase {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        int x;

        for (x = 0; x < vehicles.length; ++x) {

            String entry = JOptionPane.showInputDialog(
                    "Enter 1 for sailboat or 2 for bicycle");

            int vehicleType = Integer.parseInt(entry);

            if (vehicleType == 1)
                vehicles[x] = new Sailboat();
            else
                vehicles[x] = new Bicycle();
        }

        StringBuffer outString = new StringBuffer();

        for (x = 0; x < vehicles.length; ++x) {
            outString.append("\n");
            outString.append(x + 1);
            outString.append(" ");
            outString.append(vehicles[x]);
        }

        JOptionPane.showMessageDialog(
                null, outString);
    }
}
