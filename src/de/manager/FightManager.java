package de.manager;

import java.util.Random;

import javax.swing.JOptionPane;

import de.characters.Characters;
import de.characters.Enemy;
import de.characters.Player;
import de.item.Item;
import de.skills.Skill;
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
	
	Enemy enemy;
	PlayerManager playerManager;
	
	String[] normalMonsters = 
		{
			"≥≠¿Ô¿Ã",
			"ø¿≈©",
			"≥≠¿Ô¿Ã¡∑ ¿¸ªÁ",
			"ø¿≈© ¿¸ªÁ",
			"«ÿ∞Ò √¢∫¥",
			"«ÿ∞Ò",
			"«ÿ∞Ò ±√ºˆ",
			"µπ∞Ò∑Ω",
			"∆Æ∑—",
			"∞≈¥Î «ÿ∞Ò µπ∞›∫¥",
			"«ÿ∞Ò ±Ÿ¿ß∫¥",
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
	
	public boolean UseSkill(FightWindow fightWindow, int index)
	{
		Skill skill = playerManager.getPlayer().getSkillList().get(index);
		if(skill.getMP() <= getPlayer().getNowMp())
		{
			getPlayer().useMP(skill.getMP());
			getPlayer().getSkillList().get(index).useSkill(playerManager.getPlayer(), enemy);
			Update(fightWindow);
			return true;
		}
		else
		{
			
			return false;
		}
		
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
	
	public void Finish(FightWindow fightWindow, boolean win)
	{
		Player player = playerManager.getPlayer();
		Item item = null;
		int gold = 0;
		int exp = 0;
		if(win)
		{
			gold = enemy.getGold();
			player.earnGold(gold);
			item = enemy.getDropItemRandomly();
			player.gainItem(item);
			int level = player.getLevel();
			exp = enemy.getExp();
			player.gainExp(exp);
			
			
			JOptionPane.showConfirmDialog(fightWindow, "¿¸≈ı Ω¬∏Æ!\n"+(level<player.getLevel()?"∑π∫ß æ˜!!\n":"")+(gold>0?gold+"∞ÒµÂ »πµÊ!\n":"")+(item!=null?item.getName() + "»πµÊ!":""), "¿¸≈ı Ω¬∏Æ", JOptionPane.CLOSED_OPTION);
			
			player.End();
			enemy.End();
			WindowManager.getInstance().Hide(WindowManager.WindowID.FIGHT);
			WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
		}
		else
		{
			player.spendGold(player.getGold()/2);
			
			JOptionPane.showConfirmDialog(fightWindow, "∆–πË.. ∞ÒµÂ¿« ¿˝π›¿ª ¿“æ˙Ω¿¥œ¥Ÿ.","¿¸≈ı ∆–πË", JOptionPane.CLOSED_OPTION);
			
			player.End();
			enemy.End();
			WindowManager.getInstance().Hide(WindowManager.WindowID.FIGHT);
			WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
			((MapWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.MAP)).where = 0;
		}
		
		
		
		
		
		
		//((MapWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.MAP)).Win();
	}
	
	public void Dodge(FightWindow fightWindow)
	{
		Player player = playerManager.getPlayer();
		player.spendGold(player.getGold()/3);
		
		JOptionPane.showConfirmDialog(fightWindow, "µµ∏¡ƒ°¥Ÿ∞° ∞ÒµÂ¿« 1/3¿ª »Í∑»Ω¿¥œ¥Ÿ.","¿¸≈ıø°º≠ µµ∏¡ƒß!", JOptionPane.CLOSED_OPTION);
		
		player.End();
		enemy.End();
		WindowManager.getInstance().Hide(WindowManager.WindowID.FIGHT);
		WindowManager.getInstance().Show(WindowManager.WindowID.MAP);
		((MapWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.MAP)).where = 0;
	}
}
