// Uyoojo Okene
// p.407


import javax.swing.JOptionPane;

public class ExceptionDemo2
{
    public static void main(String[] args)
    {
        int numerator = 0;
        int denominator = 0;
        int result = 0;
        String inputString;

        try
        {
            inputString = JOptionPane.showInputDialog(null,
                "Enter numerator");
            numerator = Integer.parseInt(inputString);

            inputString = JOptionPane.showInputDialog(null,
                "Enter denominator");
            denominator = Integer.parseInt(inputString);

            result = numerator / denominator;
        }
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null,
                "Division by zero is not possible");
            result = 0;
        }
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null,
                "This application accepts digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        JOptionPane.showMessageDialog(null,
            "Result is " + result);
    }
}
