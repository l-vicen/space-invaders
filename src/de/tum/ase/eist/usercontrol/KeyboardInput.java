package de.tum.ase.eist.usercontrol;

import java.awt.event.KeyEvent; 
import de.tum.ase.eist.model.Player;
import de.tum.ase.eist.model.enemies.Asteroids;

public class KeyboardInput {

    private Player player = null;
    private Asteroids asteroids = null;

    public KeyboardInput (Asteroids asteroids, Player player) {
        this.player = player;
        this.asteroids = asteroids;
    }

    public void keyPressing (KeyEvent e) {
        // [TODO]: Handle press events
    }

    public void keyReleasing (KeyEvent e) {
        // [TODO]: Handle release events
    }

}
