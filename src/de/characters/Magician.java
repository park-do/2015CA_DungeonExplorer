package de.characters;


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
	}

}
