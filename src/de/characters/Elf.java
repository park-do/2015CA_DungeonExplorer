package de.characters;


public class Elf extends Player {

	
	public Elf(String name)
	{
		//name, damagedHp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP, magicGP, level, requiredExp, exp, hPgrowth, mPgrowth, meleeAPgrowth, rangedAPgrowth, magicAPgrowth, meleeGPgrowth, rangedGPgrowth, magicGPgrowth, equippedItem, bringItem
		super(name, 
				700, 350, //�ʱ� HP, MP  
				0, 60, 0, //�ʱ� ���ݷ� (�ٰŸ�, ���Ÿ�, ����)
				5, 15, 10, //�ʱ� ���� (�ٰŸ�, ���Ÿ�, ����)
				70, 35, //���� HP, MP
				0, 6, 0, //���ݷ� ����ġ (�ٰŸ�, ���Ÿ�, ����)
				1, 2, 2); //���� ����ġ (�ٰŸ�, ������, ����)
	}

}