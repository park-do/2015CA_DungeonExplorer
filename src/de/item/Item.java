package de.item;

import de.characters.Characters;
import de.manager.EnemyFactory;

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
		//override �� �޼ҵ�
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
	
	public String toString()
	{
		String result = "<html><b>"+getName()+"</b>";
		result += "<br>���� : "+getPrice();
		result += "<br>���� : "+getClassType().toString();
		result += "</html>";
		return result;
	}
	
	public String toStringWithoutLastHTML()
	{
		String result = "<html><b>"+getName()+"</b>";
		result += "<br>���� : "+getPrice();
		result += "<br>���� : "+getClassType().toString();
		return result;
	}
}
