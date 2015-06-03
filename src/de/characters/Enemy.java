package de.characters;

import java.util.ArrayList;
import java.util.Random;

import de.item.Item;
import de.manager.ItemFactory;
import de.skills.ActiveSkill;
import de.skills.Skill;

public class Enemy extends Characters 
{
	int exp;
	int gold;
	
	ArrayList<Item> dropItems;  
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public Item getDropItemRandomly()
	{
		Random random = new Random();
		int ri = random.nextInt(dropItems.size());
		return dropItems.get(ri);
	}

	
	public Enemy(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP, int exp, int gold)
	{
		super(name, hp, mp, meleeAP, rangedAP, magicAP,
				meleeGP, rangedGP, magicGP);
		this.exp = exp;
		this.gold = gold;
		dropItems = new ArrayList<Item>();
	}
	
	public Enemy(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP, int exp, int gold , Object... additional) {
		super(name, hp, mp, meleeAP, rangedAP, magicAP,
				meleeGP, rangedGP, magicGP);
		this.exp = exp;
		this.gold = gold;
		dropItems = new ArrayList<Item>();
		for(int i=0;i<additional.length;i++)
		{
			if(additional[i] instanceof Skill)
				AddSkill((Skill)additional[i]);
			if(additional[i] instanceof String)
				dropItems.add(ItemFactory.getInstance().getItem((String) additional[i]));
		}
		
	}
	
	
	//���� or ��ų �����ϰ�
	public void RandomAction(Characters player) 
	{
		Random random = new Random();
		
		//������ Ȯ���� ��ų ����� �õ��Ѵ�.
		if(random.nextBoolean() && skillList.size()>0)
		{
			int skillRNG = random.nextInt(skillList.size());
			//������ ������ ��Ƽ�� ��ų�̸� ��ų�� ����ϰ� �޼ҵ带 Ż���Ѵ�.
			if(skillList.get(skillRNG) instanceof ActiveSkill)
			{
				skillList.get(skillRNG).useSkill(this,player);
				return;
			}
		}
		
		//��ų��뿡 �����߰ų� ��ų�� ���ų� ��·�ų� ��·�ų� �ƹ��͵� �������� �Ϲݰ����� �Ѵ�.
		Attack(player);
		
	}
	
	
	
	public Enemy clone()
	{
		Enemy instance = new Enemy(name,hp,mp,meleeAP,rangedAP,magicAP,meleeGP,rangedGP,magicGP,exp,gold);
		for ( Skill skill : skillList) {
			instance.AddSkill(skill);
		}
		for ( Item item : dropItems)
		{
			instance.dropItems.add(item);
		}
		return instance;
	}
}
