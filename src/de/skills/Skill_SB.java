package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//������Ʈ: ���濡�� �� ���� ���ݷ��� 300%�� �ش��ϴ� ���� �������� �ְ� 5�ϰ� ���� ���� ���ݷ��� 50% ��ŭ ȭ�� �������� �ش�.
public class Skill_SB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*3);
		PrintMessage("�����ϴ� ȭ���� ����! �� ����Ʈ!!");
		count=5;
	}
		
	public void Update (Characters user, Characters target)
	{
		if (count>0)
		{
			user.Attack(target,0,0,(int) (user.getMagicAP()*0.5));
		}
		count--;
	}
		
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
