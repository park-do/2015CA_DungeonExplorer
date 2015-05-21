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
				
				new Enemy("난쟁이", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("오크", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("난쟁이전사", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("오크전사", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("해골창병", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("해골검사", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("해골궁수", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("돌골렘", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("트롤", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("해골검투사", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("해골근위병", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				new Enemy("오우거", 80, 10, 2, 100, 10), //공통 랜덤 출연 몹
				
				new Enemy("아이언골렘", 80, 10, 2, 100, 10, new Skill_AG()), //던전1 네임드몹
				new Enemy("다크엘프도적", 80, 10, 2, 120, 12, new Skill_BW()), //던전2 네임드몹
				new Enemy("해골저격병", 80, 10, 2, 120, 12, new Skill_ST()), //던전3 네임드몹
				new Enemy("에틴", 80, 10, 2, 200, 20, new Skill_AV()), //던전4 네임드몹
				new Enemy("불타는궁수", 80, 10, 2, 250, 25, new Skill_ST()), //던전5 네임드몹
				new Enemy("장로", 80, 10, 2, 300, 30, new Skill_CL()), //던전6 네임드몹
				new Enemy("흑장로", 80, 10, 2, 3000, 300, new Skill_CON()), //던전7 네임드몹
				new Enemy("네크로맨서", 80, 10, 2, 400, 400, new Skill_CT()), //던전8 네임드몹
				new Enemy("데몬", 80, 10, 2, 500, 50, new Skill_SB()), //던전9 네임드몹
				
				new Enemy("드레이크", 80, 10, 2, 500, 50, new Skill_BW()), //던전1 보스몹
				new Enemy("엔디아스", 80, 10, 2, 500, 50, new Skill_ST()), //던전2 보스몹
				new Enemy("풍령왕", 80, 10, 2, 500, 50, new Skill_ST()), //던전3 보스몹
				new Enemy("타락", 80, 10, 2, 500, 50, new Skill_CT()), //던전4 보스몹
				new Enemy("올딘", 80, 10, 2, 500, 50, new Skill_CL()), //던전5 보스몹
				new Enemy("데스나이트", 80, 10, 2, 500, 50, new Skill_CB()), //던전6 보스몹
				new Enemy("타노스", 80, 10, 2, 500, 50, new Skill_IV()), //던전7 보스몹
				new Enemy("미노타우르스", 80, 10, 2, 500, 50, new Skill_AG()), //던전8 보스몹
				new Enemy("진명황단테스", 80, 10, 2, 500, 50, new Skill_CON(), new Skill_CB(), new Skill_AV(), new Skill_AG()) //던전9 보스몹
				
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
