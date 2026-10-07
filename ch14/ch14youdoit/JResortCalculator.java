// Uyoojo Okene
// p.577

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JResortCalculator extends JFrame implements ItemListener
{
    // Resort prices
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;

    // Check boxes
    JCheckBox weekendBox =
        new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);

    JCheckBox breakfastBox =
        new JCheckBox("Breakfast $" + BREAKFAST_PREMIUM, false);

    JCheckBox golfBox =
        new JCheckBox("Golf $" + GOLF_PREMIUM, false);

    // Labels and text field
    JLabel resortLabel =
        new JLabel("Resort Price Calculator");

    JLabel optionLabel =
        new JLabel("Select the options you want:");

    JLabel priceLabel =
        new JLabel("Total price:");

    JTextField totPrice = new JTextField(10);

    public JResortCalculator()
    {
        super("Resort Price Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(resortLabel);
        add(optionLabel);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(priceLabel);
        add(totPrice);

        // Display starting price
        totPrice.setText("$" + BASE_PRICE);

        // Register a listener that does not expose this during construction
        ItemListener listener = new ResortPriceListener(
            weekendBox, breakfastBox, golfBox, totPrice,
            BASE_PRICE, WEEKEND_PREMIUM, BREAKFAST_PREMIUM, GOLF_PREMIUM);
        weekendBox.addItemListener(listener);
        breakfastBox.addItemListener(listener);
        golfBox.addItemListener(listener);
    }

    private static class ResortPriceListener implements ItemListener
    {
        private final JCheckBox weekendBox;
        private final JCheckBox breakfastBox;
        private final JCheckBox golfBox;
        private final JTextField totalPriceField;
        private final int basePrice;
        private final int weekendPremium;
        private final int breakfastPremium;
        private final int golfPremium;

        ResortPriceListener(JCheckBox weekendBox, JCheckBox breakfastBox,
                            JCheckBox golfBox, JTextField totalPriceField,
                            int basePrice, int weekendPremium,
                            int breakfastPremium, int golfPremium)
        {
            this.weekendBox = weekendBox;
            this.breakfastBox = breakfastBox;
            this.golfBox = golfBox;
            this.totalPriceField = totalPriceField;
            this.basePrice = basePrice;
            this.weekendPremium = weekendPremium;
            this.breakfastPremium = breakfastPremium;
            this.golfPremium = golfPremium;
        }

        @Override
        public void itemStateChanged(ItemEvent event)
        {
            int totalPrice = basePrice;
            if(weekendBox.isSelected())
                totalPrice += weekendPremium;
            if(breakfastBox.isSelected())
                totalPrice += breakfastPremium;
            if(golfBox.isSelected())
                totalPrice += golfPremium;

            totalPriceField.setText("$" + totalPrice);
        }
    }

    public static void main(String[] args)
    {
        JResortCalculator aFrame = new JResortCalculator();

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 200;

        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}