package Puzzle3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Hold a reference to spaceship decorator and delegate the calls.
 * @author Izzy Carlson
 */
public abstract class SpaceshipDecorator implements Spaceship {
    protected Spaceship decoratedGleebusShip;

    public SpaceshipDecorator(Spaceship gleebusShip){
        decoratedGleebusShip = gleebusShip;
    }

    @Override
    public void addComponent() {
        decoratedGleebusShip.getComponents().add(this);
    }

    @Override
    public ArrayList<Spaceship> getComponents(){
        return this.decoratedGleebusShip.getComponents();
    }

}
