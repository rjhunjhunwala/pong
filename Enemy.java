/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author rohan
 */
public class Enemy{
	public double x=400-width/2;
	public static final int y= 0;
	public static final int depth=10;
	public static final int width=50;
	public boolean isInMesh(int x, int y){
		int xDist=x- (int) this.x;
		int yDist=y-this.y;
	return(xDist>0&&xDist<width&&yDist>0&&yDist<depth);
	}
	public void drawSelf(Graphics g){
		g.setColor(Color.red);
		g.fillRect((int) x, y, width, depth);
	}
public void step(){
	this.x+=Ball.getX()>this.x+width/2?.85:-.85;
	if(x<0){
		x=0;
	}
	if(x>800-width){
		x=800-width;
	}
}
}

