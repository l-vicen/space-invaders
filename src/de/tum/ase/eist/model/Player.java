package de.tum.ase.eist.model;

public class Player {

    private int positionX;
    private int positionY;
    private Spaceship spaceship;

    public Player(int positionX, int positionY, Spaceship spaceship) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.spaceship = spaceship;
    }

    public void setup(){
        // [TODO]: Player setup
    }

}
