// Uyoojo Okene
// p.157

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Patient patient1 = new Patient();
            
            System.out.println("Enter information for Patient 2");
            
            System.out.print("Enter ID number: ");
            int id2 = input.nextInt();
            
            System.out.print("Enter age: ");
            int age2 = input.nextInt();
            
            input.nextLine();
            
            System.out.print("Enter blood type: ");
            String type = input.nextLine();
            
            System.out.print("Enter Rh factor (+ or -): ");
            String factor = input.nextLine();
            
            BloodData blood2 = new BloodData(type, factor);
            Patient patient2 = new Patient(id2, age2, blood2);
            
            System.out.println("\nEnter information for Patient 3");
            
            System.out.print("Enter ID number: ");
            int id3 = input.nextInt();
            
            System.out.print("Enter age: ");
            int age3 = input.nextInt();
            
            BloodData blood3 = new BloodData();
            Patient patient3 = new Patient(id3, age3, blood3);
            
            System.out.println("\nPatient 1:");
            display(patient1);
            
            System.out.println("\nPatient 2:");
            display(patient2);
            
            System.out.println("\nPatient 3:");
            display(patient3);
        }
    }

    private static void display(Patient patient) {
        System.out.println("ID: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood type: " +
                patient.getBloodData().getBloodType() +
                patient.getBloodData().getRhFactor());
    }
}

class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this("O", "+");
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

class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this(0, 0, new BloodData());
    }

    public Patient(int idNumber, int age, BloodData bloodData) {
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

    public BloodData getBloodData() {
        return bloodData;
    }
}
