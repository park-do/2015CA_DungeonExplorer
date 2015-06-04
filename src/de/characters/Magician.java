package de.characters;

import de.item.Item.ClassType;
import de.skills.Skill_AV;
import de.skills.Skill_CL;
import de.skills.Skill_CT;
import de.skills.Skill_SB;


public class Magician extends Player {

	
	public Magician(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				500, 500, //초기 HP, MP  
				0, 0, 70, //초기 공격력 (근거리, 원거리, 마법)
				5, 0, 20, //초기 방어력 (근거리, 원거리, 마법)
				50, 50, //성장 HP, MP
				0, 0, 7, //공격력 성장치 (근거리, 원거리, 마법)
				1, 1, 3); //방어력 성장치 (근거리, 원가리, 마법)
		
		classType = ClassType.Magician;
	}
	
	protected void levelUp()
	{
		super.levelUp();
		if(getLevel()==10)
		{
			skillList.add(new Skill_CT());
		}
		if(getLevel()==15)
		{
			skillList.add(new Skill_CL());
		}
		if(getLevel()==20)
		{
			skillList.add(new Skill_SB());
		}
		if(getLevel()==30)
		{
			skillList.add(new Skill_AV());
		}
	}

}
