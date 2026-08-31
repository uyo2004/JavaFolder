
import java.util.Scanner;

// Uyoojo Okene
// p.71 Aug. 31
public class ArithmeticDemo3 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first number >> ");
            firstNumber = input.nextInt();
            System.out.print("Enter the second number >> ");
            secondNumber = input.nextInt();
        }
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum / 2;

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The average is " + average);
    }
}