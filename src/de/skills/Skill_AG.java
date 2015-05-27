package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�ƸӰ���: ���� ���ۺ��� ����� ���� �޴� ��� �������� 10 �����Ѵ�
public class Skill_AG extends PassiveSkill {
	
	public void useSkill(Characters target)
	{
		target.setGuard(target.getGuard()+10);
		PrintMessage("��ö�� ���� �ܴ����� ���ƶ�! �ƸӰ���!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
