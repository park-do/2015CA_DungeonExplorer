package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//칠 터치: 상대방에게 내 마법 공격력의 2배에 해당하는 데미지를 주고 일정량을 본인 체력으로 흡수한다
public class Skill_CT extends ActiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		target.Damaged(user.getMagicAP()*2);
		user.getNowHP(); // 피회복을 어떻게...?
		PrintMessage("차가운 손길이 그대를 어루만지리니! 칠 터치!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
