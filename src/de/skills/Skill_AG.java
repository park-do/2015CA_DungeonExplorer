package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�ƸӰ���: ���� ���ۺ��� ����� ���� �޴� ��� ������ 20% �����Ѵ�.
public class Skill_AG extends PassiveSkill {
	
	public void useSkill(Characters user)
	{
		user.multipleRangedGPRatio(1.2f);
		user.multipleMeleeGPRatio(1.2f);
		user.multipleMagicGPRatio(1.2f);
		PrintMessage("��ö�� ���� �� ���� �ܴ����� ���ƶ�! �ƸӰ���!!");
	}
	
	//�нú� �ߵ��� ���???
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
