package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//���: ���� ���۽� �ִ�ü���� 2��� �����Ѵ�
public class Skill_AV extends PassiveSkill {
	
	public void useSkill(Characters user)
	{
		user.multipleHPRatio(2.0f);
		PrintMessage("������ ���̿� �ھƶ�! ���!!");
	}
	
	//�нú� �ߵ��� ���???
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
