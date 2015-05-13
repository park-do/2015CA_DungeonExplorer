package de.classes;

public class Characters 
{
	String name;
	int hp;
	int damagedhp;
	int attack;
	int guard;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public int getDamagedhp() {
		return damagedhp;
	}

	public void setDamagedhp(int damagedhp) {
		this.damagedhp = damagedhp;
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
	
	public void Attack(Characters target)
	{
		int attack = this.attack;
		attack -= target.guard;
		if(attack<0)attack = 0;
		target.damagedhp+=attack;
		
		PrintMessage(name+"이(가) " +target.getName()+"에게 "+attack+"데미지!");
	}
	
	void PrintMessage(String msg)
	{
		System.out.println(msg);
	}
}
