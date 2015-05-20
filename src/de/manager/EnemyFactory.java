package de.manager;

import java.util.Hashtable;

import de.classes.Enemy;

public class EnemyFactory {
	private static EnemyFactory instance;
	
	public static EnemyFactory getInstance()
	{
		if(instance==null)
		{
			instance = new EnemyFactory();
		}
		return instance;
	}
	
	Hashtable<String,Enemy> enemyMap;
	
	private EnemyFactory()
	{
		Init();
	}
	
	private void Init()
	{
		enemyMap = new Hashtable<String, Enemy>();
		Enemy[] enemies = {
			new Enemy("Orc", 80, 10, 2, 10, 10)
		};
		
		for (Enemy enemy : enemies) 
		{
			enemyMap.put(enemy.getName(), enemy);
		}
	}
	
	public Enemy getEnemy(String name)
	{
		return enemyMap.get(name).clone();
	}
}
