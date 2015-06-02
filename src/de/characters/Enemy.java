package de.characters;

import de.item.Item;
import de.skills.Skill;

public class Enemy extends Characters 
{
	int exp;
	int gold;
	
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

	
	public Enemy(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP, int exp, int gold)
	{
		super(name, hp, mp, meleeAP, rangedAP, magicAP,
				meleeGP, rangedGP, magicGP);
		this.exp = exp;
		this.gold = gold;
	}
	
	public Enemy(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP, int exp, int gold , Object... additional) {
		super(name, hp, mp, meleeAP, rangedAP, magicAP,
				meleeGP, rangedGP, magicGP);
		this.exp = exp;
		this.gold = gold;
		for(int i=0;i<additional.length;i++)
		{
			if(additional[i] instanceof Skill)
				AddSkill((Skill)additional[i]);
			
		}
	}
	
	public Enemy clone()
	{
		Enemy instance = new Enemy(name,hp,mp,meleeAP,rangedAP,magicAP,meleeGP,rangedGP,magicGP,exp,gold);
		for ( Skill skill : skillList) {
			instance.AddSkill(skill);
		} 
		return instance;
	}
}
