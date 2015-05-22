package de.skills;

import de.classes.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//아머가드: 전투 시작부터 종료시 까지 받는 모든 데미지가 10 감소한다
public class Skill_AG extends PassiveSkill {
	
	public void ArmorGuard(Characters target) {
		target.setGuard(target.getGuard()+10);
		PrintMessage("강철과 같은 단단함을 보아라! 아머가드!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
