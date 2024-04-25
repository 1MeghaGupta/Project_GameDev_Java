package com.megha.gaming.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	
	public Enemy(int x, int speed) {
		w= 130;
		h= 130;
		this.x= x;
		this.speed = speed;
		y= 10;
		image= new ImageIcon(Enemy.class.getResource("enemy.gif"));
	}
	
	public void move() {
		if(y>900) {
			y=0;
		}
		y=y+speed;
	}

}
