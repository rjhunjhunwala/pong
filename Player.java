package pong;


import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohan
 */
public class Player {
	public int x=350-width/2;
	public static final int y=690;
	public static final int depth=10;
	public static final int width=50;
	public boolean isInMesh(int x, int y){
		int xDist=x-this.x;
		int yDist=y-this.y;
	return(xDist>0&&xDist<width&&yDist>0&&yDist<depth);
	}
	public void drawSelf(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(x, y, width, depth);
	}
}
