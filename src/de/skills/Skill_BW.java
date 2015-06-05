package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//블레스 웨폰: 5턴간 근거리 공격력이 120%로 증가한다.
public class Skill_BW extends ActiveSkill {
	
	int count;
	
	public Skill_BW()
	{
		name = "블레스 웨폰";
		usingMP = 10;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.multipleMeleeAPRatio(1.2f);
		PrintMessage("신의 축복이 나의 날카로움을 더하리라! 블레스 웨폰!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleMeleeAPRatio(1/1.2f);
		}
	}
	
	public void EndEffect(Characters user)
	{
		if(count>0)
		{
			user.multipleMeleeAPRatio(1/1.2f);
			count=-1;
		}
		
	}
		
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}


}
