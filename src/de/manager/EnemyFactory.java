package de.manager;

import java.util.Hashtable;

import de.classes.Enemy;
import de.skills.Skill_CL;

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
				
				new Enemy("������", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("��ũ", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("����������", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("��ũ����", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�ذ�â��", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�ذ�˻�", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�ذ�ü�", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("����", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("Ʈ��", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�ذ������", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�ذ������", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				new Enemy("�����", 80, 10, 2, 100, 10), //���� ���� �⿬ ��
				
				new Enemy("���̾��", 80, 10, 2, 100, 10, new Skill_AG()), //����1 ���ӵ��
				new Enemy("��ũ��������", 80, 10, 2, 120, 12, new Skill_BW()), //����2 ���ӵ��
				new Enemy("�ذ����ݺ�", 80, 10, 2, 120, 12, new Skill_ST()), //����3 ���ӵ��
				new Enemy("��ƾ", 80, 10, 2, 200, 20, new Skill_AV()), //����4 ���ӵ��
				new Enemy("��Ÿ�±ü�", 80, 10, 2, 250, 25, new Skill_ST()), //����5 ���ӵ��
				new Enemy("���", 80, 10, 2, 300, 30, new Skill_CL()), //����6 ���ӵ��
				new Enemy("�����", 80, 10, 2, 3000, 300, new Skill_CON()), //����7 ���ӵ��
				new Enemy("��ũ�θǼ�", 80, 10, 2, 400, 400, new Skill_CT()), //����8 ���ӵ��
				new Enemy("����", 80, 10, 2, 500, 50, new Skill_SB()), //����9 ���ӵ��
				
				new Enemy("�巹��ũ", 80, 10, 2, 500, 50, new Skill_BW()), //����1 ������
				new Enemy("����ƽ�", 80, 10, 2, 500, 50, new Skill_ST()), //����2 ������
				new Enemy("ǳ�ɿ�", 80, 10, 2, 500, 50, new Skill_ST()), //����3 ������
				new Enemy("Ÿ��", 80, 10, 2, 500, 50, new Skill_CT()), //����4 ������
				new Enemy("�õ�", 80, 10, 2, 500, 50, new Skill_CL()), //����5 ������
				new Enemy("��������Ʈ", 80, 10, 2, 500, 50, new Skill_CB()), //����6 ������
				new Enemy("Ÿ�뽺", 80, 10, 2, 500, 50, new Skill_IV()), //����7 ������
				new Enemy("�̳�Ÿ�츣��", 80, 10, 2, 500, 50, new Skill_AG()), //����8 ������
				new Enemy("����Ȳ���׽�", 80, 10, 2, 500, 50, new Skill_CON(), new Skill_CB(), new Skill_AV(), new Skill_AG()) //����9 ������
				
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
