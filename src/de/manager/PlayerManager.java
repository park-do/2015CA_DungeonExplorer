package de.manager;

import de.characters.Knight;
import de.characters.Player;

public class PlayerManager {
	
	static PlayerManager instance;
	
	public static PlayerManager getInstance()
	{
		if(instance==null)
		{
			instance = new PlayerManager();
		}
		return instance;
	}
	
	PlayerManager()
	{
		
	}
	
	Player player;
	
	public void Init(int selectClass, String name)
	{
		switch(selectClass)
		{
		case 0:
			player = new Knight(name);
		}
	}
	
	public Player getPlayer()
	{
		return player;
	}
}
