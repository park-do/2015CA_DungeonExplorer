package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//콜 라이트닝: 상대방에게 높은 마법 데미지를 준다
public class Skill_CL extends ActiveSkill {
	
	public void useSkill(Characters target)
	{
		target.Damaged(100);
		PrintMessage("천둥의 심판이 널 벌하리라! 콜 라이트닝!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
