package de.skills;

import de.characters.Characters;
import de.manager.WindowManager;
import de.windows.FightWindow;

//���� ����: 5�ϰ� �ٰŸ� ���ݷ��� 20% �����Ѵ�
public class Skill_BW extends ActiveSkill {
	
	
	public void BlessWeapon(Characters target) {
		target.setAttack((int)(target.getAttack()*1.2));
		PrintMessage("���� ��ī�ο��� �ʸ� �������! ���� ����!!");
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}


}
