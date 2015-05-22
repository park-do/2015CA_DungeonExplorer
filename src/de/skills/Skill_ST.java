package de.skills;

import de.classes.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//스트라이커: 5턴간 원거리 공격력이 40% 증가한다
public class Skill_ST extends ActiveSkill {
	
	public void Striker(Characters target) {
		target.setAttack((int)(target.getAttack()*1.4));
		PrintMessage("너의 약점은 이미 간파했다! 스트라이커!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
