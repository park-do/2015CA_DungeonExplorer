package de.characters;

import de.item.Item.ClassType;
import de.skills.Skill_BW;


public class Knight extends Player {

	
	public Knight(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				800, 200, //초기 HP, MP  
				30, 0, 0, //초기 공격력 (근거리, 원거리, 마법)
				10, 5, 5, //초기 방어력 (근거리, 원거리, 마법)
				80, 20, //성장 HP, MP
				3, 0, 0, //공격력 성장치 (근거리, 원거리, 마법)
				2, 1, 1); //방어력 성장치 (근거리, 원가리, 마법)
		
		classType = ClassType.Knight;
		
		skillList.add(new Skill_BW());
	}

	
	@Override
	protected void levelUp() {
		super.levelUp();
		if(getLevel()==10)
		{
			skillList.add(new Skill_BW());
		}
	}
}
