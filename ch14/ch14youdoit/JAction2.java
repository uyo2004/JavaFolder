// Uyoojo Okene
// p.561

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JAction2 extends JFrame implements ActionListener
{
    JLabel label = new JLabel("Enter your name:");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public JAction2()
    {
        super("Action");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(label);
        add(field);
        add(button);

        JLabel statusLabel = label;
        JButton actionButton = button;
        ActionListener listener = e -> {
            if(e.getSource() == actionButton)
            {
                statusLabel.setText("You clicked the button");
            }
            else
            {
                statusLabel.setText("You pressed Enter");
            }
        };
        button.addActionListener(listener);
        field.addActionListener(listener);
    }

    public static void main(String[] args)
    {
        JAction2 aFrame = new JAction2();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 120;

        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
