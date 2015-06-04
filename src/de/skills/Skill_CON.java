package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�� ���� ����ó: ���� ���� ü�°� ������� �ִ� ü�� ���·� ȸ���Ѵ�.
public class Skill_CON extends ActiveSkill {
	
	public Skill_CON()
	{
		name = "�� ���� ����ó";
		usingMP = 300;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.setDamagedhp(0);
		PrintMessage("�ڿ��� �θ��� ���ϳ��! �ݿ������ó!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
