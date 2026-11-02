// Uyoojo Okene
// p.424


public class VegetarianMenu extends Menu
{
    String[] vegetarianChoices = {
        "Spinach Lasagna",
        "Vegetable Stir Fry",
        "Mushroom Risotto"
    };

    public VegetarianMenu()
    {
        super();

        for(int x = 0; x < entreeChoices.length; ++x)
            entreeChoices[x] = vegetarianChoices[x];
    }
}


