package Level_3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Interface to define the common functionality for both the base spaceship and spaceship decorators.
 * @author Izzy Carlson
 */
public interface Spaceship {
    void addComponent();
    Image getImage();
    void setVisible(boolean visibility);
    boolean getVisibility();
    ArrayList<Spaceship> getComponents();
}
