package de.windows;

import java.awt.Graphics;
import java.awt.Image;
import java.lang.Math;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import de.manager.FightManager;
import de.manager.KeyInputManager;

public class MapWindow extends JFrame implements Runnable {

	private Thread thread;
	public boolean running = false;
	public int tickCount = 0;
	long lastTime;

	public static KeyInputManager keyipm;

	int x, y;
	int xMon, yMon;

	int player_speed = 2;
	int monster_speed = 1;

	int xDirection, yDirection;

	public int where;

	private Image dbImage;
	private Graphics dbg;
	Image Player, Monster;
	Image Town, Stone, Cemetery, Sky, Desert, Magma;

	public MapWindow() {

		keyipm = new KeyInputManager(this);
		setTitle("Dungeon Explorer");
		setSize(500, 528);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(false);
		x = 125;
		y = 125;
		xMon = 275;
		yMon = 225;

		where = 0;
		/*
		 * 0 : Town, 1 : Stone, 2 : Cemetery, 3 : Sky, 4 : Desert, 5 : Magma
		 */

		new Thread(this).start();
	}

	public int distPlayerMonster() {
		int m = Math.abs(x - xMon);
		int n = Math.abs(y - yMon);
		int p = (int) Math.sqrt(m * m + n * n);
		System.out.println(p);
		return p;
	}

	public void navigate() {

		if (distPlayerMonster() < 150 && keyipm.left.isPressed()) {
			if (x < xMon) {
				xMon -= monster_speed;
			}
			if (x == xMon) {
				xMon += 0;
			}
			if (x > xMon) {
			//	xMon += monster_speed;
			}
		}
		if (distPlayerMonster() < 150 && keyipm.right.isPressed()) {
			if (x > xMon) {
				xMon += monster_speed;
			}
			if (x == xMon) {
				xMon += 0;
			}
			if (x < xMon) {
			//	xMon -= monster_speed;
			}
		}
		if (distPlayerMonster() < 150 && keyipm.down.isPressed()) {
			if (y < yMon) {
				yMon -= monster_speed;
			}
			if (y == yMon) {
				yMon += 0;
			}
			if (y > yMon) {
			//	yMon += monster_speed;
			}
		}
		if (distPlayerMonster() < 150 && keyipm.up.isPressed()) {
			if (y > yMon) {
				yMon += monster_speed;
			}
			if (y == yMon) {
				yMon += 0;
			}
			if (y < yMon) {
			//	yMon -= monster_speed;
			}
		}

	}

	public boolean monsterCollide(int x, int y) {
		int m = x - xMon;
		int n = y - yMon;
		if (-25 < m && m < 25 && -25 < n && n < 25) {
			System.out.println(true + " : " + m + "," + n);
			keyipm.up.force();
			keyipm.down.force();
			keyipm.left.force();
			keyipm.right.force();
			return true;
		} else
			System.out.println(false + " : " + m + "," + n);
		return false;
	}

	public int doorCollide(int x, int y) {
		int m = x + 15;
		int n = y;
		if (10 < m && m < 40 && 0 < n && n < 20) {
			return 1;
		}
		if (0 < m && m < 16 && 115 < n && n < 145) {
			return 2;
		}
		if (0 < m && m < 16 && 315 < n && n < 345) {
			return 3;
		}
		if (60 < m && m < 90 && 480 < n && n < 510) {
			return 4;
		}
		if (460 < m && m < 495 && 450 < n && n < 490) {
			return 5;
		}

		return 0;
	}

	public int gateCollide(int x, int y) {
		int m = x + 15;
		int n = y;
		if (where == 1 && 450 < m && m < 500 && 0 < n && n < 50) {
			return 0;
		}
		if (where == 2 && 100 < m && m < 150 && 100 < n && n < 150) {
			return 0;
		}
		if (where == 3 && 400 < m && m < 450 && 350 < n && n < 400) {
			return 0;
		}
		if (where == 4 && 450 < m && m < 500 && 0 < n && n < 50) {
			return 0;
		}

		return where;
	}

	public boolean shopCollide(int x, int y) {
		int m = x + 15;
		int n = y;
		if (250 < m && m < 300 && 250 < n && n < 280) {
			return true;
		}
		return false;
	}

	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000 / 60D;

		int ticks = 0;
		int frames = 0;

		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		init();

		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = true;

