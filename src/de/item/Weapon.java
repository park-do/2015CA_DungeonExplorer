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
		//Casting 하여 사용
		Player player = (Player)target;
		
		//쭉 돌아서 착용 중인 무기가 있다면
		for(int i=0;i<player.equippedItem.size();i++)
		{
			if(player.equippedItem.get(i) instanceof Weapon)
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
		//result += "\n착용 부위 : " + getEquipType().toString();
		if(getMeleeAP()>0)result += "<br>근접 공격 : " + getMeleeAP();
		if(getRangedAP()>0)result += "<br>원거리 공격 : " + getRangedAP();
		if(getMagicAP()>0)result += "<br>마법 공격 : " + getMagicAP();
		result+="</html>";
		return result;
	}
}
