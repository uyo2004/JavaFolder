//Uyoojo Okene
//p.81 Ex8b Sept 2.

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {

        int noAdultMeals;
        int noChildMeals;
        double priceAdult = 7.0;
        double priceChild = 4.0;
        double costAdult = 4.35;
        double costChild = 3.10;
        double totalChild;
        double totalAdult;
        double totalProfitChild;
        double totalProfitAdult;
        double totalAllProfitAll;
        double totalCostChild;
        double totalCostAdult;
        double totalCostAll;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of children meals: ");
            noChildMeals = input.nextInt();

            System.out.print("Enter the number of adult meals: ");
            noAdultMeals = input.nextInt();
        }

        totalChild = priceChild * noChildMeals;
        totalAdult = priceAdult * noAdultMeals;
        
        totalCostChild = costChild * noChildMeals;
        totalCostAdult = costAdult * noAdultMeals;
        totalCostAll = totalCostChild + totalCostAdult;

        totalProfitChild = totalChild - totalCostChild;
        totalProfitAdult = totalAdult - totalCostAdult;
        totalAllProfitAll = totalProfitChild + totalProfitAdult;

        System.out.printf("Total cost for children meals: $%.2f%n", totalCostChild);
        System.out.printf("Total cost for adult meals: $%.2f%n", totalCostAdult);
        System.out.printf("Total cost for all meals: $%.2f%n", totalCostAll);
        System.out.printf("Total profit for children meals: $%.2f%n", totalProfitChild);
        System.out.printf("Total profit for adult meals: $%.2f%n", totalProfitAdult);
        System.out.printf("Total profit for all meals: $%.2f%n", totalAllProfitAll);
    }
}

