package client.screens;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

import client.Client;

public abstract class Screen extends JPanel {
	protected int x;
	protected int y;

	public Screen(int x, int y) {
		this.x = x;
		this.y = y;
		setBackground(Color.BLACK);
		setLayout(null);
		setOpaque(true);
		setSize(Client.WIDTH, Client.HEIGHT);
		requestFocus();
		addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			int lastX = -1;
			int lastY = -1;

			@Override
			public void mouseMoved(MouseEvent e) {
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				int x = 0;
				int y = 0;
				if (lastX > e.getX()) {
					x -= 2;
				} else if (lastX < e.getX()) {
					x += 2;
				}
				if (lastY > e.getY()) {
					y -= 2;
				} else if (lastY < e.getY()) {
					y += 2;
				}
				moveScreen(x, y);
				lastX = e.getX();
				lastY = e.getY();
			}
		});
		setVisible(true);
	}

	public void paint(Graphics g) {
		paint(g, 0, 0);
	}

	public abstract void paint(Graphics g, int dx, int dy);

	public void moveScreen(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void update(double deltatime) {
		repaint();
	}
}
