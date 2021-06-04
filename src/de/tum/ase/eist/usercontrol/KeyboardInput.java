package de.tum.ase.eist.usercontrol;

import java.awt.event.KeyEvent; 
import de.tum.ase.eist.model.Player;
import de.tum.ase.eist.model.Asteroids;

public class KeyboardInput {

    private Player player = null;
    private Asteroids asteroids = null;

    public KeyboardInput (Asteroids asteroids, Player player) {
        this.player = player;
        this.asteroids = asteroids;
    }

    public void keyPressing (KeyEvent e) {
        //pass
    }

    public void keyReleasing (KeyEvent e) {
        //pass
    }

}
