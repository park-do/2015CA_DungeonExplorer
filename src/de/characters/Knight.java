package de.characters;

import de.item.Item.ClassType;
import de.skills.Skill_BW;


public class Knight extends Player {

	
	public Knight(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				800, 200, //�ʱ� HP, MP  
				30, 0, 0, //�ʱ� ���ݷ� (�ٰŸ�, ���Ÿ�, ����)
				10, 5, 5, //�ʱ� ���� (�ٰŸ�, ���Ÿ�, ����)
				80, 20, //���� HP, MP
				3, 0, 0, //���ݷ� ����ġ (�ٰŸ�, ���Ÿ�, ����)
				2, 1, 1); //���� ����ġ (�ٰŸ�, ������, ����)
		
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
