// Uyoojo Okene
// p.157

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;

    public Lease() {
        tenantName = "XXX";
        apartmentNumber = 0;
        monthlyRent = 1000;
        leaseTerm = 12;
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

    public void addPetFee() {
        monthlyRent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("A $10 monthly pet fee has been added to the rent.");
    }
}
