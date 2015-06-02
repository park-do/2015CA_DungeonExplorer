package de.item;

import de.characters.Characters;
import de.characters.Player;

public class Weapon extends Item {

	
	int meleeAP;
	int rangedAP;
	int magicAP;
	
	public Weapon(String name, ClassType classType, int price, int meleeAP,
			int rangedAP, int magicAP) {
		super(name, classType, price);
		this.meleeAP = meleeAP;
		this.rangedAP = rangedAP;
		this.magicAP = magicAP;
	}
	public int getMeleeAP() {
		return meleeAP;
	}
	public int getRangedAP() {
		return rangedAP;
	}
	public int getMagicAP() {
		return magicAP;
	}
	
	
	public void useItem(Characters target)
	{
		//Casting �Ͽ� ���
		Player player = (Player)target;
		
		//�� ���Ƽ� ���� ���� ���Ⱑ �ִٸ�
		for(int i=0;i<player.equippedItem.size();i++)
		{
			if(player.equippedItem.get(i) instanceof Weapon)
			{
				//������ �����Ѵ�.
				player.equippedItem.remove(i);
				break;
			}
		}
		
		//�׸��� �ڱ� �ڽ��� �����Ų��.
		player.equippedItem.add(this);	
		
	}
	
	public String toString()
	{
		String result = super.toStringWithoutLastHTML();
		//result += "\n���� ���� : " + getEquipType().toString();
		if(getMeleeAP()>0)result += "<br>���� ���� : " + getMeleeAP();
		if(getRangedAP()>0)result += "<br>���Ÿ� ���� : " + getRangedAP();
		if(getMagicAP()>0)result += "<br>���� ���� : " + getMagicAP();
		result+="</html>";
		return result;
	}
}
