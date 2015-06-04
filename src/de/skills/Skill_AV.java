package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//���: ���� ���۽� �ִ� ü���� 200%�� �����Ѵ�
public class Skill_AV extends PassiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		user.multipleHPRatio(2.0f);
		PrintMessage("������ ���̿� �ھƶ�! ���!!");
	}
	
	public void EndEffect(Characters user)
	{
		user.multipleHPRatio(1/2.0f);
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
