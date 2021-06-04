package de.tum.ase.eist.model;
import java.util.List;

import de.tum.ase.eist.model.enemies.Asteroids;

import java.awt.*;

public class Collision {

    private List<Asteroids> asteroids;
    private List<Shots> shots;
    private int ShotHorizon;
    private Image iconCollision;
    public ScoreBoard scoreBoard;

    public Collision(List<Asteroids> asteroids, List<Shots> shots, int shotHorizon, Image iconCollision, ScoreBoard scoreBoard) {
        this.asteroids = asteroids;
        this.shots = shots;
        ShotHorizon = shotHorizon;
        this.iconCollision = iconCollision;
        this.scoreBoard = scoreBoard;
    }

    public Collision(List<Asteroids> asteroids, List<Shots> shots, int shotHorizon, Image iconCollision) {
        this.asteroids = asteroids;
        this.shots = shots;
        ShotHorizon = shotHorizon;
        this.iconCollision = iconCollision;
    }

    public Boolean evaluateAsteroidMovement(){
        return null;
    }

    public Boolean recognizeCollision(){
        return null;
    }
}
