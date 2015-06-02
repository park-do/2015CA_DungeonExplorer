package de.characters;

import de.item.Item.ClassType;


public class Warrior extends Player {

	
	public Warrior(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				1100, 0, //초기 HP, MP  
				50, 0, 0, //초기 공격력 (근거리, 원거리, 마법)
				15, 5, 0, //초기 방어력 (근거리, 원거리, 마법)
				110, 0, //성장 HP, MP
				5, 0, 0, //공격력 성장치 (근거리, 원거리, 마법)
				3, 1, 0); //방어력 성장치 (근거리, 원가리, 마법)
		
		classType = ClassType.Warrior;
	}

}
