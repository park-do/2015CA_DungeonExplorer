package de.windows;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import de.manager.FightManager;

public class MapWindow extends JFrame {

	int x, y;
	int xMon, yMon;

	int xDirection, yDirection;
	private Image dbImage;// doubleBuffer
	private Graphics dbg;
	Image Player, Monster;
	Image Floor;

	public class AL extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
				x -= 50;
			}
			if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
				x += 50;
			}
			if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
				y -= 50;
			}
			if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
				y += 50;
			}
		}

		public void keyRealeased(KeyEvent e) {

		}
	}

	public MapWindow() {

		// Load Images
		ImageIcon i0 = new ImageIcon(
				"resource/Floor.png");
		Floor = i0.getImage();

		ImageIcon i1 = new ImageIcon(
				"resource/Player.png");
		Player = i1.getImage();
		ImageIcon i2 = new ImageIcon(
				"resource/Monster.png");
		Monster = i2.getImage();
		// Game properties
		addKeyListener(new AL());
		setTitle("Dungeon Explorer");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		x = 125;
		y = 125;
		xMon = 275;
		yMon = 225;
	}

	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(Floor, 0, 0, this);
		g.drawImage(Monster, xMon, yMon, this);
		g.drawImage(Player, x, y, this);

		repaint();
		if(isCollide(this.x, this.y))
		{
			FightManager.getInstance().Start(null);
		}
	}

	public boolean isCollide(int x, int y) {
		int m = x - xMon;
		int n = y - yMon;
		if (-25 < m && m < 25 && -25 < n && n < 25) {
			// System.out.println(true + " : " + m + "," + n);
			return true;
		} else
			// System.out.println(false + " : " + m + "," + n);
			return false;
	}

}
