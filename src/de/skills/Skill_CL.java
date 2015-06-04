package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//콜 라이트닝: 상대방에게 내 마법 공격력의 300%에 해당하는 데미지를 준다.
public class Skill_CL extends ActiveSkill {
	
	public Skill_CL()
	{
		name = "콜 라이트닝";
		usingMP = 100;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*3);
		PrintMessage("천둥의 심판이 널 벌하리라! 콜 라이트닝!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
