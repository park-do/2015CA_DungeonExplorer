package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//블레스 웨폰: 5턴간 근거리 공격력이 20% 증가한다
public class Skill_BW extends ActiveSkill {
	
	
	public void BlessWeapon(Characters target) {
		target.setAttack((int)(target.getAttack()*1.2));
		PrintMessage("나의 날카로움이 너를 베어내리라! 블레스 웨폰!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}


}
