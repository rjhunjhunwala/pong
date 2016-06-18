package pong;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class GamePanel extends JPanel{
	public static final Player p=new Player();
	public static final Enemy e = new Enemy();
	public GamePanel(){
		this.setBackground(Color.gray);
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(700,700);//hardcoded
	}
	@Override
	public void paintComponent(Graphics g){
	 e.drawSelf(g);
		p.drawSelf(g);
		Ball.drawSelf(g);
		g.drawString(Ball.getEnemyScore()+"", 670, 330);
				g.drawString("___", 670, 340);
						g.drawString(Ball.getPlayerScore()+"", 670, 360);
	}
}
