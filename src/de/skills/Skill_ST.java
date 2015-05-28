package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//��Ʈ����Ŀ: 5�ϰ� ���Ÿ� ���ݷ��� 40% �����Ѵ�
public class Skill_ST extends ActiveSkill {
	
	int count;
		
	public void useSkill(Characters user, Characters target)
	{
		user.multipleRangedAPRatio(1.4f);
		PrintMessage("���� ������ �̹� �����ߴ�! ��Ʈ����Ŀ!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleRangedAPRatio(1/1.4f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
