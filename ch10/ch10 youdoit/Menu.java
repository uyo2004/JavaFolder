// Uyoojo Okene
// p.424


import javax.swing.JOptionPane;

public class Menu
{
    protected String[] entreeChoices = {
        "Rosemary Chicken",
        "Beef Wellington",
        "Maine Lobster"
    };

    private String menu = "";
    private int choice;

    public String displayMenu()
    {
        menu = "";

        for(int x = 0; x < entreeChoices.length; ++x)
            menu += (x + 1) + " for " +
                entreeChoices[x] + "\n";

        String input = JOptionPane.showInputDialog(null,
            "Type your selection:\n" + menu);

        choice = Integer.parseInt(input);

        return entreeChoices[choice - 1];
    }
}

