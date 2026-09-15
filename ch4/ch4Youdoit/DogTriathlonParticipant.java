// Uyoojo Okene
// p.141
public class DogTriathlonParticipant {
    private final int NUM_EVENTS;
    private static int totalcumulativeScore = 0;
    private final String name;
    private final int obedienceScore;
    private final int conformationScore;
    private final int agilityScore;
    private final int total;
    private final double average;
    public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3) {
    
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;
        total = obedienceScore + conformationScore + agilityScore;
        average = (double) total / NUM_EVENTS;
        totalcumulativeScore += totalcumulativeScore + total;
    }
    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + average);
        System.out.println("" + name + "'s total score is " + total + " and the total cumulative score is " + totalcumulativeScore);
        


    }
}
