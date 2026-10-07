// Uyoojo Okene
// p.561

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JAction extends JFrame implements ActionListener
{
    JLabel label = new JLabel("Enter your name:");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public JAction()
    {
        super("Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(label);
        add(field);
        add(button);

        ActionListener handler = new ActionHandler(label, button);
        button.addActionListener(handler);
        field.addActionListener(handler);
    }

    private static class ActionHandler implements ActionListener
    {
        private final JLabel label;
        private final JButton button;

        ActionHandler(JLabel label, JButton button)
        {
            this.label = label;
            this.button = button;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setText("Thank you so much");
            button.setText("Application Done");
        }
    }

    public static void main(String[] args)
    {
        JAction aFrame = new JAction();
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT = 100;

        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
