/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rohan
 */
public class Game implements Runnable {
	@Override
	public void run(){
		while(true){
			try {
				Thread.sleep(7);
			} catch (InterruptedException ex) {
				Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
			}
			Ball.step();
			GamePanel.e.step();
		}
	}
}
