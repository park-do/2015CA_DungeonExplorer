package de.manager;

import java.util.ArrayList;
import java.util.Hashtable;

import de.item.Armor;
import de.item.Armor.EquipType;
import de.item.Item;
import de.item.Item.ClassType;
import de.item.Weapon;

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
	
	public String[] getBuyItems()
	{
		ClassType classType = PlayerManager.getInstance().getPlayer().getClassType();
		ArrayList<String> items = new ArrayList<String>();
		String[] keys = (String[]) itemMap.keySet().toArray(new String[itemMap.size()]);
		for(int i=0;i<keys.length;i++)
		{
			Item item = itemMap.get(keys[i]);
			if(item.getClassType()==ClassType.All || item.getClassType() == classType)items.add(itemMap.get(keys[i]).getName());
			
		}
		return items.toArray(new String[items.size()]);
	}
	
	public String[] getSellItems() 
	{
		ArrayList<String> items = new ArrayList<String>();
		Item[] playerItems = PlayerManager.getInstance().getPlayer().bringItem.toArray(new Item[PlayerManager.getInstance().getPlayer().bringItem.size()]);
		for(int i=0;i<playerItems.length;i++)
		{
			items.add(playerItems[i].getName());
		}
		return items.toArray(new String[items.size()]);
	}
	
	private void Init()
	{
		itemMap = new Hashtable<String, Item>();
		Item[] items = {
			//����: "�̸�", ��������, ����, �ٰ�, ����, ����
			new Weapon("����Ȳ�� �����", ClassType.Knight, 50000, 200, 0, 0),
			new Weapon("�巡�� �����̾�", ClassType.Knight, 20000, 150, 0, 0),
			new Weapon("���� �г�", ClassType.Knight, 5000, 80, 0, 0),
			new Weapon("���", ClassType.Knight, 500, 20, 0, 0),
			new Weapon("��������Ʈ�� ��", ClassType.Knight, 50000, 150, 0, 0),
			new Weapon("����� Į��", ClassType.Knight, 20000, 120, 0, 0),
			new Weapon("������ ���", ClassType.Knight, 5000, 100, 0, 0),
			new Weapon("���Ű�", ClassType.Knight, 2000, 50, 0, 0),
			new Weapon("�����", ClassType.Knight, 500, 10, 0, 0),
			
			new Weapon("�丣�� ��ħ", ClassType.Warrior, 50000, 200, 0, 0),
			new Weapon("������� ����", ClassType.Warrior, 20000, 160, 0, 0),
			new Weapon("���� �׽�", ClassType.Warrior, 5000, 80, 0, 0),
			new Weapon("���� ����", ClassType.Warrior, 500, 40, 0, 0),
			new Weapon("���� ������ â", ClassType.Warrior, 50000, 200, 0, 0),
			new Weapon("ũ���� ����", ClassType.Warrior, 20000, 120, 0, 0),
			new Weapon("��ƾ�� ���", ClassType.Warrior, 5000, 70, 0, 0),
			new Weapon("��â", ClassType.Warrior, 500, 30, 0, 0),
			
			new Weapon("������ �ٶ�", ClassType.Elf, 50000, 0, 250, 0),
			new Weapon("������ Į��", ClassType.Elf, 20000, 0, 200, 0),
			new Weapon("�ǿ��� �ܰ�", ClassType.Elf, 5000, 0, 100, 0),
			new Weapon("�̽��� �ܰ�", ClassType.Elf, 500, 0, 50, 0),
			new Weapon("�Ǹ��� ���", ClassType.Elf, 50000, 0, 250, 0),
			new Weapon("�ı��� ���", ClassType.Elf, 20000, 0, 150, 0),
			new Weapon("���� ����", ClassType.Elf, 5000, 0, 100, 0),
			new Weapon("������ Ȱ", ClassType.Elf, 500, 0, 50, 0),
			
			new Weapon("���� ����ü ������", ClassType.Magician, 50000, 0, 0, 300),
			new Weapon("����� ������", ClassType.Magician, 20000, 0, 0, 220),
			new Weapon("��ũ�θǼ��� ������", ClassType.Magician, 5000, 0, 0, 150),
			new Weapon("�������� ������", ClassType.Magician, 500, 0, 0, 70),
			new Weapon("�븶������ ����", ClassType.Magician, 50000, 0, 0, 300),
			new Weapon("Ÿ���� ����", ClassType.Magician, 20000, 0, 0, 230),
			new Weapon("�Ҳ��� ����", ClassType.Magician, 5000, 0, 0, 150),
			new Weapon("���� ����", ClassType.Magician, 500, 0, 0, 60),
			
			//����: "�̸�", ��������, �������, ����, �ٹ�, ����, ����
			new Armor("��ö ����", ClassType.Warrior, EquipType.Helmet, 10000, 30, 10, 5),
			new Armor("���ְ� ����", ClassType.Warrior, EquipType.Helmet, 3000, 20, 7, 3),
			new Armor("����� ����", ClassType.Warrior, EquipType.Helmet, 300, 10, 3, 1),
			new Armor("����Ȳ�� �鰩", ClassType.Knight, EquipType.Helmet, 10000, 20, 10, 10),
			new Armor("����� �鰩", ClassType.Knight, EquipType.Helmet, 3000, 10, 7, 7),
			new Armor("������ ����", ClassType.Knight, EquipType.Helmet, 300, 5, 3, 3),
			new Armor("������ �ູ", ClassType.Elf, EquipType.Helmet, 10000, 10, 20, 20),
			new Armor("������ ����", ClassType.Elf, EquipType.Helmet, 3000, 7, 10, 10),
			new Armor("�׸��� ����", ClassType.Elf, EquipType.Helmet, 300, 3, 5, 5),
			new Armor("�븶���� ����", ClassType.Magician, EquipType.Helmet, 10000, 10, 10, 30),
			new Armor("�渶���� ����", ClassType.Magician, EquipType.Helmet, 3000, 7, 7, 20),
			new Armor("������ ����", ClassType.Magician, EquipType.Helmet, 300, 3, 3, 10),
			
			new Armor("�巹��ũ�� ��ȣ", ClassType.Warrior, EquipType.Chest, 10000, 30, 10, 5),
			new Armor("��� �Ǳ� ����", ClassType.Warrior, EquipType.Chest, 3000, 20, 7, 3),
			new Armor("��ö ����", ClassType.Warrior, EquipType.Chest, 300, 10, 3, 1),
			new Armor("������ ����", ClassType.Knight, EquipType.Chest, 10000, 20, 10, 10),
			new Armor("��ũ���� �罽 ����", ClassType.Knight, EquipType.Chest, 3000, 10, 7, 7),
			new Armor("���� ����", ClassType.Knight, EquipType.Chest, 300, 5, 3, 3),
			new Armor("����ƽ��� ��ȣ", ClassType.Elf, EquipType.Chest, 10000, 10, 20, 20),
			new Armor("������ ����", ClassType.Elf, EquipType.Chest, 3000, 7, 10, 10),
			new Armor("������ ����", ClassType.Elf, EquipType.Chest, 300, 3, 5, 5),
			new Armor("Ÿ�� �κ�", ClassType.Magician, EquipType.Chest, 10000, 10, 10, 30),
			new Armor("����� �κ�", ClassType.Magician, EquipType.Chest, 3000, 7, 7, 20),
			new Armor("���� �κ�", ClassType.Magician, EquipType.Chest, 300, 3, 3, 10),
			
			new Armor("����� ����", ClassType.Warrior, EquipType.Globe, 5000, 30, 10, 5),
			new Armor("�Ŀ� �۷���", ClassType.Warrior, EquipType.Globe, 1000, 20, 7, 3),
			new Armor("���尩", ClassType.Knight, EquipType.Globe, 5000, 20, 10, 10),
			new Armor("��ũ�� �尩", ClassType.Knight, EquipType.Globe, 1000, 10, 7, 7),
			new Armor("ȥ���� ����", ClassType.Elf, EquipType.Globe, 5000, 10, 20, 20),
			new Armor("���ݼ��� �尩", ClassType.Elf, EquipType.Globe, 1000, 7, 10, 10),
			new Armor("������ ����", ClassType.Magician, EquipType.Globe, 5000, 10, 10, 30),
			new Armor("����� �ձ�", ClassType.Magician, EquipType.Globe, 1000, 7, 7, 20),
			
			new Armor("���������� ������", ClassType.Warrior, EquipType.Shoes, 5000, 30, 10, 5),
			new Armor("Ʈ���� �Ź�", ClassType.Warrior, EquipType.Shoes, 1000, 20, 7, 3),
			new Armor("������ ����", ClassType.Knight, EquipType.Shoes, 5000, 20, 10, 10),
			new Armor("���� ����", ClassType.Knight, EquipType.Shoes, 1000, 10, 7, 7),
			new Armor("ǳ���� �ż�", ClassType.Elf, EquipType.Shoes, 5000, 10, 20, 20),
			new Armor("������ �Ź�", ClassType.Elf, EquipType.Shoes, 1000, 7, 10, 10),
			new Armor("�õ��� ���ڱ�", ClassType.Magician, EquipType.Shoes, 5000, 10, 10, 30),
			new Armor("��ũ�� ����", ClassType.Magician, EquipType.Shoes, 1000, 7, 7, 20),
			
			new Armor("�ݿ����� ����", ClassType.Knight, EquipType.Shoes, 3000, 20, 10, 10),
			new Armor("�ݻ� ����", ClassType.Knight, EquipType.Shoes, 1000, 10, 7, 7),
			new Armor("����� ����", ClassType.Elf, EquipType.Shoes, 3000, 10, 20, 20),
			new Armor("������ ����", ClassType.Elf, EquipType.Shoes, 1000, 7, 10, 10),
			new Armor("����� �ɾ�", ClassType.Magician, EquipType.Shoes, 3000, 10, 10, 30),
			new Armor("���¼�", ClassType.Magician, EquipType.Shoes, 1000, 7, 7, 20),			
						
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
