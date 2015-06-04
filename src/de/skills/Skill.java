package de.skills;

import de.characters.Characters;


public class Skill {
	
	String name;
	int usingMP;

	public Skill()
	{
		name = "";
		usingMP = 0;
	}
	
	public int getMP()
	{
		return usingMP;
	}
	
	
	public void useSkill(Characters user, Characters target)
	{
		
	}
	
	public void Update(Characters user)
	{
		
	}
	
	public void EndEffect(Characters user)
	{
		
	}
	
	public String toString()
	{
		return name;
	}
}
