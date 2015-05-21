package de.item;

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
	
	public Item(String name, ClassType classType)
	{
		this.name = name;
		this.classType = classType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}
	
	
}
