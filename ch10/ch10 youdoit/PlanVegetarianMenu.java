// Uyoojo Okene
// p.424


import javax.swing.JOptionPane;

public class PlanVegetarianMenu
{
    public static void main(String[] args)
    {
        VegetarianMenu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice;

        try
        {
            entree = new PickMenu(briefMenu);
            guestChoice = entree.getGuestChoice();
        }
        catch(Exception exception)
        {
            guestChoice = "an invalid vegetarian selection";
        }

        JOptionPane.showMessageDialog(null,
            "You chose " + guestChoice);
    }
}

