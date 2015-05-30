package de.manager;

import java.util.Hashtable;

import de.characters.Enemy;
import de.item.Armor;
import de.item.Armor.EquipType;
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
			//����: "�̸�", ��������, ����, �ٰ�, ����, ����
			new Weapon("����Ȳ�� �����", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("�巡�� �����̾�", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("���� �г�", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("���", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("��������Ʈ�� ��", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("����� Į��", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("������ ���", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("���Ű�", ClassType.Knight, 0, 0, 0, 0),
			new Weapon("�����", ClassType.Knight, 0, 0, 0, 0),
			
			new Weapon("�丣�� ��ħ", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("������� ����", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("���� �׽�", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("���� ����", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("���� ������ â", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("ũ���� ����", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("��ƾ�� ���", ClassType.Warrior, 0, 0, 0, 0),
			new Weapon("��â", ClassType.Warrior, 0, 0, 0, 0),
			
			new Weapon("������ �ٶ�", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("������ Į��", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("�ǿ��� �ܰ�", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("�̽��� �ܰ�", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("�Ǹ��� ���", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("�ı��� ���", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("���� ����", ClassType.Elf, 0, 0, 0, 0),
			new Weapon("������ Ȱ", ClassType.Elf, 0, 0, 0, 0),
			
			new Weapon("���� ����ü ������", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("Ÿ�뽺�� ������", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("��ũ�θǼ��� ������", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("�������� ������", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("�븶������ ����", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("Ÿ���� ����", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("�Ҳ��� ����", ClassType.Magician, 0, 0, 0, 0),
			new Weapon("���� ����", ClassType.Magician, 0, 0, 0, 0),
			
			//����: "�̸�", ��������, �������, ����, �ٹ�, ����, ����
			new Armor("��ö ����", ClassType.Warrior, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("���ְ� ����", ClassType.Warrior, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("����� ����", ClassType.Warrior, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("����Ȳ�� �鰩", ClassType.Knight, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("����� �鰩", ClassType.Knight, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Knight, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("������ �ູ", ClassType.Elf, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Elf, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("�׸��� ����", ClassType.Elf, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("�븶���� ����", ClassType.Magician, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("�渶���� ����", ClassType.Magician, EquipType.Helmet, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Magician, EquipType.Helmet, 0, 0, 0, 0),
			
			new Armor("�巹��ũ�� ��ȣ", ClassType.Warrior, EquipType.Chest, 0, 0, 0, 0),
			new Armor("��� �Ǳ� ����", ClassType.Warrior, EquipType.Chest, 0, 0, 0, 0),
			new Armor("��ö ����", ClassType.Warrior, EquipType.Chest, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Knight, EquipType.Chest, 0, 0, 0, 0),
			new Armor("��ũ���� �罽 ����", ClassType.Knight, EquipType.Chest, 0, 0, 0, 0),
			new Armor("���� ����", ClassType.Knight, EquipType.Chest, 0, 0, 0, 0),
			new Armor("����ƽ��� ��ȣ", ClassType.Elf, EquipType.Chest, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Elf, EquipType.Chest, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Elf, EquipType.Chest, 0, 0, 0, 0),
			new Armor("Ÿ�� �κ�", ClassType.Magician, EquipType.Chest, 0, 0, 0, 0),
			new Armor("����� �κ�", ClassType.Magician, EquipType.Chest, 0, 0, 0, 0),
			new Armor("���� �κ�", ClassType.Magician, EquipType.Chest, 0, 0, 0, 0),
			
			new Armor("����� ����", ClassType.Warrior, EquipType.Globe, 0, 0, 0, 0),
			new Armor("�Ŀ� �۷���", ClassType.Warrior, EquipType.Globe, 0, 0, 0, 0),
			new Armor("���尩", ClassType.Knight, EquipType.Globe, 0, 0, 0, 0),
			new Armor("��ũ�� �尩", ClassType.Knight, EquipType.Globe, 0, 0, 0, 0),
			new Armor("ȥ���� ����", ClassType.Elf, EquipType.Globe, 0, 0, 0, 0),
			new Armor("���ݼ��� �尩", ClassType.Elf, EquipType.Globe, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Magician, EquipType.Globe, 0, 0, 0, 0),
			new Armor("����� �ձ�", ClassType.Magician, EquipType.Globe, 0, 0, 0, 0),
			
			new Armor("���������� ������", ClassType.Warrior, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("Ʈ���� �Ź�", ClassType.Warrior, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Knight, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("���� ����", ClassType.Knight, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("ǳ�ɿ��� �ż�", ClassType.Elf, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("������ �Ź�", ClassType.Elf, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("�õ��� ���ڱ�", ClassType.Magician, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("��ũ�� ����", ClassType.Magician, EquipType.Shoes, 0, 0, 0, 0),
			
			new Armor("�ݿ����� ����", ClassType.Knight, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("�ݻ� ����", ClassType.Knight, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("����� ����", ClassType.Elf, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("������ ����", ClassType.Elf, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("Ÿ�뽺�� �ɾ�", ClassType.Magician, EquipType.Shoes, 0, 0, 0, 0),
			new Armor("���¼�", ClassType.Magician, EquipType.Shoes, 0, 0, 0, 0),			
						
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
