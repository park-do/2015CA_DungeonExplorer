package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//콜오브네이처: 전투 사망시 1회 최대 체력 상태로 부활한다
public class Skill_CON extends ActiveSkill {
	
	public void useSkill(Characters user)
	{
		//아직 미구현
		PrintMessage("자연의 부름에 응하노라! 콜오브네이처!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
