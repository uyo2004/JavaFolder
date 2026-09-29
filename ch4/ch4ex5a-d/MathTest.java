// Uyoojo Okene
// p.157

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
                try (Scanner input = new Scanner(System.in)) {
                        System.out.print("Enter an integer: ");
                        int number = input.nextInt();

                        System.out.print("Enter a double: ");
                        double decimal = input.nextDouble();

            System.out.println("Square root of integer: " +
                    Math.sqrt(number));

            System.out.println("Random number between 0 and " +
                    number + ": " + (Math.random() * number));

            System.out.println("Floor of double: " +
                    Math.floor(decimal));

            System.out.println("Ceiling of double: " +
                    Math.ceil(decimal));

            System.out.println("Rounded double: " +
                    Math.round(decimal));

            System.out.println("Larger value: " +
                    Math.max(number, decimal));

            System.out.println("Smaller value: " +
                    Math.min(number, decimal));
        }
    }
}
