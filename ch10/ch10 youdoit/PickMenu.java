// Uyoojo Okene
// p.424


import javax.swing.JOptionPane;

public class PickMenu
{
    private final Menu briefMenu;
    private String guestChoice;

    public PickMenu(Menu theMenu)
    {
        briefMenu = theMenu;
        setGuestChoice();
    }

    public void setGuestChoice()
    {
        JOptionPane.showMessageDialog(null,
            "Choose from the following menu.");

        guestChoice = briefMenu.displayMenu();
    }

    public String getGuestChoice()
    {
        return guestChoice;
    }
}

