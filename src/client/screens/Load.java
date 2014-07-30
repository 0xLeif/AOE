package client.screens;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;

import client.object.Selectable;
import client.object.Solid;
import client.object.units.Builder;

public class Load extends Screen {
	private ArrayList<Selectable> s = new ArrayList<Selectable>();
	private Rectangle mc;

	public Load(int dx, int dy) {
		super(dx, dy);
		setBackground(Color.LIGHT_GRAY);
		s.add(new Builder(50, 50, 1));
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				mc = new Rectangle(e.getX() - 5, e.getY() - 5, 5, 5);
				Iterator<Selectable> iter = s.iterator();
				int count = 0;
				while (iter.hasNext()) {
					if (iter.next().getBounds(x,y).intersects(mc)) {
						s.get(count).selected(true);
						break;
					} else {
						count++;
					}
				}
				for (int i = 0; i < s.size(); i++) {
					if (i != count)
						s.get(i).selected(false);
				}
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}

	@Override
	public void paint(Graphics g, int dx, int dy) {
		for (Selectable sel : s) {
			sel.paint(g, x, y);
		}
		try {
			g.drawRect((int) mc.getX(), (int) mc.getY(), (int) mc.getWidth(),
					(int) mc.getHeight());
		} catch (Exception e) {

		}
	}

}
