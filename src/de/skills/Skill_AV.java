package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//어벤져: 전투 시작시 최대체력이 2배로 증가한다
public class Skill_AV extends PassiveSkill {
	
	public void useSkill(Characters user)
	{
		user.multipleHPRatio(2.0f);
		PrintMessage("곰같은 힘이여 솟아라! 어벤져!!");
	}
	
	//패시브 발동은 어떻게???
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
