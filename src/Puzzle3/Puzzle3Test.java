//package Puzzle3;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Puzzle3Test extends JFrame {
//    Spaceship gleebusShip = new BrokenSpaceship();
//
//
//    public Puzzle3Test(){
//        JFrame frame = new JFrame("Puzzle 3 test");
//        frame.setSize(1280,720);
//        frame.setLocation(0,0);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //frame.setLayout(null);
//
//        JPanel buttonPanel = getButtonJPanel(frame);
//
//        gleebusShip.addComponent();
//        System.out.println("Gleebus ship : " + gleebusShip.getComponents().getFirst());
//        DrawPanel drawingPanel = new DrawPanel();
//        drawingPanel.setLayout(null);
//
//
//
//        drawingPanel.setBounds(0,0,1280,720);
//        buttonPanel.setBounds(0,0,1280,720);
//
//        frame.add(drawingPanel);
//        frame.add(buttonPanel);
//
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//        frame.setResizable(false);
//    }
//
//    private JPanel getButtonJPanel(JFrame frame) {
//        JButton myButton = new JButton("REPAIR");
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(null);
//        myButton.setBounds(590,400,100,25);
//
//        myButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Code to execute when the button is clicked
//                System.out.println("Button was clicked!");
//                Spaceship leverComponent = new LeverDecorator(gleebusShip);
//                leverComponent.addComponent();
//                leverComponent.setVisible(true);
//                System.out.println("Gleebus ship : " + gleebusShip.getComponents().get(1));
//
//                Spaceship buttonPanelComponent = new ButtonPanelDecorator(gleebusShip);
//                buttonPanelComponent.addComponent();
//                buttonPanelComponent.setVisible(true);
//
//                Spaceship screenComponent = new ScreenDecorator(gleebusShip);
//                screenComponent.addComponent();
//                screenComponent.setVisible(true);
//                frame.getContentPane().repaint();
//            }
//        });
//
//        buttonPanel.add(myButton);
//        return buttonPanel;
//    }
//
//    private class DrawPanel extends JPanel {
//
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//
//            if (gleebusShip.getComponents() != null){
//                for(Spaceship spaceship : gleebusShip.getComponents()) {
//
//                    if (spaceship.getVisibility()){
//                        g.drawImage(spaceship.getImage(), 0,-25, this);
//                    }
//                }
//            } else {
//                System.out.println("Ship component array list is null");
//            }
//
//        }
//    }
//
//    public static void main(String[] args){
//        SwingUtilities.invokeLater(() -> {
//            // set look and feel to match operating system's native style
//            try {
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            Puzzle3Test demo = new Puzzle3Test();
//        });
//    }
//}
