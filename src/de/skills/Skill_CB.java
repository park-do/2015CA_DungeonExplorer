package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//ī���� �踮��: ���� ���� ������ ü�·��� 200%�� �ش��ϴ� �ݻ絥������ ������ �ش�.
public class Skill_CB extends ActiveSkill {
	
	public Skill_CB()
	{
		name = "ī���� �踮��";
		usingMP = 100;
	}

	public void useSkill(Characters user, Characters target) {
		target.Damaged(user.getDamagedhp()*2);
		PrintMessage("���� ���� ���� �� �ڽ��� ��ġ����! ī���� �踮��!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
