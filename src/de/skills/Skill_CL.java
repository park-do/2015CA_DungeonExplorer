package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//�� ����Ʈ��: ���濡�� �� ���� ���ݷ��� 300%�� �ش��ϴ� �������� �ش�.
public class Skill_CL extends ActiveSkill {
	
	public Skill_CL()
	{
		name = "�� ����Ʈ��";
		usingMP = 100;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*3);
		PrintMessage("õ���� ������ �� ���ϸ���! �� ����Ʈ��!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
