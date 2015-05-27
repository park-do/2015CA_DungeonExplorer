package de.manager;

import de.characters.Characters;
import de.characters.Knight;
import de.characters.Player;

public class PlayerManager {

	static PlayerManager instance;

	public static PlayerManager getInstance() {
		if (instance == null) {
			instance = new PlayerManager();
		}
		return instance;
	}

	PlayerManager() {

	}

	Player player;

	public void Init(int selectClass, String name) {
		switch (selectClass) {
		case 0:
			player = new Knight(name);
		}
		
		player.bringItem.add(ItemFactory.getInstance().getItem("°Ë1"));
		player.bringItem.get(0).useItem(player);
	}

	public Player getPlayer() {
		return player;
	}

	public void Start(Object object) {
		WindowManager.getInstance().Hide(WindowManager.WindowID.MAP);
		WindowManager.getInstance().Show(WindowManager.WindowID.STATUS);
		
	}

	public void Finish() {
		WindowManager.getInstance().Hide(WindowManager.WindowID.STATUS);
		WindowManager.getInstance().Show(WindowManager.WindowID.MAP);

	}

}
