// Uyoojo Okene
// p.157

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    public Patient() {
        idNumber = 0;
        age = 0;
        bloodData = new BloodData();
    }

    Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    BloodData getBloodData() {
        return bloodData;
    }
}

class BloodData {
    private final String bloodType;
    private final String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}
