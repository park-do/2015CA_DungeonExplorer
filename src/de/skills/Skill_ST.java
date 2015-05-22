package de.skills;

import de.classes.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//��Ʈ����Ŀ: 5�ϰ� ���Ÿ� ���ݷ��� 40% �����Ѵ�
public class Skill_ST extends ActiveSkill {
	
	public void Striker(Characters target) {
		target.setAttack((int)(target.getAttack()*1.4));
		PrintMessage("���� ������ �̹� �����ߴ�! ��Ʈ����Ŀ!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
