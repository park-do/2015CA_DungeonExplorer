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
			//무기: 이름, 착용직업, 가격, 근공, 원공, 마공
			new Weapon("진명황의 집행검", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("드래곤 슬레이어", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("피의 분노", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("대검", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("데스나이트의 검", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("어둠의 칼날", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("영웅의 장검", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("뇌신검", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("은장검", ClassType.Knight, 0, 0, 0, 0),
			
			new Weapon("", ClassType.Warrior, 0, 0, 0, 0),
			
			
			
			
			new Weapon("검2", ClassType.All, 0, 20, 0, 0)
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
