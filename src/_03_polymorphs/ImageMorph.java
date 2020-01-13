package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	BufferedImage img;
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(img, x, y, width, height, Color.black, null);
	}
	
}
