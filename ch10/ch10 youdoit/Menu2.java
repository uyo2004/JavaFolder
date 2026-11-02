// Uyoojo Okene
// p.424


import javax.swing.JOptionPane;

public class Menu2
{
    protected String[] entreeChoices = {
        "Rosemary Chicken",
        "Beef Wellington",
        "Maine Lobster"
    };

    private String menu = "";
    private int choice;
    private final char[] initials = new char[3];

    public String displayMenu() throws MenuException
    {
        menu = "";

        for(int x = 0; x < entreeChoices.length; ++x)
        {
            menu += (x + 1) + " for " +
                entreeChoices[x] + "\n";

            initials[x] = entreeChoices[x].charAt(0);
        }

        String input = JOptionPane.showInputDialog(null,
            "Type your selection:\n" + menu);

        for(int x = 0; x < initials.length; ++x)
        {
            if(input.charAt(0) == initials[x])
                throw new MenuException(entreeChoices[x]);
        }

        choice = Integer.parseInt(input);

        return entreeChoices[choice - 1];
    }
}

