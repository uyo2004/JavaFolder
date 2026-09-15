// Uyoojo Okene
// p.156 ex. 1

import java.util.Scanner;
public class TestSandwich {
 
    public static void main (String[] args) {
    
    Sandwich firstSandwich = new Sandwich();
    firstSandwich = getData(firstSandwich);
    System.out.println("You ordered a: ");
    System.out.println(firstSandwich.getIngredients() + " " + firstSandwich.getBreadType() + " " + firstSandwich.getPrice());
    }
    
    public static Sandwich getData(Sandwich service) {
        String ingredients;
        String breadType;
        double price;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the ingredients of the sandwich: ");
            ingredients = keyboard.nextLine();
            System.out.print("Enter the type of bread: ");
            breadType = keyboard.nextLine();
            System.out.print("Enter the price of the sandwich: ");
            price = keyboard.nextDouble();
            service.setIngredients(ingredients);
            service.setBreadType(breadType);
            service.setPrice(price);
            keyboard.nextLine(); // consume the newline character
        }
        return service;
    }
    
    


}