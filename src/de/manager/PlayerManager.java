package de.manager;

import de.characters.Elf;
import de.characters.Knight;
import de.characters.Magician;
import de.characters.Player;
import de.characters.Warrior;
import de.manager.WindowManager.WindowID;
import de.windows.InventoryWindowT;

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
			break;
		case 1:
			player = new Warrior(name);
			break;
		case 2:
			player = new Elf(name);
			break;
		case 3:
			player = new Magician(name);
			break;
		}
	}

	public Player getPlayer() {
		return player;
	}

	public void Start(Object object) {
		((InventoryWindowT)WindowManager.getInstance().getFrame(WindowID.STATUS)).RefreshButtons();
		WindowManager.getInstance().Hide(WindowManager.WindowID.MAP);
		WindowManager.getInstance().Show(WindowManager.WindowID.STATUS);
		
	}

	public void Finish() {
		WindowManager.getInstance().Hide(WindowManager.WindowID.STATUS);
		WindowManager.getInstance().Show(WindowManager.WindowID.MAP);

	}

}
