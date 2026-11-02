// Uyoojo Okene
// p.424


import javax.swing.JOptionPane;

public class PlanMenu2
{
    public static void main(String[] args)
    {
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice;

        try
        {
            entree = new PickMenu2(briefMenu);
            guestChoice = entree.getGuestChoice();
        }
        catch(MenuException exception)
        {
            guestChoice = exception.getMessage();
        }
        catch(Exception exception)
        {
            guestChoice = "an invalid selection";
        }

        JOptionPane.showMessageDialog(null,
            "You chose " + guestChoice);
    }
}

