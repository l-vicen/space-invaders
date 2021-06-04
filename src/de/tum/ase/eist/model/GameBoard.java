package de.tum.ase.eist.model;
import java.awt.*;

public class GameBoard {

    private int with;
    private int height;
    private Color backgroundColor;
    private Player player;
    public ScoreBoard scoreBoard;

    public GameBoard(int with, int height, Color backgroundColor, Player player, ScoreBoard scoreBoard) {
        this.with = with;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.player = player;
        this.scoreBoard = scoreBoard;
    }

    public void startGame(){
        // [TODO]: Initiate function
    }

    public void endGame(){
        // [TODO]: End function
    }

    public void generateSpaceShip(){
        // [TODO]: Generate spaceship
    }

    public void generateAsteroids(){
        // [TODO]: Generate enemies
    }

    public void moveAsteroids(){
        // [TODO]: Start attack

    }

}
