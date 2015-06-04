package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//어벤져: 전투 시작시 최대 체력이 200%로 증가한다
public class Skill_AV extends PassiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		user.multipleHPRatio(2.0f);
		PrintMessage("곰같은 힘이여 솟아라! 어벤져!!");
	}
	
	public void EndEffect(Characters user)
	{
		user.multipleHPRatio(1/2.0f);
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
