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
	
	
	//공격 or 스킬 랜덤하게
	public void RandomAction(Characters player) 
	{
		Random random = new Random();
		
		//절반의 확률로 스킬 사용을 시도한다.
		if(random.nextBoolean() && skillList.size()>0)
		{
			int skillRNG = random.nextInt(skillList.size());
			//난수를 생성해 액티브 스킬이면 스킬을 사용하고 메소드를 탈출한다.
			if(skillList.get(skillRNG) instanceof ActiveSkill)
			{
				skillList.get(skillRNG).useSkill(this,player);
				return;
			}
		}
		
		//스킬사용에 실패했거나 스킬이 없거나 어쨌거나 저쨌거나 아무것도 못했으면 일반공격을 한다.
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
