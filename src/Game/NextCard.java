package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextCard {
    public JPanel getNextCardButtonPanel(Game parent, String buttonText, int width, int height, String nextCard){
        JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton(buttonText);
        startButton.setPreferredSize(new Dimension(width,height));
        startButton.setFont(new Font("Dialog", Font.BOLD, 24));

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getCardLayout().show(parent.getCards(), nextCard);
            }
        });

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(startButton);

        return buttonPanel;
    }
}
