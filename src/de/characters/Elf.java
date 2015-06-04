package de.characters;

import de.item.Item.ClassType;
import de.skills.Skill_CON;
import de.skills.Skill_ST;


public class Elf extends Player {

	
	public Elf(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				700, 350, //초기 HP, MP  
				0, 60, 0, //초기 공격력 (근거리, 원거리, 마법)
				5, 15, 10, //초기 방어력 (근거리, 원거리, 마법)
				70, 35, //성장 HP, MP
				0, 6, 0, //공격력 성장치 (근거리, 원거리, 마법)
				1, 2, 2); //방어력 성장치 (근거리, 원가리, 마법)
		
		classType = ClassType.Elf;
	}
	
	protected void levelUp()
	{
		super.levelUp();
		if(getLevel()==10)
		{
			skillList.add(new Skill_ST());
		}
		if(getLevel()==30)
		{
			skillList.add(new Skill_CON());
		}
	}

}
