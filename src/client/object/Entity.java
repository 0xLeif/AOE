package client.object;

import java.awt.Color;
import java.awt.Graphics;

public class Entity {
	protected String name;
	protected int x, y,width,height;

	public Entity(String s, int x, int y,int w,int h) {
		name = s;
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	
	public void paint(Graphics g){
		paint(g, 0, 0);
	}
	
	public void paint(Graphics g, int dx, int dy){
		g.setColor(Color.LIGHT_GRAY);
		g.drawRect(x+dx, y+dy, width, height);
	}
	
}
