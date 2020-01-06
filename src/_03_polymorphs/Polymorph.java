package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
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
