package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//선버스트: 상대방에게 내 마법 공격력의 300%에 해당하는 마법 데미지를 주고 5턴간 매턴 마법 공격력의 50% 만큼 화상 데미지를 준다.
public class Skill_SB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*3);
		PrintMessage("폭발하는 화염의 집중! 선 버스트!!");
		count=5;
	}
		
	public void Update (Characters user, Characters target)
	{
		if (count>0)
		{
			user.Attack(target,0,0,(int) (user.getMagicAP()*0.5));
		}
		count--;
	}
		
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
