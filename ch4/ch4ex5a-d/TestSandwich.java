// Uyoojo Okene
//p.157

import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Sandwich sandwich = new Sandwich();

            System.out.print("Enter main ingredient: ");
            try {
                Sandwich.class.getMethod("setMainIngredient", String.class)
                        .invoke(sandwich, input.nextLine());
            } catch (ReflectiveOperationException e) {
                throw new IllegalStateException("Sandwich does not support a main ingredient", e);
            }

            System.out.print("Enter bread type: ");
            sandwich.setBreadType(input.nextLine());

            System.out.print("Enter price: ");
            sandwich.setPrice(input.nextDouble());

            System.out.println("\nSandwich Details");
            try {
                System.out.println("Main ingredient: " + Sandwich.class.getMethod("getMainIngredient").invoke(sandwich));
            } catch (ReflectiveOperationException e) {
                throw new IllegalStateException("Sandwich does not support a main ingredient", e);
            }
            System.out.println("Bread type: " + sandwich.getBreadType());
            System.out.printf("Price: $%.2f%n", sandwich.getPrice());
        }
    }
}
