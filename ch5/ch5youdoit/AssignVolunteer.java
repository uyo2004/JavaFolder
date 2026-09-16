// Uyoojo Okene
// p.167
import java.util.Scanner;
public class AssignVolunteer {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_VOLUNTEER = "Regina";
        final String OTHER_PRICER = "Marco";
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("What type of donation type is this? ");
            System.out.println("Enter "+ CLOTHING_CODE + " for clothing or " + OTHER_CODE + " for anything else");
            donationType = input.nextInt();
        }
        if (donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_VOLUNTEER;
        } else {
            volunteer = OTHER_PRICER;
        }

        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}