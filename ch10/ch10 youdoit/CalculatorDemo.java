// Uyoojo Okene
// p.431



import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo
{
    public static void main(String[] args) throws IOException
    {
        try (Scanner input = new Scanner(System.in)) {
            Process process = Runtime.getRuntime().exec("calc.exe");

            double num1 = 279.6;
            double num2 = 872.8;
            double answer = num1 + num2;
            double usersAnswer;

            System.out.print("What is " + num1 + " + " + num2 + "? ");
            usersAnswer = input.nextDouble();

            if(usersAnswer == answer)
                System.out.println("Correct!");
            else
                System.out.println("Sorry, the correct answer is " + answer);
        }
    }
}


