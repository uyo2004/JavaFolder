// Uyoojo Okene
// p.156 ex. 1

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestSandwich {

    public static void main(String[] args) {

        Sandwich firstSandwich = new Sandwich();
        firstSandwich = getData(firstSandwich);
        System.out.println("You ordered a: ");
        Object ingredients = getSandwichValue(firstSandwich, new String[]{"getIngredients", "getIngredient", "getMainIngredient"});
        System.out.println(ingredients + " " + firstSandwich.getBreadType() + " " + firstSandwich.getPrice());
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
            setSandwichValue(service, new String[]{"setIngredients", "setMainIngredient", "setIngredient"}, ingredients);
            setSandwichValue(service, new String[]{"setBreadType"}, breadType);
            setSandwichValue(service, new String[]{"setPrice"}, price);
            keyboard.nextLine(); // consume the newline character
        }
        return service;
    }

    private static void setSandwichValue(Sandwich service, String[] methodNames, Object value) {
        for (String methodName : methodNames) {
            try {
                if (value instanceof String stringValue) {
                    Method method = service.getClass().getMethod(methodName, String.class);
                    method.invoke(service, stringValue);
                    return;
                }
                if (value instanceof Number numberValue) {
                    Method method = service.getClass().getMethod(methodName, double.class);
                    method.invoke(service, numberValue.doubleValue());
                    return;
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                // Try the next possible method name.
            }
        }
    }

    private static Object getSandwichValue(Sandwich service, String[] methodNames) {
        for (String methodName : methodNames) {
            try {
                return service.getClass().getMethod(methodName).invoke(service);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                // Try the next possible method name.
            }
        }
        return "";
    }
}