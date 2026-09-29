// Uyoojo Okene
// p.157

import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter bride's first name: ");
            String brideFirst = input.nextLine();
            
            System.out.print("Enter bride's last name: ");
            String brideLast = input.nextLine();
            
            System.out.print("Enter groom's first name: ");
            String groomFirst = input.nextLine();
            
            System.out.print("Enter groom's last name: ");
            String groomLast = input.nextLine();
            
            Person bride = new Person(brideFirst, brideLast);
            Person groom = new Person(groomFirst, groomLast);
            
            Couple couple = new Couple(bride, groom);
            
            System.out.print("Enter wedding year: ");
            int year = input.nextInt();
            
            System.out.print("Enter wedding month: ");
            int month = input.nextInt();
            
            System.out.print("Enter wedding day: ");
            int day = input.nextInt();
            
            input.nextLine();
            
            System.out.print("Enter wedding location: ");
            String location = input.nextLine();
            
            LocalDate date = LocalDate.of(year, month, day);
            
            Wedding wedding = new Wedding(couple, date, location);
            
            System.out.println("\nWedding Details");
            
            System.out.println("Bride: " +
                    wedding.getCouple().getBride().getFirstName() + " " +
                    wedding.getCouple().getBride().getLastName());
            
            System.out.println("Groom: " +
                    wedding.getCouple().getGroom().getFirstName() + " " +
                    wedding.getCouple().getGroom().getLastName());
            
            System.out.println("Wedding date: " +
                    wedding.getWeddingDate());
            
            System.out.println("Location: " +
                    wedding.getLocation());
        }
    }
}