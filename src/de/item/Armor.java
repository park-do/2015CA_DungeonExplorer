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
		//Casting 하여 사용
		Player player = (Player)target;
		
		//쭉 돌아서 착용 중인 같은 위치의 방어구가 있다면
		for(int i=0;i<player.equippedItem.size();i++)
		{
			Item item = player.equippedItem.get(i);
			if(item instanceof Armor && //방어구 그리고
				((Armor)item).equipType==this.equipType)
			{
				//착용을 해제한다.
				player.equippedItem.remove(i);
				break;
			}
		}
		
		//그리고 자기 자신을 착용시킨다.
		player.equippedItem.add(this);	
		
	}
	
	public String toString()
	{
		String result = super.toStringWithoutLastHTML();
		result += "<br>착용 부위 : " + getEquipType().toString();
		if(getMeleeGP()>0)result += "<br>근접 방어 : " + getMeleeGP();
		if(getRangedGP()>0)result += "<br>원거리 방어 : " + getRangedGP();
		if(getMagicGP()>0)result += "<br>마법 방어 : " + getMagicGP();
		result+="</html>";
		return result;
	}
}
