/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author rohan
 */
public class GameFrame extends JFrame{
	public GameFrame(){
		super("Pong");
		this.setAlwaysOnTop(true);
		this.setVisible(true);
this.add(new GamePanel());
		this.pack();
		this.setBackground(Color.gray);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new Controller());
		Ball.reset();
		new Thread((Runnable) new Game()).start();
	}
}
