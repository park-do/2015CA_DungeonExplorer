package de.characters;


public class Knight extends Player {

	
	public Knight(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				150, 50, //�ʱ� HP, MP  
				10, 0, 0, //�ʱ� �� �� �� ��
				3, 2, 2, //�ʱ� �� �� �� ��
				15, 5, //���� HP, MP
				2, 0, 0, //���� �� �� �� ��
				1, 1, 1); //���� �� �� �� ��
	}

}
