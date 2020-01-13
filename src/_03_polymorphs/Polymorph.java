package _03_polymorphs;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public abstract class Polymorph{
    int x;
    int y;
    int width;
    int height;
    int hey = 0;
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
    	if(this instanceof MovingMorph) {
    		this.x++;
    		if(this.x> 200) {
    			this.x =0;
    		}
    	}
    	if(this instanceof CircleMorph) {
    		hey++;
    		this.x = (int) Math.round(Math.sin(hey * Math.PI/180)*100);
    		this.y = (int) Math.round(Math.cos(hey * Math.PI/180)*100);
    	}
    	if(this instanceof MouseMorph) {
    		Point p = MouseInfo.getPointerInfo().getLocation();
    		this.x = p.x;
    		this.y = p.y;
    		
    	}
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public void setX(int p) {
    	x = p;
    }
    public void setY(int p) {
    	y = p;
    }
    public void setWidth(int p) {
    	width = p;
    }
    public void setHeight(int p) {
    	height = p;
    }
    public abstract void draw(Graphics g);
}
