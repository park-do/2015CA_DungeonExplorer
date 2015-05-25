package de.characters;


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
	}

}
