/**
 * Helper class to handle transition between cards.
 * @author Izzy Carlson
 */
package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NextCard {
    /**
     * Creates a button that, when clicked, moves to the next specified card.
     * @param parent Game JFrame
     * @param buttonText What the button should say (i.e. START, NEXT LEVEL)
     * @param width Button's width
     * @param height Button's height
     * @param nextCard The name of the card that the button should move to when clicked
     * @return a JPanel with the next card button
     */
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
