package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//���: ���� ���۽� �ִ�ü���� 2��� �����Ѵ�
public class Skill_AV extends PassiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		target.setHp(target.getMaxHp()*2);
		PrintMessage("������ ���̿� �ھƶ�! ���!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
