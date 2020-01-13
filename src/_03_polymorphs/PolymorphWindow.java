package _03_polymorphs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	poly.add(new BluePolymorph(50, 50, 50, 50));
   	poly.add(new RedMorph(100, 50, 50, 50));
   	poly.add(new MovingMorph(50,250, 50,50));
   	poly.add(new CircleMorph(250,250, 50,50));
   	poly.add(new MouseMorph(100,100, 50,50));
   	poly.add(new ImageMorph(300,400, 50,50));
   	poly.add(new MessageMorph(300,300, 50, 50));
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	for (Polymorph i : poly) {
   		i.draw(g);
   	}
   	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	for (Polymorph i : poly) {
   		i.update();
   	}
    }
    public void mouseClicked(MouseEvent arg0) {
    	
    }
    public void mousePressed(MouseEvent arg0) {
    	System.out.println(arg0.getX());
		System.out.println(arg0.getY());
		// TODO Auto-generated method stub
		if(arg0.getX() > 300 && arg0.getX() < 350 && arg0.getY() > 325 && arg0.getY() < 375) {
			JOptionPane.showMessageDialog(null, "Wow that's rude");
		}

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
