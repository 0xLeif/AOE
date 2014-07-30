package client.object;

import java.awt.Color;
import java.awt.Graphics;

public class Team extends Selectable {

	protected Color teamColor;

	public Team(String s, int x, int y, int w, int h, Color c) {
		super(s, x, y, w, h);
		teamColor = c;
	}

	public void setTeamColor(Color c) {
		teamColor = c;
	}

	@Override
	public void paint(Graphics g, int dx, int dy) {
		if (selected)
			g.setColor(Color.DARK_GRAY);
		else
			g.setColor(teamColor);
		g.fillRect(x+dx, y+dy, width, height);
		g.setColor(teamColor);
	}

	public Color getPaintColor() {
		return selected ? Color.DARK_GRAY : teamColor;
	}

}
