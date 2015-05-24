package de.characters;

import java.util.ArrayList;

import de.manager.WindowManager;
import de.skills.Skill;
import de.windows.FightWindow;

public class Characters 
{
	String name;
	int hp;
	int damagedHp;
	int mp;
	int usedMp;
	
	int meleeAP;
	int rangedAP;
	int magicAP;
	int meleeGP;
	int rangedGP;
	int magicGP;
	
	int attack;
	int guard;
	
	ArrayList<Skill> skillList = new ArrayList<Skill>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHp() {
		return hp;
	}
	
	public int getNowHP()
	{
		return hp-damagedHp;
	}
	
	public void Damaged(int damage)
	{
		damagedHp+=damage;
	}

	public int getDamagedhp() {
		return damagedHp;
	}

	public void setDamagedhp(int damagedhp) {
		this.damagedHp = damagedhp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getGuard() {
		return guard;
	}

	public void setGuard(int guard) {
		this.guard = guard;
	}

	public Characters()
	{
		
	}
	
	public Characters(String name, int hp, int attack, int guard)
	{
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.guard = guard;
	}
	
	public Characters(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP) {
		super();
		this.name = name;
		this.hp = hp;
		this.damagedHp = 0;
		this.mp = mp;
		this.usedMp = 0;
		this.meleeAP = meleeAP;
		this.rangedAP = rangedAP;
		this.magicAP = magicAP;
		this.meleeGP = meleeGP;
		this.rangedGP = rangedGP;
		this.magicGP = magicGP;
	}

	public void AddSkill(Skill skill)
	{
		skillList.add(skill);
	}
	
	public void Attack(Characters target)
	{
		int attack = this.attack;
		attack -= target.guard;
		if(attack<0)attack = 0;
		target.Damaged(attack);
		
		PrintMessage(name+"이(가) " +target.getName()+"에게 "+attack+"데미지!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}
}
