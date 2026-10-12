// Uyoojo Okene
//p.522


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurchasesArrayList {

    public static void main(String[] args) {

        ArrayList<Purchase> purchases = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            String category;
            double price;
            
            final String QUIT = "ZZZ";
            
            System.out.print(
                    "Enter category for purchase or ZZZ to quit >> "
            );
            category = input.nextLine();
            
            while (!category.equals(QUIT)) {
                
                System.out.print("Enter amount spent >> ");
                price = input.nextDouble();
                input.nextLine();
                
                Purchase purchase = new Purchase(category, price);
                
                purchases.add(purchase);
                
                System.out.print(
                        "Enter category for purchase or ZZZ to quit >> "
                );
                category = input.nextLine();
            }
            
            System.out.println();
            System.out.println("Before sort:");
            display(purchases);
            
            Collections.sort(purchases);
            
            System.out.println();
            System.out.println("After sort:");
            display(purchases);
        }
    }

    public static void display(ArrayList<Purchase> purchases) {

        for (Purchase purchase : purchases) {

            System.out.println(
                "   " + purchase.getCategory() +
                " " + purchase.getPrice()
            );
        }
    }
}

