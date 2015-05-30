package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//ĥ ��ġ: ���濡�� �� ���� ���ݷ��� 2�迡 �ش��ϴ� �������� �ְ� �������� ���� ü������ ����Ѵ�
public class Skill_CT extends ActiveSkill {
	
	public void useSkill(Characters user, Characters target)
	{
		target.Damaged(user.getMagicAP()*2);
		user.getNowHP(); // ��ȸ���� ���...?
		PrintMessage("������ �ձ��� �״븦 ��縸������! ĥ ��ġ!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
