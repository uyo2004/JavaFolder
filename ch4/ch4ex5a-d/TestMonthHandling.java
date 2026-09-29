// Uyoojo Okene
// p.157

import java.time.LocalDate;
import java.util.Scanner;

public class TestMonthHandling {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first date");
            
            System.out.print("Year: ");
            int year1 = input.nextInt();
            
            System.out.print("Month: ");
            int month1 = input.nextInt();
            
            System.out.print("Day: ");
            int day1 = input.nextInt();
            
            LocalDate date1 = LocalDate.of(year1, month1, day1);
            
            System.out.println("\nEnter second date");
            
            System.out.print("Year: ");
            int year2 = input.nextInt();
            
            System.out.print("Month: ");
            int month2 = input.nextInt();
            
            System.out.print("Day: ");
            int day2 = input.nextInt();
            
            LocalDate date2 = LocalDate.of(year2, month2, day2);
            
            displayMonths(date1);
            displayMonths(date2);
        }
    }

    public static void displayMonths(LocalDate date) {
        System.out.println("\nOriginal date: " + date);
        System.out.println("One month later: " + date.plusMonths(1));
        System.out.println("Two months later: " + date.plusMonths(2));
        System.out.println("Three months later: " + date.plusMonths(3));
    }
}
