package client.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Solid extends Entity{

	public Solid(String s, int x, int y, int w, int h) {
		super(s, x, y, w, h);
	}
	
	public Rectangle getBounds(){
		return getBounds(0, 0);
	}
	
	public Rectangle getBounds(int dx, int dy){
		return new Rectangle(dx+x, dy+y, width, height);
	}
	
	@Override
	public void paint(Graphics g, int dx, int dy) {
		g.fillRect((int)getBounds().getX()+dx, (int)getBounds().getY()+dy, width, height);
	}

}
