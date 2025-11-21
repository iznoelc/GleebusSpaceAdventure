package Level_3;

import Game.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level_3 extends JPanel {
    private Spaceship gleebusShip = new BrokenSpaceship();
    private Game parent;

    public Level_3(Game parent){
        this.parent = parent;
        setLayout(new BorderLayout());

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1280,720));
        add(layeredPane, BorderLayout.CENTER);

        DrawPanel drawingPanel = new DrawPanel();
        drawingPanel.setBounds(0,0,1280,720);
        layeredPane.add(drawingPanel, JLayeredPane.DEFAULT_LAYER);

        JPanel buttonPanel = getButtonJPanel(parent);
        buttonPanel.setBounds(0, 0, 1280, 100); // position at top
        layeredPane.add(buttonPanel, JLayeredPane.PALETTE_LAYER);

        gleebusShip.addComponent();
        System.out.println("Gleebus ship : " + gleebusShip.getComponents().getFirst());

//        add(drawingPanel, BorderLayout.NORTH);
//        //add(buttonPanel, BorderLayout.NORTH);

    }

    private JPanel getButtonJPanel(JFrame frame) {
        JButton myButton = new JButton("REPAIR");
        JPanel buttonPanel = new JPanel();
        //buttonPanel.setLayout(null);
        //myButton.setBounds(590,400,100,25);
        buttonPanel.setLayout(new FlowLayout());

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                System.out.println("Button was clicked!");
                Spaceship leverComponent = new LeverDecorator(gleebusShip);
                leverComponent.addComponent();
                leverComponent.setVisible(true);
                System.out.println("Gleebus ship : " + gleebusShip.getComponents().get(1));

                Spaceship buttonPanelComponent = new ButtonPanelDecorator(gleebusShip);
                buttonPanelComponent.addComponent();
                buttonPanelComponent.setVisible(true);

                Spaceship screenComponent = new ScreenDecorator(gleebusShip);
                screenComponent.addComponent();
                screenComponent.setVisible(true);
                parent.getContentPane().repaint();
            }
        });

        buttonPanel.add(myButton);
        return buttonPanel;
    }

    private class DrawPanel extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (gleebusShip.getComponents() != null){
                for(Spaceship spaceship : gleebusShip.getComponents()) {

                    if (spaceship.getVisibility()){
                        Image img = spaceship.getImage();
                        System.out.println("Image is null? " + (img == null));

                        g.drawImage(spaceship.getImage(), 0,0, this);
                    }
                }
            } else {
                System.out.println("Ship component array list is null");
            }

        }
    }
}
