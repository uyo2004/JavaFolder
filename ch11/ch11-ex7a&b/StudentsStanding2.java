// Uyoojo Okene
// p.483


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentsStanding2 {

    public static void main(String[] args) {

        System.out.println("===== STUDENTS IN GOOD STANDING =====");

        displayStudents("GoodStanding.txt", true);

        System.out.println(
            "\n===== STUDENTS ON ACADEMIC PROBATION ====="
        );

        displayStudents("AcademicProbation.txt", false);
    }

    public static void displayStudents(
        String fileName, boolean goodStanding) {

        try {
            File file = new File(fileName);
            try (Scanner fileReader = new Scanner(file)) {
                boolean hasRecords = false;
                
                while (fileReader.hasNextLine()) {
                    
                    String record = fileReader.nextLine();
                    
                    String[] studentData = record.split(",");
                    
                    if (studentData.length != 4) {
                        System.out.println("Invalid student record.");
                        continue;
                    }
                    
                    try {
                        String studentID = studentData[0];
                        String firstName = studentData[1];
                        String lastName = studentData[2];
                        
                        double gpa = Double.parseDouble(
                                studentData[3]
                        );

                        double difference = Math.abs(gpa - 2.0);
                        
                        hasRecords = true;
                        
                        System.out.println(
                                "\nStudent ID: " + studentID
                        );
                        
                        System.out.println(
                                "First Name: " + firstName
                        );
                        
                        System.out.println(
                                "Last Name: " + lastName
                        );
                        
                        System.out.printf(
                                "GPA: %.2f%n", gpa
                        );
                        
                        if (goodStanding) {
                            System.out.printf(
                                    "GPA exceeds cutoff by: %.2f%n",
                                    difference
                            );
                        } else {
                            System.out.printf(
                                    "GPA falls short by: %.2f%n",
                                    difference
                            );
                        }
                        
                    } catch (NumberFormatException e) {
                        System.out.println(
                                "Invalid GPA in student record."
                        );
                    }
                }
                
                if (!hasRecords) {
                    System.out.println("No student records found.");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(
                "File not found: " + fileName
            );
        }
    }
}

