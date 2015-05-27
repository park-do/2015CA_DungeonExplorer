package de.characters;

import java.util.ArrayList;

import de.item.Item;
import de.item.Weapon;

public class Player extends Characters {
	int level;
	int requiredExp;
	int Exp;
	int HPgrowth;
	int MPgrowth;
	int meleeAPgrowth;
	int rangedAPgrowth;
	int magicAPgrowth;
	int meleeGPgrowth;
	int rangedGPgrowth;
	int magicGPgrowth;
	
	public ArrayList<Item> equippedItem;
	public ArrayList<Item> bringItem;
	
	
	

	public Player(String name, int hp, int mp, int meleeAP, int rangedAP,
			int magicAP, int meleeGP, int rangedGP, int magicGP,
			int hPgrowth, int mPgrowth,
			int meleeAPgrowth, int rangedAPgrowth, int magicAPgrowth,
			int meleeGPgrowth, int rangedGPgrowth, int magicGPgrowth) {
		super(name, hp, mp, meleeAP, rangedAP, magicAP, meleeGP, rangedGP,
				magicGP);
		this.level = 1;
		this.requiredExp = 10;
		Exp = 0;
		HPgrowth = hPgrowth;
		MPgrowth = mPgrowth;
		this.meleeAPgrowth = meleeAPgrowth;
		this.rangedAPgrowth = rangedAPgrowth;
		this.magicAPgrowth = magicAPgrowth;
		this.meleeGPgrowth = meleeGPgrowth;
		this.rangedGPgrowth = rangedGPgrowth;
		this.magicGPgrowth = magicGPgrowth;
		this.equippedItem = new ArrayList<Item>();
		this.bringItem = new ArrayList<Item>();
	}
	
	
	@Override
	public int getMeleeAP() {
		// TODO Auto-generated method stub
		int wma = 0;
		for(int i=0;i<equippedItem.size();i++)
		{
			if(equippedItem.get(i) instanceof Weapon)
			{
				wma = ((Weapon)equippedItem.get(i)).getMeleeAP();
				break;
			}
		}
		
		return meleeAP + wma;
	}


	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getRequiredExp() {
		return requiredExp;
	}
	public void setRequiredExp(int requiredExp) {
		this.requiredExp = requiredExp;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public int getHPgrowth() {
		return HPgrowth;
	}
	public void setHPgrowth(int hPgrowth) {
		HPgrowth = hPgrowth;
	}
	public int getMPgrowth() {
		return MPgrowth;
	}
	public void setMPgrowth(int mPgrowth) {
		MPgrowth = mPgrowth;
	}
	public int getMeleeAPgrowth() {
		return meleeAPgrowth;
	}
	public void setMeleeAPgrowth(int meleeAPgrowth) {
		this.meleeAPgrowth = meleeAPgrowth;
	}
	public int getRangedAPgrowth() {
		return rangedAPgrowth;
	}
	public void setRangedAPgrowth(int rangedAPgrowth) {
		this.rangedAPgrowth = rangedAPgrowth;
	}
	public int getMagicAPgrowth() {
		return magicAPgrowth;
	}
	public void setMagicAPgrowth(int magicAPgrowth) {
		this.magicAPgrowth = magicAPgrowth;
	}
	public int getMeleeGPgrowth() {
		return meleeGPgrowth;
	}
	public void setMeleeGPgrowth(int meleeGPgrowth) {
		this.meleeGPgrowth = meleeGPgrowth;
	}
	public int getRangedGPgrowth() {
		return rangedGPgrowth;
	}
	public void setRangedGPgrowth(int rangedGPgrowth) {
		this.rangedGPgrowth = rangedGPgrowth;
	}
	public int getMagicGPgrowth() {
		return magicGPgrowth;
	}
	public void setMagicGPgrowth(int magicGPgrowth) {
		this.magicGPgrowth = magicGPgrowth;
	}
	public ArrayList<Item> getEquippedItem() {
		return equippedItem;
	}
	public void setEquippedItem(ArrayList<Item> equippedItem) {
		this.equippedItem = equippedItem;
	}
	public ArrayList<Item> getBringItem() {
		return bringItem;
	}
	public void setBringItem(ArrayList<Item> bringItem) {
		this.bringItem = bringItem;
	}
	
	
}
