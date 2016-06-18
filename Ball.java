/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Singleton sorry
 *
 * @author rohan
 */
public class Ball {

	private static int enemyScore;
	private static int playerScore;
	private static double x = 350;
	private static double y = 350;
	private static double dX;
	private static double dY;

	public synchronized static void reset() {
		setX(350);
		setY(350);
		
			double angle = 1;
			switch ((int) (Math.random() * 8)) {
				case 0:
					angle = Math.PI / 6;
					break;
				case 1:
					angle = Math.PI / 3;
					break;
				case 2:
					angle = 2 * Math.PI / 3;
					break;
				case 3: angle=5*Math.PI/6;
					break;
				case 4:
					angle=7*Math.PI/6;
					break;
				case 5:
					angle=8*Math.PI/6;
					break;
				case 6:
					angle= 5*Math.PI/3;
					break;
				case 7:
					angle=11*Math.PI/6;
					break;
			}
			setdX(Math.cos(angle) * 1.5);
			setdY(Math.sin(angle) * 1.5);
		
	}

	public synchronized static void step() {
		if (getX() < 0 || getX() > 800) {
			setdX(-getdX());
		}
		if (getY() < 0) {
			setPlayerScore(getPlayerScore() + 1);
			reset();
			return;
		} else if (getY() > 800) {
			setEnemyScore(getEnemyScore() + 1);
			reset();
			return;
		}
		if (GamePanel.p.isInMesh((int) getX(), (int) getY()) || GamePanel.e.isInMesh((int) getX(), (int) getY())) {
			dY = -dY;
			dX += Math.random() * 2 > 1 ? -.5 : .5;
		}
		setX(getX() + getdX());
		setY(getY() + getdY());

	}

	public synchronized static void drawSelf(Graphics g) {
		g.setColor(Color.black);
		g.fillOval((int) x - 5, (int) y - 5, 10, 10);

	}

	/**
	 * @return the enemyScore
	 */
	public synchronized static int getEnemyScore() {
		return enemyScore;
	}

	/**
	 * @param aEnemyScore the enemyScore to set
	 */
	public synchronized static void setEnemyScore(int aEnemyScore) {
		enemyScore = aEnemyScore;
	}

	/**
	 * @return the playerScore
	 */
	public synchronized static int getPlayerScore() {
		return playerScore;
	}

	/**
	 * @param aPlayerScore the playerScore to set
	 */
	public synchronized static void setPlayerScore(int aPlayerScore) {
		playerScore = aPlayerScore;
	}

	/**
	 * @return the x
	 */
	public synchronized static double getX() {
		return x;
	}

	/**
	 * @param aX the x to set
	 */
	public synchronized static void setX(double aX) {
		x = aX;
	}

	/**
	 * @return the y
	 */
	public synchronized static double getY() {
		return y;
	}

	/**
	 * @param aY the y to set
	 */
	public synchronized static void setY(double aY) {
		y = aY;
	}

	/**
	 * @return the dX
	 */
	public synchronized static double getdX() {
		return dX;
	}

	/**
	 * @param adX the dX to set
	 */
	public synchronized static void setdX(double adX) {
		dX = adX;
	}

	/**
	 * @return the dY
	 */
	public synchronized static double getdY() {
		return dY;
	}

	/**
	 * @param adY the dY to set
	 */
	public synchronized static void setdY(double adY) {
		dY = adY;
	}
}
