package de.skills;

import de.classes.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//콜 라이트닝: 상대방에게 ??의 마법 데미지를 준다
public class Skill_CL extends ActiveSkill {
	
	public void CallLightening (Characters target) {
		target.Damaged(100);
		PrintMessage("천둥의 심판이 널 벌하리라! 콜 라이트닝!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
