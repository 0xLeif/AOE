package client.object.units;

import java.awt.Color;
import java.awt.Graphics;

import client.object.Team;

public class Unit extends Team {
	protected double health;

	public Unit(String s, int x, int y, int w, int h, double health, int teamNum) {
		super(s, x, y, w, h, Color.yellow);
		switch (teamNum) {
		case 1:
			teamColor = Color.blue;
			break;
		case 2:
			teamColor = Color.red;
			break;
		case 3:
			teamColor = Color.green;
			break;
		case 4:
			teamColor = Color.magenta;
			break;
		default:
			break;

		}
		setTeamColor(teamColor);
		this.health = health;
	}

	public double getHealth() {
		return health;
	}
	
	@Override
	public void paint(Graphics g, int dx, int dy) {
		super.paint(g, dx, dy);
	}

}
