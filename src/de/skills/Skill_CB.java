package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//ī���� �踮��: 5�ϰ� ���� ���� �������� 2�踦 �ݻ��Ѵ�
public class Skill_CB extends ActiveSkill {

	int count;

	public void useSkill(Characters user, Characters target) {
		target.Damaged(user.getDamagedhp()*2);
		PrintMessage("���� ���� ���� �� �ڽ��� ��ġ����! ī���� �踮��!!");
		count = 5;
	}

	public void Update(Characters user) {
		count--;
		if (count == 0) {
			user.multipleMeleeAPRatio(1 / 1.2f);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

}
