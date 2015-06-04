package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//칠 터치: 상대방에게 내 마법 공격력의 200%에 해당하는 데미지를 주고 100%만큼 본인 체력을 회복한다.
public class Skill_CT extends ActiveSkill {
	
	public Skill_CT()
	{
		name = "칠 터치";
		usingMP = 50;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*2);
		user.Damaged(-user.getMagicAP());
		PrintMessage("차가운 손길이 그대를 어루만지리니! 칠 터치!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
