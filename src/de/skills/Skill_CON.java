package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�ݿ������ó: ���� ����� 1ȸ �ִ� ü�� ���·� ��Ȱ�Ѵ�
public class Skill_CON extends ActiveSkill {
	
	public void useSkill(Characters user)
	{
		//���� �̱���
		PrintMessage("�ڿ��� �θ��� ���ϳ��! �ݿ������ó!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
