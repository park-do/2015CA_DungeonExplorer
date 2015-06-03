package de.manager;

import de.characters.Characters;
import de.characters.Enemy;
import de.characters.Player;
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
		enemy = EnemyFactory.getInstance().getEnemy("≥≠¿Ô¿Ã");
		playerManager = PlayerManager.getInstance();
	}
	
	Enemy enemy;
	PlayerManager playerManager;
	
	
	public void Start( Characters enemy)
	{
		if(enemy!=null)
			this.enemy = (Enemy)enemy;
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
	
	public void BasicAttack(FightWindow fightWindow)
	{ 
		playerManager.getPlayer().Attack(enemy);
		((Enemy) enemy).RandomAction(playerManager.getPlayer());
		playerManager.getPlayer().Update();
		enemy.Update();
		Update(fightWindow);
	}
	
	//ΩŒøÚ Ω√¿€!
	public void Start(FightWindow fightWindow)
	{
		enemy.Start();
		playerManager.getPlayer().Start();
	}
	
	public void Update(FightWindow fightWindow)
	{
		((Enemy) enemy).RandomAction(playerManager.getPlayer());
		playerManager.getPlayer().Update();
		enemy.Update();
		fightWindow.refresh();
	}
	
	public void Finish(boolean win)
	{
		Player player = playerManager.getPlayer();
		if(win)
		{
			player.earnGold(enemy.getGold());
			player.gainItem(enemy.getDropItemRandomly());
		}
		
		player.End();
		enemy.End();
		WindowManager.getInstance().Hide(WindowManager.WindowID.FIGHT);
		WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
		//((MapWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.MAP)).Win();
	}
	
}
