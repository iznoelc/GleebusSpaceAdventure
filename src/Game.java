import Level_1.Level_1;
import Level_2.Level_2;
import Level_3.Level_3;
import Level_4.Level_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Game extends JFrame {
    //variables for screen
    private JTextArea output_area;

    public Game(){
        //game screen setup
        setTitle("Gleebus's Space Adventure");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocationRelativeTo(null);

        // JavaSwingDemo2.Main panel with tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Start Adventure", new Start());
        tabbedPane.addTab("Level 1", new Level_1());
        tabbedPane.addTab("Level 2", new Level_2());
        tabbedPane.addTab("Level 3", new Level_3());
        tabbedPane.addTab("Level 4", new Level_4());
        tabbedPane.addTab("The End", new End());

        //disable all but starting screen
        tabbedPane.setEnabledAt(1,false);
        tabbedPane.setEnabledAt(2,false);
        tabbedPane.setEnabledAt(3,false);
        tabbedPane.setEnabledAt(4,false);
        tabbedPane.setEnabledAt(5,false);

        // Output area at bottom
        output_area = new JTextArea(5, 50);
        output_area.setEditable(false);
        output_area.setBorder(BorderFactory.createTitledBorder("Event Output"));
        JScrollPane scrollPane = new JScrollPane(output_area);

        // Layout
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            Game demo = new Game();
            demo.setVisible(true);
        });
    }
}
