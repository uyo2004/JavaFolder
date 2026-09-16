// Uyoojo Okene
// p. 252

import javax.swing.*; 
public class NumberInput {

    public static void main(String[] args) {
        String inputString;
        int inputNumber;
        int result;
        final int factor = 10;
        inputString = JOptionPane.showInputDialog(null, "Please enter an integer.");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * factor;
        JOptionPane.showMessageDialog(null, "The result of multiplying " + inputNumber + " * " + factor + " = " + result);
        
    }
    
}
