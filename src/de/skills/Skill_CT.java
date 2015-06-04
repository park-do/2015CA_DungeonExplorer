package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//ĥ ��ġ: ���濡�� �� ���� ���ݷ��� 200%�� �ش��ϴ� �������� �ְ� 100%��ŭ ���� ü���� ȸ���Ѵ�.
public class Skill_CT extends ActiveSkill {
	
	public Skill_CT()
	{
		name = "ĥ ��ġ";
		usingMP = 50;
	}
	
	public void useSkill(Characters user, Characters target)
	{
		user.Attack(target,0,0,user.getMagicAP()*2);
		user.Damaged(-user.getMagicAP());
		PrintMessage("������ �ձ��� �״븦 ��縸������! ĥ ��ġ!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
