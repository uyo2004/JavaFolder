// Uyoojo Okene
// p.403

import javax.swing.JOptionPane; // Imports JOptionPane for input and output dialog boxes.

public class ExceptionDemo { // Defines the ExceptionDemo class.

    public static void main(String[] args) { // Main method starts the program.

        int numerator;       // Stores the first number entered by the user.
        int denominator; // Stores the second number entered by the user.
        int result;           // Stores the result of the division.
        String inputString;  // Stores the user's input as a String.

        try { // Attempts to execute the division operation.

            inputString = JOptionPane.showInputDialog(
                null, "Enter the numerator:"); // Requests the first number.
            numerator = Integer.parseInt(inputString); // Converts input to an integer.

            inputString = JOptionPane.showInputDialog(
                null, "Enter the denominator:"); // Requests the second number.
            denominator = Integer.parseInt(inputString); // Converts input to an integer.

            result = numerator / denominator; // Divides the numerator by the denominator.

        } catch (ArithmeticException error) { // Handles division by zero.

            JOptionPane.showMessageDialog(
                null, "Error: Cannot divide by zero."); // Displays an error message.

            result = 0; // Sets the result to zero after the error.
        }

        JOptionPane.showMessageDialog(
            null, "Result is " + result); // Displays the final division result.

    } 
} 
