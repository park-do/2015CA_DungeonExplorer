package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//인비저빌러티: 3턴간 무적 상태가 된다.
public class Skill_IV extends ActiveSkill {
	
	public void useSkill(Characters user)
	{
		//아직 미구현
		PrintMessage("마법의 권능을 보여주마! 인비지빌러티!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
