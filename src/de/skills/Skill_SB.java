package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//선버스트: 상대방에게 내 마법 공격력의 3배의 마법 데미지를 주고 화상을 입혀서 5턴간 매턴 마법 공격력 만큼 체력을 감소 시킨다.
public class Skill_SB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user, Characters target)
	{
		target.Damaged(user.getMagicAP()*3);
		PrintMessage("폭발하는 화염의 집중! 선 버스트!!");
		count=5;
	}
		
	public void Update (Characters user, Characters target)
	{
		if (count>0)
		{
			target.Damaged(user.getMagicAP());
		}
		count--;
	}
		
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
