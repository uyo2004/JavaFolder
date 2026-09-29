// Uyoojo Okene
// p.157

import java.time.LocalDate;
import java.util.Scanner;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter month: ");
            int month = input.nextInt();

            System.out.print("Enter day: ");
            int day = input.nextInt();

            System.out.print("Enter year: ");
            int year = input.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            int daysLeft = date.lengthOfMonth() - day + 1;

            String nextMonth =
                    date.plusMonths(1).getMonth().toString();

            System.out.println("There are " + daysLeft +
                    " days until " + nextMonth + " starts.");

            input.close();
        }
    }
}
