package Puzzle3;

import javax.swing.*;
import java.awt.*;

/**
 * Concrete decorator to extend the spaceship decorator and add the lever component to the spaceship's
 * list of components in order to "decorate" the broken spaceship with the fixed lever.
 * @author Izzy Carlson
 */
public class LeverDecorator extends SpaceshipDecorator {
    private Image image;
    private boolean visibility;

    public LeverDecorator(Spaceship gleebusShip) {
        super(gleebusShip);
        this.image = new ImageIcon("src/Images/Puzzle3/P3_Lever.png").getImage();
        this.visibility = false;
    }

    @Override
    public Image getImage() {
        return this.image;
    }

    @Override
    public void setVisible(boolean visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean getVisibility() {
        return this.visibility;
    }
}
