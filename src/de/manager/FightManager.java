package de.manager;

import java.util.Random;

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
	
	String[] normalMonsters = 
		{
			"≥≠¿Ô¿Ã",
			"ø¿≈©",
			"≥≠¿Ô¿Ã¿¸ªÁ",
			"ø¿≈©¿¸ªÁ",
			"«ÿ∞Ò√¢∫¥",
			"«ÿ∞Ò∞ÀªÁ",
			"«ÿ∞Ò±√ºˆ",
			"µπ∞Ò∑Ω",
			"∆Æ∑—",
			"«ÿ∞Ò∞À≈ıªÁ",
			"«ÿ∞Ò±Ÿ¿ß∫¥",
			"ø¿øÏ∞≈"
		};
	
	
	public void Start( String enemyName)
	{
		if(enemyName==null || enemyName.length()<1)
			this.enemy = EnemyFactory.getInstance().getEnemy(this.enemy.getName());
		
		if(enemyName=="∑£¥˝∏˜")
		{
			Random random = new Random();
			this.enemy = EnemyFactory.getInstance().getEnemy(normalMonsters[random.nextInt(normalMonsters.length)]);
		}
		else
		{
			this.enemy = EnemyFactory.getInstance().getEnemy(enemyName);
		}
		
		
		
		
		WindowManager.getInstance().Hide(WindowManager.WindowID.MAP);
		WindowManager.getInstance().Show(WindowManager.WindowID.FIGHT);
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).Start();
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).refresh();
		
		
		playerManager.getPlayer().Start();
		enemy.Start();
	}
	
	public Characters getEnemy()
	{
		return enemy;
	}
	
	public Characters getPlayer()
	{
		return playerManager.getPlayer();
	}
	
	public void UseSkill(FightWindow fightWindow, int index)
	{
		playerManager.getPlayer().getSkillList().get(index).useSkill(playerManager.getPlayer(), enemy);
		
		Update(fightWindow);
	}
	
	public void BasicAttack(FightWindow fightWindow)
	{ 
		playerManager.getPlayer().Attack(enemy);
		
		Update(fightWindow);
	}
	
	public void Update(FightWindow fightWindow)
	{
		((Enemy) enemy).RandomAction(playerManager.getPlayer());
		enemy.Update();
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
