package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//앱솔루트 배리어: 3턴간 모든 방어력이 300%로 증가한다.
public class Skill_AB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user)
	{
		user.multipleRangedGPRatio(3.0f);
		user.multipleMeleeGPRatio(3.0f);
		user.multipleMagicGPRatio(3.0f);
		PrintMessage("천상의 보호막! 앱솔루트 배리어!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleRangedGPRatio(1/3.0f);
			user.multipleMeleeGPRatio(1/3.0f);
			user.multipleMagicGPRatio(1/3.0f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
