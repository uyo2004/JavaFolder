// Uyoojo Okene
// p.483


import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class StudentsStanding {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            try {
                PrintWriter academicProbation;
                try (PrintWriter goodStanding = new PrintWriter(
                        new FileWriter("GoodStanding.txt")
                )) {
                    academicProbation = new PrintWriter(
                            new FileWriter("AcademicProbation.txt")
                    );  String choice = "Y";
                    while (choice.equalsIgnoreCase("Y")) {
                        
                        System.out.print("Enter student ID number: ");
                        String studentID = input.nextLine();
                        
                        System.out.print("Enter first name: ");
                        String firstName = input.nextLine();
                        
                        System.out.print("Enter last name: ");
                        String lastName = input.nextLine();
                        
                        double gpa;
                        
                        while (true) {
                            System.out.print("Enter GPA: ");
                            
                            try {
                                gpa = Double.parseDouble(input.nextLine());
                                
                                if (!Double.isFinite(gpa) ||
                                        gpa < 0.0 || gpa > 4.0) {
                                    System.out.println(
                                            "GPA must be between 0.0 and 4.0."
                                    );
                                    continue;
                                }
                                
                                break;
                                
                            } catch (NumberFormatException e) {
                                System.out.println(
                                        "Invalid GPA. Please enter a number."
                                );
                            }
                        }
                        
                        // Create student record
                        String record = studentID + "," +
                                firstName + "," +
                                lastName + "," +
                                gpa;
                        
                        // Save student to the correct file
                        if (gpa >= 2.0) {
                            goodStanding.println(record);
                            
                            System.out.println(
                                    "Student saved to Good Standing file."
                            );
                        } else {
                            academicProbation.println(record);
                            
                            System.out.println(
                                    "Student saved to Academic Probation file."
                            );
                        }
                        
                        System.out.print(
                                "\nDo you want to enter another student? (Y/N): "
                        );
                        
                        choice = input.nextLine();
                        
                        System.out.println();
                    }
                }
                academicProbation.close();
                
                System.out.println(
                        "All student records have been saved."
                );
                
            } catch (IOException e) {
                System.out.println(
                        "Error writing to file: " + e.getMessage()
                );
            }

            }
}
}

