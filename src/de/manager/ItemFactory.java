package de.manager;

import java.util.Hashtable;

import de.characters.Enemy;
import de.item.Item;
import de.item.Weapon;
import de.item.Item.ClassType;
import de.skills.Skill_AG;
import de.skills.Skill_AV;
import de.skills.Skill_BW;
import de.skills.Skill_CB;
import de.skills.Skill_CL;
import de.skills.Skill_CON;
import de.skills.Skill_CT;
import de.skills.Skill_IV;
import de.skills.Skill_SB;
import de.skills.Skill_ST;

public class ItemFactory {
	private static ItemFactory instance;
	
	public static ItemFactory getInstance()
	{
		if(instance==null)
		{
			instance = new ItemFactory();
		}
		return instance;
	}
	
	Hashtable<String,Item> itemMap;
	
	private ItemFactory()
	{
		Init();
	}
	
	private void Init()
	{
		itemMap = new Hashtable<String, Item>();
		Item[] items = {
			new Weapon("°Ë1", ClassType.All, 0, 10, 0, 0),
			new Weapon("°Ë2", ClassType.All, 0, 20, 0, 0)
		};
		
		for (Item item : items) 
		{
			itemMap.put(item.getName(), item);
		}
	}
	
	public Item getItem(String str)
	{
		return itemMap.get(str);
	}
}
