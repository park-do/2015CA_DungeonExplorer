package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//콜 오브 네이처: 사용시 현재 체력과 관계없이 최대 체력 상태로 회복한다.
public class Skill_CON extends ActiveSkill {
	
	public Skill_CON()
	{
		name = "콜 오브 네이처";
		usingMP = 300;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.setDamagedhp(0);
		PrintMessage("자연의 부름에 응하노라! 콜오브네이처!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
