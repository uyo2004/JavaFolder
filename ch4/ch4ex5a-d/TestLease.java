// Uyoojo Okene
// p.157

import java.util.Scanner;

public class TestLease {
    static Scanner input = new Scanner(System.in);

    // Lease is defined here so this file can be compiled independently.
    static class Lease {
        private String tenantName = "XXX";
        private int apartmentNumber = 0;
        private double monthlyRent = 0.0;
        private int leaseTerm = 12;

        public void addPetFee() {
            monthlyRent += 10.0;
        }

        public String getTenantName() {
            return tenantName;
        }

        public void setTenantName(String tenantName) {
            this.tenantName = tenantName;
        }

        public int getApartmentNumber() {
            return apartmentNumber;
        }

        public void setApartmentNumber(int apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }

        public double getMonthlyRent() {
            return monthlyRent;
        }

        public void setMonthlyRent(double monthlyRent) {
            this.monthlyRent = monthlyRent;
        }

        public int getLeaseTerm() {
            return leaseTerm;
        }

        public void setLeaseTerm(int leaseTerm) {
            this.leaseTerm = leaseTerm;
        }
    }

    public static void main(String[] args) {
        Lease lease1;
        Lease lease2;
        Lease lease3;
        Lease lease4 = new Lease();

        System.out.println("Enter information for Lease 1");
        lease1 = getData();

        System.out.println("\nEnter information for Lease 2");
        lease2 = getData();

        System.out.println("\nEnter information for Lease 3");
        lease3 = getData();

        System.out.println("\nLease 1 before pet fee:");
        showValues(lease1);

        System.out.println("\nAdding pet fee...");
        lease1.addPetFee();

        System.out.println("\nLease 1 after pet fee:");
        showValues(lease1);

        System.out.println("\nLease 2:");
        showValues(lease2);

        System.out.println("\nLease 3:");
        showValues(lease3);

        System.out.println("\nLease 4:");
        showValues(lease4);

        input.close();
    }

    private static Lease getData() {
        Lease lease = new Lease();

        System.out.print("Enter tenant name: ");
        lease.setTenantName(input.nextLine());

        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(Integer.parseInt(input.nextLine()));

        System.out.print("Enter monthly rent: ");
        lease.setMonthlyRent(Double.parseDouble(input.nextLine()));

        System.out.print("Enter lease term in months: ");
        lease.setLeaseTerm(Integer.parseInt(input.nextLine()));

        return lease;
    }

    private static void showValues(Lease lease) {
        System.out.println("Tenant: " + lease.getTenantName());
        System.out.println("Apartment number: " + lease.getApartmentNumber());
        System.out.printf("Monthly rent: $%.2f%n", lease.getMonthlyRent());
        System.out.println("Lease term: " + lease.getLeaseTerm() + " months");
    }
}
