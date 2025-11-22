package Game;

import javax.swing.*;
import java.awt.*;

public class Start extends JPanel {
    JFrame parent;

    public Start(Game parent){
        this.parent = parent;
        setLayout(new BorderLayout());

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1280,720));
        add(layeredPane, BorderLayout.CENTER);

        DrawPanel drawingPanel = new DrawPanel();
        drawingPanel.setBounds(0,0,1280,720);
        layeredPane.add(drawingPanel, JLayeredPane.DEFAULT_LAYER);

        NextCard nextCard = new NextCard();
        JPanel buttonPanel = nextCard.getNextCardButtonPanel(parent, "START", 200, 75, "Level3");
        buttonPanel.setOpaque(false);
        buttonPanel.setBounds(0, 450, 1280, 100); // position at top
        layeredPane.add(buttonPanel, JLayeredPane.PALETTE_LAYER);
    }

    private class DrawPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Image logo = new ImageIcon("src/Images/Logo.png").getImage();
            g.drawImage(logo,148, 100, this);
        }
    }
}
