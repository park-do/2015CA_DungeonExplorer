package de.characters;

import de.item.Item.ClassType;
import de.skills.Skill_AG;
import de.skills.Skill_AV;


public class Warrior extends Player {

	
	public Warrior(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				1100, 0, //�ʱ� HP, MP  
				50, 0, 0, //�ʱ� ���ݷ� (�ٰŸ�, ���Ÿ�, ����)
				15, 5, 0, //�ʱ� ���� (�ٰŸ�, ���Ÿ�, ����)
				110, 0, //���� HP, MP
				5, 0, 0, //���ݷ� ����ġ (�ٰŸ�, ���Ÿ�, ����)
				3, 1, 0); //���� ����ġ (�ٰŸ�, ������, ����)
		
		classType = ClassType.Warrior;
	}
	
	protected void levelUp()
	{
		super.levelUp();
		if(getLevel()==10)
		{
			skillList.add(new Skill_AV());
		}
		if(getLevel()==30)
		{
			skillList.add(new Skill_AG());
		}
	}
	

}
