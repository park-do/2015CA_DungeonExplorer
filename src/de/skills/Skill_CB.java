package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//카운터 배리어: 5턴간 내가 받은 데미지의 2배를 반사한다
public class Skill_CB extends ActiveSkill {

	int count;

	public void useSkill(Characters user, Characters target) {
		target.Damaged(user.getDamagedhp()*2);
		PrintMessage("나를 향한 검이 네 자신을 해치리라! 카운터 배리어!!");
		count = 5;
	}

	public void Update(Characters user) {
		count--;
		if (count == 0) {
			user.multipleMeleeAPRatio(1 / 1.2f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
