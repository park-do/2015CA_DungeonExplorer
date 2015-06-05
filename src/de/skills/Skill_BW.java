package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//���� ����: 5�ϰ� �ٰŸ� ���ݷ��� 120%�� �����Ѵ�.
public class Skill_BW extends ActiveSkill {
	
	int count;
	
	public Skill_BW()
	{
		name = "���� ����";
		usingMP = 10;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.multipleMeleeAPRatio(1.2f);
		PrintMessage("���� �ູ�� ���� ��ī�ο��� ���ϸ���! ���� ����!!");
		count=5;
	}
	
	public void Update (Characters user)
	{
		count--;
		if (count==0)
		{
			user.multipleMeleeAPRatio(1/1.2f);
		}
	}
	
	public void EndEffect(Characters user)
	{
		if(count>0)
		{
			user.multipleMeleeAPRatio(1/1.2f);
			count=-1;
		}
		
	}
		
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}


}
