package de.manager;

import de.classes.Characters;
import de.windows.FightWindow;

public class FightManager 
{
	static FightManager instance;
	
	public static FightManager getInstance()
	{
		if(instance==null)
		{
			instance = new FightManager();
		}
		return instance;
	}
	
	FightManager()
	{
		enemy = new Characters("Orc", 80, 10, 2);
		player = new Characters("Player", 100, 12, 3);
	}
	
	Characters enemy;
	Characters player;
	
	
	public void Start( Characters enemy)
	{
		if(enemy!=null)
			this.enemy = enemy;
		
		WindowManager.getInstance().Hide(WindowManager.WindowID.MAP);
		WindowManager.getInstance().Show(WindowManager.WindowID.FIGHT);
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).refresh();
	}
	
	public Characters getEnemy()
	{
		return enemy;
	}
	
	public Characters getPlayer()
	{
		return player;
	}
	
}
