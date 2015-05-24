package de.characters;


public class Knight extends Player {

	
	public Knight(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				150, 50, //초기 HP, MP  
				10, 0, 0, //초기 근 원 마 공
				3, 2, 2, //초기 근 원 마 방
				15, 5, //성장 HP, MP
				2, 0, 0, //성장 근 원 마 공
				1, 1, 1); //성장 근 원 마 방
	}

}
