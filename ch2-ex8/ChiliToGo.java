//Uyoojo Okene
//p.81 Ex8a Sept 2.

import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {

        int noAdultMeals;
        int noChildMeals;
        double priceAdult = 7.0;
        double priceChild = 4.0;
        double totalChild;
        double totalAdult;
        double totalAll;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of children meals: ");
            noChildMeals = input.nextInt();

            System.out.print("Enter the number of adult meals: ");
            noAdultMeals = input.nextInt();
        }

        totalChild = priceChild * noChildMeals;
        totalAdult = priceAdult * noAdultMeals;
        totalAll = totalChild + totalAdult;

        System.out.printf("Total cost for children meals: $%.2f%n", totalChild);
        System.out.printf("Total cost for adult meals: $%.2f%n", totalAdult);
        System.out.printf("Total cost for all meals: $%.2f%n", totalAll);
    }
}

