package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�ۼַ�Ʈ �踮��: 3�ϰ� ��� ������ 300%�� �����Ѵ�.
public class Skill_AB extends ActiveSkill {
	
	int count;
	
	public void useSkill(Characters user)
	{
		user.multipleRangedGPRatio(3.0f);
		user.multipleMeleeGPRatio(3.0f);
		user.multipleMagicGPRatio(3.0f);
		PrintMessage("õ���� ��ȣ��! �ۼַ�Ʈ �踮��!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleRangedGPRatio(1/3.0f);
			user.multipleMeleeGPRatio(1/3.0f);
			user.multipleMagicGPRatio(1/3.0f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
