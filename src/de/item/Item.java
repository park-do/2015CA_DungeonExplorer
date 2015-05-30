package de.item;

import de.characters.Characters;

public class Item {
	
	public enum ClassType
	{
		Knight,
		Warrior,
		Elf,
		Magician,
		All
	}
		
	String name;
	ClassType classType;
	
	int price;
	
	public Item(String name, ClassType classType, int price)
	{
		this.name = name;
		this.classType = classType;
		this.price = price;
		
	}
	
	public void useItem(Characters target)
	{
		//override 용 메소드
	}

	public String getName() {
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}

	public ClassType getClassType() {
		return classType;
	}
}
