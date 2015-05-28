package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//스트라이커: 5턴간 원거리 공격력이 40% 증가한다
public class Skill_ST extends ActiveSkill {
	
	int count;
		
	public void useSkill(Characters user, Characters target)
	{
		user.multipleRangedAPRatio(1.4f);
		PrintMessage("너의 약점은 이미 간파했다! 스트라이커!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleRangedAPRatio(1/1.4f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
