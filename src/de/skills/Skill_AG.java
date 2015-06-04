package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//아머가드: 전투 시작부터 종료시 까지 모든 방어력이 120%로 증가한다.
public class Skill_AG extends PassiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		user.multipleRangedGPRatio(1.2f);
		user.multipleMeleeGPRatio(1.2f);
		user.multipleMagicGPRatio(1.2f);
		PrintMessage("강철과 같은 이 몸의 단단함을 보아라! 아머가드!!");
	}
	
	public void EndEffect(Characters user)
	{
		user.multipleRangedGPRatio(1/1.2f);
		user.multipleMeleeGPRatio(1/1.2f);
		user.multipleMagicGPRatio(1/1.2f);
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
