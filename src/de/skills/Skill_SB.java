package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//������Ʈ: ���濡�� �� ���� ���ݷ��� 3���� ���� �������� �ְ� ȭ���� ������ 5�ϰ� ���� ���� ���ݷ� ��ŭ ü���� ���� ��Ų��.
public class Skill_SB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user, Characters target)
	{
		target.Damaged(user.getMagicAP()*3);
		PrintMessage("�����ϴ� ȭ���� ����! �� ����Ʈ!!");
		count=5;
	}
		
	public void Update (Characters user, Characters target)
	{
		if (count>0)
		{
			target.Damaged(user.getMagicAP());
		}
		count--;
	}
		
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
