package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�κ�������Ƽ: 3�ϰ� ���� ���°� �ȴ�.
public class Skill_IV extends ActiveSkill {
	
	public void useSkill(Characters user)
	{
		//���� �̱���
		PrintMessage("������ �Ǵ��� �����ָ�! �κ�������Ƽ!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
