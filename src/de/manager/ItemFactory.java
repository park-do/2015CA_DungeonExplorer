package de.manager;

import java.util.ArrayList;
import java.util.Hashtable;

import de.item.Armor;
import de.item.Armor.EquipType;
import de.item.Item;
import de.item.Item.ClassType;
import de.item.Weapon;

public class ItemFactory {
	private static ItemFactory instance;
	
	public static ItemFactory getInstance()
	{
		if(instance==null)
		{
			instance = new ItemFactory();
		}
		return instance;
	}
	
	Hashtable<String,Item> itemMap;
	
	private ItemFactory()
	{
		Init();
	}
	
	public String[] getBuyItems()
	{
		ClassType classType = PlayerManager.getInstance().getPlayer().getClassType();
		ArrayList<String> items = new ArrayList<String>();
		String[] keys = (String[]) itemMap.keySet().toArray(new String[itemMap.size()]);
		for(int i=0;i<keys.length;i++)
		{
			Item item = itemMap.get(keys[i]);
			if(item.getClassType()==ClassType.All || item.getClassType() == classType)items.add(itemMap.get(keys[i]).getName());
			
		}
		return items.toArray(new String[items.size()]);
	}
	
	public String[] getSellItems() 
	{
		ArrayList<String> items = new ArrayList<String>();
		Item[] playerItems = PlayerManager.getInstance().getPlayer().bringItem.toArray(new Item[PlayerManager.getInstance().getPlayer().bringItem.size()]);
		for(int i=0;i<playerItems.length;i++)
		{
			items.add(playerItems[i].getName());
		}
		return items.toArray(new String[items.size()]);
	}
	
