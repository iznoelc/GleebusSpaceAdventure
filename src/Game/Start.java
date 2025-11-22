/**
 * Handles set-up for the start screen.
 * @author Izzy Carlson
 */
package Game;

import javax.swing.*;
import java.awt.*;

public class Start extends JPanel {
    JFrame parent;

    /**
     * Constructor to set up the start card.
     * @param parent the Game JFrame
     */
    public Start(Game parent){
        this.parent = parent;
        setLayout(new BorderLayout());

        // sets up the layered pane to store logo and button on
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1280,720));
        add(layeredPane, BorderLayout.CENTER);

        // drawing panel to draw the logo on, set as default layer of layered pane
        DrawPanel drawingPanel = new DrawPanel();
        drawingPanel.setBounds(0,0,1280,720);
        layeredPane.add(drawingPanel, JLayeredPane.DEFAULT_LAYER);

        // set up the START button
        NextCard nextCard = new NextCard();
        JPanel buttonPanel = nextCard.getNextCardButtonPanel(parent, "START", 200, 75, "Level3");
        buttonPanel.setOpaque(false);
        buttonPanel.setBounds(0, 450, 1280, 100); // position at top
        layeredPane.add(buttonPanel, JLayeredPane.PALETTE_LAYER);
    }

    /**
     * Handles drawing images.
     */
    private class DrawPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image logo = new ImageIcon("src/Images/Logo.png").getImage();
            g.drawImage(logo,148, 100, this);
        }
    }
}
