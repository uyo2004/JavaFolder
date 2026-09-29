// Uyoojo Okene
// p.157

import java.time.LocalDate;

public class Wedding {
    private final Couple couple;
    private final LocalDate weddingDate;
    private final String location;

    public Wedding(Couple couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public Couple getCouple() {
        return couple;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public String getLocation() {
        return location;
    }
}
