package de.tum.ase.eist.model.enemies;

public class Asteroids {

    private int coordinateX;
    private int coordinateY;
    private int asteroidSpeed;
    private String iconsAsteroid;
    private int asteroidTypes;

    public Asteroids(int coordinateX, int coordinateY, int asteroidSpeed, String iconsAsteroid, int asteroidTypes) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.asteroidSpeed = asteroidSpeed;
        this.iconsAsteroid = iconsAsteroid;
        this.asteroidTypes = asteroidTypes;
    }

    public void behave(){
        //pass
    }

}

