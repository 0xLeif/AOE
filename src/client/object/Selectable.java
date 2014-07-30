package client.object;

import java.awt.Color;
import java.awt.Graphics;

public class Selectable extends Solid {
	protected boolean selected;

	public Selectable(String s, int x, int y, int w, int h) {
		super(s, x, y, w, h);
	}
	
	@Override
	public void paint(Graphics g, int dx, int dy) {
		if (selected)
			g.setColor(Color.darkGray);
		else
			g.setColor(Color.black);
		super.paint(g, dx, dy);
		g.setColor(Color.black);
	}
	
	public void selected(boolean b){
		selected = b;
	}
	
	public boolean isSelected(){
		return selected;
	}

}
