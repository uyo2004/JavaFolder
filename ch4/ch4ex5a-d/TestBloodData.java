// Uyoojo Okene
// p.157

import java.util.Scanner;

public class TestBloodData {
    static final class BloodData {
        private String bloodType;
        private String rhFactor;

        public BloodData() {
            this("O", "+");
        }

        public BloodData(String bloodType, String rhFactor) {
            setBloodType(bloodType);
            setRhFactor(rhFactor);
        }

        public String getBloodType() {
            return bloodType;
        }

        public void setBloodType(String bloodType) {
            if (bloodType == null || bloodType.trim().isEmpty()) {
                this.bloodType = "O";
            } else {
                this.bloodType = bloodType.trim();
            }
        }

        public String getRhFactor() {
            return rhFactor;
        }

        public void setRhFactor(String rhFactor) {
            if (rhFactor == null || rhFactor.trim().isEmpty()) {
                this.rhFactor = "+";
            } else {
                this.rhFactor = rhFactor.trim();
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter blood type: ");
            String type = input.nextLine();

            System.out.print("Enter Rh factor (+ or -): ");
            String factor = input.nextLine();

            BloodData blood1 = new BloodData(type, factor);
            BloodData blood2 = new BloodData();

            System.out.println("\nUser Blood Data:");
            display(blood1);

            System.out.println("\nDefault Blood Data:");
            display(blood2);

            blood2.setBloodType(type);
            blood2.setRhFactor(factor);

            System.out.println("\nChanged Blood Data:");
            display(blood2);
        }
    }

    private static void display(BloodData blood) {
        System.out.println("Blood type: " +
                blood.getBloodType() + blood.getRhFactor());
    }
}
