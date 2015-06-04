package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//카운터 배리어: 현재 나의 감소한 체력량의 200%에 해당하는 반사데미지를 적에게 준다.
public class Skill_CB extends ActiveSkill {
	
	public Skill_CB()
	{
		name = "카운터 배리어";
		usingMP = 100;
	}

	public void useSkill(Characters user, Characters target) {
		target.Damaged(user.getDamagedhp()*2);
		PrintMessage("나를 향한 검이 네 자신을 해치리라! 카운터 배리어!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
