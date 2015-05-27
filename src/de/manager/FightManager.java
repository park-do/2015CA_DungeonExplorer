package de.manager;

import de.characters.Characters;
import de.windows.FightWindow;
import de.windows.MapWindow;

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
		enemy = EnemyFactory.getInstance().getEnemy("≥≠¿Ô¿Ã");
		playerManager = PlayerManager.getInstance();
	}
	
	Characters enemy;
	PlayerManager playerManager;
	
	
	public void Start( Characters enemy)
	{
		if(enemy!=null)
			this.enemy = enemy;
		else
			this.enemy = EnemyFactory.getInstance().getEnemy(this.enemy.getName());
		
		WindowManager.getInstance().Hide(WindowManager.WindowID.MAP);
		WindowManager.getInstance().Show(WindowManager.WindowID.FIGHT);
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).Start();
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).refresh();
	}
	
	public Characters getEnemy()
	{
		return enemy;
	}
	
	public Characters getPlayer()
	{
		return playerManager.getPlayer();
	}
	
	public void Finish()
	{
		WindowManager.getInstance().Hide(WindowManager.WindowID.FIGHT);
		WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
		//((MapWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.MAP)).Win();
	}
	
}