	private void Init()
	{
		itemMap = new Hashtable<String, Item>();
		Item[] items = {
			//무기: "이름", 착용직업, 가격, 근공, 원공, 마공
			new Weapon("진명황의 집행검", ClassType.Knight, 50000, 200, 0, 0),
			new Weapon("드래곤 슬레이어", ClassType.Knight, 20000, 150, 0, 0),
			new Weapon("피의 분노", ClassType.Knight, 5000, 80, 0, 0),
			new Weapon("대검", ClassType.Knight, 500, 20, 0, 0),
			new Weapon("데스나이트의 검", ClassType.Knight, 50000, 150, 0, 0),
			new Weapon("어둠의 칼날", ClassType.Knight, 20000, 120, 0, 0),
			new Weapon("영웅의 장검", ClassType.Knight, 5000, 100, 0, 0),
			new Weapon("뇌신검", ClassType.Knight, 2000, 50, 0, 0),
			new Weapon("은장검", ClassType.Knight, 500, 10, 0, 0),
			
			new Weapon("토르의 외침", ClassType.Warrior, 50000, 200, 0, 0),
			new Weapon("오우거의 도끼", ClassType.Warrior, 20000, 160, 0, 0),
			new Weapon("데몬 액스", ClassType.Warrior, 5000, 80, 0, 0),
			new Weapon("대형 도끼", ClassType.Warrior, 500, 40, 0, 0),
			new Weapon("얼음 여왕의 창", ClassType.Warrior, 50000, 200, 0, 0),
			new Weapon("크림슨 랜스", ClassType.Warrior, 20000, 120, 0, 0),
			new Weapon("에틴의 흉기", ClassType.Warrior, 5000, 70, 0, 0),
			new Weapon("장창", ClassType.Warrior, 500, 30, 0, 0),
			
			new Weapon("엘프의 바람", ClassType.Elf, 50000, 0, 250, 0),
			new Weapon("복수의 칼날", ClassType.Elf, 20000, 0, 200, 0),
			new Weapon("악운의 단검", ClassType.Elf, 5000, 0, 100, 0),
			new Weapon("미스릴 단검", ClassType.Elf, 500, 0, 50, 0),
			new Weapon("악몽의 장궁", ClassType.Elf, 50000, 0, 250, 0),
			new Weapon("파괴의 장궁", ClassType.Elf, 20000, 0, 150, 0),
			new Weapon("달의 석궁", ClassType.Elf, 5000, 0, 100, 0),
			new Weapon("요정의 활", ClassType.Elf, 500, 0, 50, 0),
			
			new Weapon("수정 결정체 지팡이", ClassType.Magician, 50000, 0, 0, 300),
			new Weapon("사신의 지팡이", ClassType.Magician, 20000, 0, 0, 220),
			new Weapon("네크로맨서의 지팡이", ClassType.Magician, 5000, 0, 0, 150),
			new Weapon("마법사의 지팡이", ClassType.Magician, 500, 0, 0, 70),
			new Weapon("대마법사의 오브", ClassType.Magician, 50000, 0, 0, 300),
			new Weapon("타락의 오브", ClassType.Magician, 20000, 0, 0, 230),
			new Weapon("불꽃의 오브", ClassType.Magician, 5000, 0, 0, 150),
			new Weapon("낡은 오브", ClassType.Magician, 500, 0, 0, 60),
			
			//무기: "이름", 착용직업, 착용부위, 가격, 근방, 원방, 마방
			new Armor("강철 투구", ClassType.Warrior, EquipType.Helmet, 10000, 30, 10, 5),
			new Armor("지휘관 투구", ClassType.Warrior, EquipType.Helmet, 3000, 20, 7, 3),
			new Armor("전사단 투구", ClassType.Warrior, EquipType.Helmet, 300, 10, 3, 1),
			new Armor("진명황의 면갑", ClassType.Knight, EquipType.Helmet, 10000, 20, 10, 10),
			new Armor("기사의 면갑", ClassType.Knight, EquipType.Helmet, 3000, 10, 7, 7),
			new Armor("난쟁이 투구", ClassType.Knight, EquipType.Helmet, 300, 5, 3, 3),
			new Armor("요정의 축복", ClassType.Elf, EquipType.Helmet, 10000, 10, 20, 20),
			new Armor("요정족 투구", ClassType.Elf, EquipType.Helmet, 3000, 7, 10, 10),
			new Armor("그림자 가면", ClassType.Elf, EquipType.Helmet, 300, 3, 5, 5),
			new Armor("대마법사 모자", ClassType.Magician, EquipType.Helmet, 10000, 10, 10, 30),
			new Armor("흑마법사 모자", ClassType.Magician, EquipType.Helmet, 3000, 7, 7, 20),
			new Armor("마법사 모자", ClassType.Magician, EquipType.Helmet, 300, 3, 3, 10),
			
			new Armor("드레이크의 가호", ClassType.Warrior, EquipType.Chest, 10000, 30, 10, 5),
			new Armor("고대 판금 갑옷", ClassType.Warrior, EquipType.Chest, 3000, 20, 7, 3),
			new Armor("강철 갑옷", ClassType.Warrior, EquipType.Chest, 300, 10, 3, 1),
			new Armor("데몬의 의지", ClassType.Knight, EquipType.Chest, 10000, 20, 10, 10),
			new Armor("다크엘프 사슬 갑옷", ClassType.Knight, EquipType.Chest, 3000, 10, 7, 7),
			new Armor("기사단 갑옷", ClassType.Knight, EquipType.Chest, 300, 5, 3, 3),
			new Armor("엔디아스의 수호", ClassType.Elf, EquipType.Chest, 10000, 10, 20, 20),
			new Armor("요정족 갑옷", ClassType.Elf, EquipType.Chest, 3000, 7, 10, 10),
			new Armor("난쟁이 갑옷", ClassType.Elf, EquipType.Chest, 300, 3, 5, 5),
			new Armor("타락 로브", ClassType.Magician, EquipType.Chest, 10000, 10, 10, 30),
			new Armor("흑장로 로브", ClassType.Magician, EquipType.Chest, 3000, 7, 7, 20),
			new Armor("무명 로브", ClassType.Magician, EquipType.Chest, 300, 3, 3, 10),
			
			new Armor("비룡의 저주", ClassType.Warrior, EquipType.Globe, 5000, 30, 10, 5),
			new Armor("파워 글러브", ClassType.Warrior, EquipType.Globe, 1000, 20, 7, 3),
			new Armor("돌장갑", ClassType.Knight, EquipType.Globe, 5000, 20, 10, 10),
			new Armor("오크의 장갑", ClassType.Knight, EquipType.Globe, 1000, 10, 7, 7),
			new Armor("혼돈의 손톱", ClassType.Elf, EquipType.Globe, 5000, 10, 20, 20),
			new Armor("저격수의 장갑", ClassType.Elf, EquipType.Globe, 1000, 7, 10, 10),
			new Armor("마력의 증거", ClassType.Magician, EquipType.Globe, 5000, 10, 10, 30),
			new Armor("장로의 손길", ClassType.Magician, EquipType.Globe, 1000, 7, 7, 20),
			
			new Armor("얼음여왕의 슬리퍼", ClassType.Warrior, EquipType.Shoes, 5000, 30, 10, 5),
			new Armor("트롤의 신발", ClassType.Warrior, EquipType.Shoes, 1000, 20, 7, 3),
			new Armor("데몬의 발톱", ClassType.Knight, EquipType.Shoes, 5000, 20, 10, 10),
			new Armor("기사단 부츠", ClassType.Knight, EquipType.Shoes, 1000, 10, 7, 7),
			new Armor("풍령의 신속", ClassType.Elf, EquipType.Shoes, 5000, 10, 20, 20),
			new Armor("난쟁이 신발", ClassType.Elf, EquipType.Shoes, 1000, 7, 10, 10),
			new Armor("올딘의 발자국", ClassType.Magician, EquipType.Shoes, 5000, 10, 10, 30),
			new Armor("오크족 덧신", ClassType.Magician, EquipType.Shoes, 1000, 7, 7, 20),
			
			new Armor("반역자의 방패", ClassType.Knight, EquipType.Shoes, 3000, 20, 10, 10),
			new Armor("반사 방패", ClassType.Knight, EquipType.Shoes, 1000, 10, 7, 7),
			new Armor("명궁의 가더", ClassType.Elf, EquipType.Shoes, 3000, 10, 20, 20),
			new Armor("요정족 가더", ClassType.Elf, EquipType.Shoes, 1000, 7, 10, 10),
			new Armor("사신의 심안", ClassType.Magician, EquipType.Shoes, 3000, 10, 10, 30),
			new Armor("마력서", ClassType.Magician, EquipType.Shoes, 1000, 7, 7, 20),			
						
		};
		
		for (Item item : items) 
		{
			itemMap.put(item.getName(), item);
		}
	}
	
	public Item getItem(String str)
	{
		return itemMap.get(str);
	}

	
}
