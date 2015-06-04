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
				500, 500, //�ʱ� HP, MP  
				0, 0, 70, //�ʱ� ���ݷ� (�ٰŸ�, ���Ÿ�, ����)
				5, 0, 20, //�ʱ� ���� (�ٰŸ�, ���Ÿ�, ����)
				50, 50, //���� HP, MP
				0, 0, 7, //���ݷ� ����ġ (�ٰŸ�, ���Ÿ�, ����)
				1, 1, 3); //���� ����ġ (�ٰŸ�, ������, ����)
		
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
