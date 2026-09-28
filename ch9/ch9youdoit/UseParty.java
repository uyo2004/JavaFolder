// Uyoojo Okene
// p.334

import java.util.*;
public class UseParty {
    

    public static void main(String[] args) {
        int guests;
        Party aParty = new Party();
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter number og guests for the party >>");
            guests = keyboard.nextInt();
        }
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests" );
        aParty.displayInvitation();
    }
}
