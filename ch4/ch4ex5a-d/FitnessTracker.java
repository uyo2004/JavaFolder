// Uyoojo Okene
// p.157

import java.time.LocalDate;

public class FitnessTracker {
    private final String activity;
    private final int minutes;
    private final LocalDate date;

    public FitnessTracker() {
        activity = "running";
        minutes = 0;
        date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
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
