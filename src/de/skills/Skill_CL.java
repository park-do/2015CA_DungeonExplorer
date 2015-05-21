package de.skills;

import de.classes.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�� ����Ʈ��: ���濡�� ??�� ���� �������� �ش�
public class Skill_CL extends ActiveSkill {
	
	public void CallLightening (Characters target) {
		target.Damaged(100);
		PrintMessage("õ���� ������ �� ���ϸ���! �� ����Ʈ��!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
