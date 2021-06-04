package de.tum.ase.eist.model;

import java.awt.*;

public class Spaceship {

    private Shots shot;
    private GameResult gameResult;
    private Image iconSpaceship;
    private int spaceshipSpeed;
    private int spaceshipDimensionsX;
    private int spaceshipDimensionsY;
    private int life;

    public Spaceship(Shots shot, Image iconSpaceship, int spaceshipSpeed, int spaceshipDimensionsX, int spaceshipDimensionsY, int life) {
        this.shot = shot;
        this.gameResult = GameResult.PLAYING;
        this.iconSpaceship = iconSpaceship;
        this.spaceshipSpeed = spaceshipSpeed;
        this.spaceshipDimensionsX = spaceshipDimensionsX;
        this.spaceshipDimensionsY = spaceshipDimensionsY;
        this.life = life;
    }

    public void move(){
        // [TODO]: Enable movement
    }

    public void fire(){
        // [TODO]: Enable shooting
    }
}
