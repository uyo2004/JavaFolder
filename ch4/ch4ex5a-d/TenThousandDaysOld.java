// Uyoojo Okene
// p.157

import java.time.LocalDate;
import java.util.Scanner;

public class TenThousandDaysOld {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter birth month: ");
            int month = input.nextInt();
            
            System.out.print("Enter birth day: ");
            int day = input.nextInt();
            
            System.out.print("Enter birth year: ");
            int year = input.nextInt();
            
            LocalDate birthDate = LocalDate.of(year, month, day);
            
            LocalDate tenThousand =
                    birthDate.plusDays(10000);
            
            System.out.println("Birth date: " + birthDate);
            System.out.println("You become or became 10,000 days old on: "
                    + tenThousand);
        }
    }
}
