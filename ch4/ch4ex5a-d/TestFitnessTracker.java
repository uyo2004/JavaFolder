// Uyoojo Okene
// p.157

import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter activity: ");
            String activity = input.nextLine();

            System.out.print("Enter minutes: ");
            int minutes = input.nextInt();

            System.out.print("Enter year: ");
            int year = input.nextInt();

            System.out.print("Enter month: ");
            int month = input.nextInt();

            System.out.print("Enter day: ");
            int day = input.nextInt();

            LocalDate date = LocalDate.of(year, month, day);

            FitnessTracker tracker1 =
                    new FitnessTracker(activity, minutes, date);

            FitnessTracker tracker2 = new FitnessTracker();

            System.out.println("\nFitness Tracker 1");
            display(tracker1);

            System.out.println("\nFitness Tracker 2");
            display(tracker2);
        }
    }

    private static void display(FitnessTracker tracker) {
        System.out.println("Activity: " + tracker.getActivity());
        System.out.println("Minutes: " + tracker.getMinutes());
        System.out.println("Date: " + tracker.getDate());
    }
}

class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;

    public FitnessTracker() {
        this("running", 0, LocalDate.now());
    }

    public FitnessTracker(String activity, int minutes, LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public LocalDate getDate() {
        return date;
    }
}