			while (delta >= 1) {
				ticks++;
				tick();
				delta -= 1;
				shouldRender = true;
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (shouldRender) {
				frames++;
				// render();
			}

			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				System.out
						.println("" + ticks + " ticks, " + frames + " frames");
				frames = 0;
				ticks = 0;
			}
		}
	}

	public void tick() {
		tickCount++;
		if (keyipm.left.isPressed()) {
			x -= player_speed;
		}
		if (keyipm.right.isPressed()) {
			x += player_speed;
		}
		if (keyipm.down.isPressed()) {
			y += player_speed;
		}
		if (keyipm.up.isPressed()) {
			y -= player_speed;
		}

	}

	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}

	public void paintComponent(Graphics g) {

		if (x > 490) {
			x = 490;
		}
		if (y > 490) {
			y = 490;
		}
		if (x < 0) {
			x = 0;
		}
		if (y < 0) {
			y = 0;
		}
		if (xMon > 490) {
			xMon = 490;
		}
		if (yMon > 490) {
			yMon = 490;
		}
		if (xMon < 0) {
			yMon = 0;
		}
		if (yMon < 0) {
			yMon = 0;
		}

		switch (where) {
		case 0: {
			g.drawImage(Town, 0, 28, this);
			g.drawImage(Player, x, y, this);
			repaint();
			if (doorCollide(this.x, this.y) == 1) {
				where = 1;
			}
			if (doorCollide(this.x, this.y) == 2) {
				where = 2;
			}
			if (doorCollide(this.x, this.y) == 3) {
				where = 3;
			}
			if (doorCollide(this.x, this.y) == 4) {
				where = 4;
			}
			if (doorCollide(this.x, this.y) == 5) {
				where = 5;
			}
			if (shopCollide(this.x, this.y)) {
				// ShopManager.getInstance().Start(null);
			}
			break;
		}
		case 1: {
			g.drawImage(Stone, 0, 28, this);
			g.drawImage(Monster, xMon, yMon, this);
			g.drawImage(Player, x, y, this);
			repaint();
			if (monsterCollide(this.x, this.y)) {
				FightManager.getInstance().Start(null);
				x = 450;
				y = 250;
			}
			if (gateCollide(this.x, this.y) == 0) {
				where = 0;
			}
			break;
		}
		case 2: {
			g.drawImage(Cemetery, 0, 28, this);
			g.drawImage(Monster, xMon, yMon, this);
			g.drawImage(Player, x, y, this);
			repaint();
			if (monsterCollide(this.x, this.y)) {
				FightManager.getInstance().Start(null);
				x = 450;
				y = 250;
			}
			if (gateCollide(this.x, this.y) == 0) {
				where = 0;
			}
			break;
		}
		case 3: {
			g.drawImage(Sky, 0, 28, this);
			g.drawImage(Monster, xMon, yMon, this);
			g.drawImage(Player, x, y, this);
			repaint();
			if (monsterCollide(this.x, this.y)) {
				FightManager.getInstance().Start(null);
				x = 450;
				y = 250;
			}
			if (gateCollide(this.x, this.y) == 0) {
				where = 0;
			}
			break;
		}
		case 4: {
			g.drawImage(Desert, 0, 28, this);
			g.drawImage(Monster, xMon, yMon, this);
			g.drawImage(Player, x, y, this);
			repaint();
			if (monsterCollide(this.x, this.y)) {
				FightManager.getInstance().Start(null);
				x = 450;
				y = 250;
			}
			if (gateCollide(this.x, this.y) == 0) {
				where = 0;
			}
			break;
		}
		case 5: {
			g.drawImage(Magma, 0, 28, this);
			g.drawImage(Monster, xMon, yMon, this);
			g.drawImage(Player, x, y, this);
			repaint();
			navigate();
			if (monsterCollide(this.x, this.y)) {
				FightManager.getInstance().Start(null);
				x = 450;
				y = 250;
				xMon = 275;
				yMon = 225;
			}
			break;
		}
		default: {
			// g.drawImage(Stone, 0, 0, this);
			// g.drawImage(Monster, xMon, yMon, this);
			// g.drawImage(Player, x, y, this);
			// repaint();
			// if (monsterCollide(this.x, this.y)) {
			// FightManager.getInstance().Start(null);
			// }
			// break;
		}
		}
	}

	private void init() {
		running = true;

		ImageIcon i0 = new ImageIcon("resource/Town.png");
		Town = i0.getImage();
		ImageIcon i1 = new ImageIcon("resource/Player.png");
		Player = i1.getImage();
		ImageIcon i2 = new ImageIcon("resource/Monster.png");
		Monster = i2.getImage();
		ImageIcon i3 = new ImageIcon("resource/Stone.png");
		Stone = i3.getImage();
		ImageIcon i4 = new ImageIcon("resource/Cemetery.png");
		Cemetery = i4.getImage();
		ImageIcon i5 = new ImageIcon("resource/Sky.png");
		Sky = i5.getImage();
		ImageIcon i6 = new ImageIcon("resource/Desert.png");
		Desert = i6.getImage();
		ImageIcon i7 = new ImageIcon("resource/Magma.png");
		Magma = i7.getImage();

	}

}
