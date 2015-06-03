package de.manager;

import java.util.Hashtable;

import de.characters.Enemy;
import de.skills.Skill_AG;
import de.skills.Skill_AV;
import de.skills.Skill_BW;
import de.skills.Skill_CB;
import de.skills.Skill_CL;
import de.skills.Skill_CON;
import de.skills.Skill_CT;
import de.skills.Skill_IV;
import de.skills.Skill_SB;
import de.skills.Skill_ST;

public class EnemyFactory {
	private static EnemyFactory instance;
	
	public static EnemyFactory getInstance()
	{
		if(instance==null)
		{
			instance = new EnemyFactory();
		}
		return instance;
	}
	
	Hashtable<String,Enemy> enemyMap;
	
	private EnemyFactory()
	{
		Init();
	}
	
	private void Init()
	{
		enemyMap = new Hashtable<String, Enemy>();
		Enemy[] enemies = {
				//name,hp,mp,meleeAP,rangedAP,magicAP,meleeGP,rangedGP,magicGP,exp,gold
				new Enemy("������", 100, 0, 20, 0, 0, 0, 0, 0, 10, 1,"���"), //���� ���� �⿬ ��
				new Enemy("��ũ", 100, 0, 20, 0, 0, 0, 0, 0, 10, 1), //���� ���� �⿬ ��
				new Enemy("����������", 120, 0, 25, 0, 0, 0, 0, 0, 20, 2), //���� ���� �⿬ ��
				new Enemy("��ũ����", 120, 0, 25, 0, 0, 0, 0, 0, 20, 2), //���� ���� �⿬ ��
				new Enemy("�ذ�â��", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //���� ���� �⿬ ��
				new Enemy("�ذ�˻�", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //���� ���� �⿬ ��
				new Enemy("�ذ�ü�", 120, 0, 0, 40, 0, 0, 0, 0, 30, 3), //���� ���� �⿬ ��
				new Enemy("����", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //���� ���� �⿬ ��
				new Enemy("Ʈ��", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //���� ���� �⿬ ��
				new Enemy("�ذ������", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //���� ���� �⿬ ��
				new Enemy("�ذ������", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //���� ���� �⿬ ��
				new Enemy("�����", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //���� ���� �⿬ ��
				
				new Enemy("���̾��", 400, 100, 60, 0, 0, 20, 0, 0, 100, 10, new Skill_AG()), //����1 ���ӵ��
				new Enemy("��ũ��������", 300, 150, 0, 80, 0, 0, 10, 0, 120, 12, new Skill_BW()), //����2 ���ӵ��
				new Enemy("�ذ����ݺ�", 300, 150, 0, 80, 0, 0, 10, 0, 120, 12, new Skill_ST()), //����3 ���ӵ��
				new Enemy("��ƾ", 600, 150, 70, 0, 0, 10, 0, 0, 200, 20, new Skill_AV()), //����4 ���ӵ��
				new Enemy("��Ÿ�±ü�", 500, 250, 0, 90, 0, 0, 10, 0, 250, 25, new Skill_ST()), //����5 ���ӵ��
				new Enemy("���", 400, 400, 0, 0, 100, 0, 0, 10, 300, 30, new Skill_CL()), //����6 ���ӵ��
				new Enemy("�����", 400, 400, 0, 0, 120, 0, 0, 10, 300, 30, new Skill_CON()), //����7 ���ӵ��
				new Enemy("��ũ�θǼ�", 600, 600, 0, 0, 130, 0, 0, 10, 400, 40, new Skill_CT()), //����8 ���ӵ��
				new Enemy("����", 800, 800, 0, 0, 150, 0, 0, 10, 500, 50, new Skill_SB()), //����9 ���ӵ��
				
				new Enemy("�巹��ũ", 1500, 400, 120, 0, 0, 30, 10, 0, 1000, 100, new Skill_BW()), //����1 ������
				new Enemy("����ƽ�", 1200, 600, 0, 160, 0, 10, 30, 10, 1200, 120, new Skill_ST()), //����2 ������
				new Enemy("ǳ�ɿ�", 1400, 700, 0, 180, 0, 10, 40, 10, 1200, 120, new Skill_ST()), //����3 ������
				new Enemy("Ÿ��", 1200, 1200, 0, 0, 200, 20, 20, 30, 2000, 200, new Skill_CT()), //����4 ������
				new Enemy("�õ�", 2000, 2000, 0, 0, 250, 20, 20, 50, 2500, 250, new Skill_CL()), //����5 ������
				new Enemy("��������Ʈ", 6000, 1200, 400, 0, 0, 60, 10, 40, 3000, 300, new Skill_CB()), //����6 ������
				new Enemy("Ÿ�뽺", 5000, 5000, 0, 0, 300, 30, 30, 70, 3000, 300, new Skill_IV()), //����7 ������
				new Enemy("�̳�Ÿ�츣��", 10000, 0, 400, 0, 0, 80, 40, 20, 4000, 400, new Skill_AG()), //����8 ������
				new Enemy("����Ȳ���׽�", 20000, 100, 500, 0, 0, 80, 100, 120, 10000, 2000, new Skill_CON(), new Skill_CB(), new Skill_AV(), new Skill_AG()) //����9 ������
				
		};
		
		for (Enemy enemy : enemies) 
		{
			enemyMap.put(enemy.getName(), enemy);
		}
	}
	
	public Enemy getEnemy(String name)
	{
		return enemyMap.get(name).clone();
	}
}
