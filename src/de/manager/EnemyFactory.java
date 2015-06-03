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
				new Enemy("난쟁이", 100, 0, 20, 0, 0, 0, 0, 0, 10, 1,"대검"), //공통 랜덤 출연 몹
				new Enemy("오크", 100, 0, 20, 0, 0, 0, 0, 0, 10, 1), //공통 랜덤 출연 몹
				new Enemy("난쟁이전사", 120, 0, 25, 0, 0, 0, 0, 0, 20, 2), //공통 랜덤 출연 몹
				new Enemy("오크전사", 120, 0, 25, 0, 0, 0, 0, 0, 20, 2), //공통 랜덤 출연 몹
				new Enemy("해골창병", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //공통 랜덤 출연 몹
				new Enemy("해골검사", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //공통 랜덤 출연 몹
				new Enemy("해골궁수", 120, 0, 0, 40, 0, 0, 0, 0, 30, 3), //공통 랜덤 출연 몹
				new Enemy("돌골렘", 150, 0, 30, 0, 0, 0, 0, 0, 30, 3), //공통 랜덤 출연 몹
				new Enemy("트롤", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //공통 랜덤 출연 몹
				new Enemy("해골검투사", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //공통 랜덤 출연 몹
				new Enemy("해골근위병", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //공통 랜덤 출연 몹
				new Enemy("오우거", 200, 0, 40, 0, 0, 0, 0, 0, 50, 5), //공통 랜덤 출연 몹
				
				new Enemy("아이언골렘", 400, 100, 60, 0, 0, 20, 0, 0, 100, 10, new Skill_AG()), //던전1 네임드몹
				new Enemy("다크엘프도적", 300, 150, 0, 80, 0, 0, 10, 0, 120, 12, new Skill_BW()), //던전2 네임드몹
				new Enemy("해골저격병", 300, 150, 0, 80, 0, 0, 10, 0, 120, 12, new Skill_ST()), //던전3 네임드몹
				new Enemy("에틴", 600, 150, 70, 0, 0, 10, 0, 0, 200, 20, new Skill_AV()), //던전4 네임드몹
				new Enemy("불타는궁수", 500, 250, 0, 90, 0, 0, 10, 0, 250, 25, new Skill_ST()), //던전5 네임드몹
				new Enemy("장로", 400, 400, 0, 0, 100, 0, 0, 10, 300, 30, new Skill_CL()), //던전6 네임드몹
				new Enemy("흑장로", 400, 400, 0, 0, 120, 0, 0, 10, 300, 30, new Skill_CON()), //던전7 네임드몹
				new Enemy("네크로맨서", 600, 600, 0, 0, 130, 0, 0, 10, 400, 40, new Skill_CT()), //던전8 네임드몹
				new Enemy("데몬", 800, 800, 0, 0, 150, 0, 0, 10, 500, 50, new Skill_SB()), //던전9 네임드몹
				
				new Enemy("드레이크", 1500, 400, 120, 0, 0, 30, 10, 0, 1000, 100, new Skill_BW()), //던전1 보스몹
				new Enemy("엔디아스", 1200, 600, 0, 160, 0, 10, 30, 10, 1200, 120, new Skill_ST()), //던전2 보스몹
				new Enemy("풍령왕", 1400, 700, 0, 180, 0, 10, 40, 10, 1200, 120, new Skill_ST()), //던전3 보스몹
				new Enemy("타락", 1200, 1200, 0, 0, 200, 20, 20, 30, 2000, 200, new Skill_CT()), //던전4 보스몹
				new Enemy("올딘", 2000, 2000, 0, 0, 250, 20, 20, 50, 2500, 250, new Skill_CL()), //던전5 보스몹
				new Enemy("데스나이트", 6000, 1200, 400, 0, 0, 60, 10, 40, 3000, 300, new Skill_CB()), //던전6 보스몹
				new Enemy("타노스", 5000, 5000, 0, 0, 300, 30, 30, 70, 3000, 300, new Skill_IV()), //던전7 보스몹
				new Enemy("미노타우르스", 10000, 0, 400, 0, 0, 80, 40, 20, 4000, 400, new Skill_AG()), //던전8 보스몹
				new Enemy("진명황단테스", 20000, 100, 500, 0, 0, 80, 100, 120, 10000, 2000, new Skill_CON(), new Skill_CB(), new Skill_AV(), new Skill_AG()) //던전9 보스몹
				
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
