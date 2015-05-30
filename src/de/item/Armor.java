package de.item;

import de.characters.Characters;
import de.characters.Player;

public class Armor extends Item {

	public enum EquipType
	{
		Helmet,
		Chest,
		Globe,
		Shoes,
		Shield
	}
		
	EquipType equipType;
	
	int meleeGP;
	int rangedGP;
	int magicGP;
	
	public Armor(String name, ClassType classType, EquipType equipType, int price, int meleeGP,
			int rangedGP, int magicGP) {
		super(name, classType, price);
		this.meleeGP = meleeGP;
		this.rangedGP = rangedGP;
		this.magicGP = magicGP;
		this.equipType = equipType;
	}
	public int getMeleeGP() {
		return meleeGP;
	}
	public int getRangedGP() {
		return rangedGP;
	}
	public int getMagicGP() {
		return magicGP;
	}
	public EquipType getEquipType()
	{
		return equipType;
	}
	
	public void useItem(Characters target)
	{
		//Casting �Ͽ� ���
		Player player = (Player)target;
		
		//�� ���Ƽ� ���� ���� ���� ��ġ�� ���� �ִٸ�
		for(int i=0;i<player.equippedItem.size();i++)
		{
			Item item = player.equippedItem.get(i);
			if(item instanceof Armor && //�� �׸���
				((Armor)item).equipType==this.equipType)
			{
				//������ �����Ѵ�.
				player.equippedItem.remove(i);
				break;
			}
		}
		
		//�׸��� �ڱ� �ڽ��� �����Ų��.
		player.equippedItem.add(this);	
		
	}
}
