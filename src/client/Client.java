package client;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import client.screens.Load;
import client.screens.Screen;
import source.data.DataReader;
import source.data.DataWriter;

public class Client extends JFrame implements Runnable{
	public static final int WIDTH = 600, HEIGHT = 400;
	// private DataReader dr = new DataReader("../../../Project AOE","data");
	// private DataWriter dw = new DataWriter(dr);
	private Screen screen = new Load(0, 0);

	public Client() {
		super("AOE");
		JFrame frame = this;
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// dw.close();
				// dr.close();
			}
		});
		frame.setResizable(false);
		frame.add(screen);
		frame.setVisible(true);
		new Thread(this).start();
	}

	public static void main(String[] args) {
		new Client();
	}

	@Override
	public void paint(Graphics g) {
		screen.paint(g);
	}

	@Override
	public void run() {
		while(true){
			screen.update(.16);
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
