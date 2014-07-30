package client.object.units;

import java.awt.Color;
import java.awt.Graphics;

public class Builder extends Unit{

	public Builder(int x, int y, int teamNum) {
		super("Builder", x, y, 10, 10, 100, teamNum);
	}
	
	@Override
	public void paint(Graphics g, int dx, int dy) {
//		super.paint(g, dx, dy);
		g.setColor(getPaintColor());
		g.fillOval(x+dx, y+dy, width, height);
		g.setColor(Color.black);
	}

}
