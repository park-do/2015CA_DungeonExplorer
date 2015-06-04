package de.characters;

import java.util.ArrayList;

import de.manager.WindowManager;
import de.skills.PassiveSkill;
import de.skills.Skill;
import de.windows.FightWindow;

public class Characters 
{
	String name;
	int hp;
	float hpRatio = 1;
	int damagedHp;
	int mp;
	float mpRatio = 1;
	int usedMp;
	
	int meleeAP;
	float meleeAPRatio = 1;
	int rangedAP;
	float rangedAPRatio = 1;
	int magicAP;
	float magicAPRatio = 1;
	int meleeGP;
	float meleeGPRatio = 1;
	int rangedGP;
	float rangedGPRatio = 1;
	int magicGP;
	float magicGPRatio = 1;
	
	ArrayList<Skill> skillList = new ArrayList<Skill>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHp() {
		return (int)(hp * hpRatio);
	}
	
	public int getNowHP()
	{
		return getMaxHp()-damagedHp;
	}
	
	public void Damaged(int damage)
	{
		damagedHp+=damage;
		if(damagedHp<0)damagedHp=0;
	}

	public int getDamagedhp() {
		return damagedHp;
	}

	public void setDamagedhp(int damagedhp) {
		this.damagedHp = damagedhp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}
	public int getNowMp() {
		return getMp()-getUsedMp();
	}
	public int getUsedMp() {
		return usedMp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}


	public int getMeleeAP() {
		return (int)(meleeAP*meleeAPRatio);
	}

	public int getRangedAP() {
		return (int)(rangedAP*rangedAPRatio);
	}

	public int getMagicAP() {
		return (int)(magicAP*magicAPRatio);
	}

	public int getMeleeGP() {
		return (int)(meleeGP*meleeGPRatio);
	}

	public int getRangedGP() {
		return (int)(rangedGP*rangedGPRatio);
	}

	public int getMagicGP() {
		return (int)(magicGP*magicGPRatio);
	}
	
	public void multipleHPRatio(float ratio)
	{
		hpRatio *= ratio;
	}
	
	public void multipleMPatio(float ratio)
	{
		mpRatio *= ratio;
	}
	
	public void multipleMeleeAPRatio(float ratio)
	{
		meleeAPRatio *= ratio;
	}
	
	public void multipleRangedAPRatio(float ratio)
	{
		rangedAPRatio *= ratio;
	}
	
	public void multipleMagicAPRatio(float ratio)
	{
		magicAPRatio *= ratio;
	}
	
	public void multipleMeleeGPRatio(float ratio)
	{
		meleeGPRatio *= ratio;
	}
	
	public void multipleRangedGPRatio(float ratio)
	{
		rangedGPRatio *= ratio;
	}
	
	public void multipleMagicGPRatio(float ratio)
	{
		magicGPRatio *= ratio;
	}

	public ArrayList<Skill> getSkillList() {
		return skillList;
	}

	public Characters()
	{
		
	}
	
	public Characters(String name, int hp, int mp,
			int meleeAP, int rangedAP, int magicAP, int meleeGP, int rangedGP,
			int magicGP) {
		super();
		this.name = name;
		this.hp = hp;
		this.damagedHp = 0;
		this.mp = mp;
		this.usedMp = 0;
		this.meleeAP = meleeAP;
		this.rangedAP = rangedAP;
		this.magicAP = magicAP;
		this.meleeGP = meleeGP;
		this.rangedGP = rangedGP;
		this.magicGP = magicGP;
	}

	public void AddSkill(Skill skill)
	{
		skillList.add(skill);
	}
	
	public void Attack(Characters target)
	{
		Attack(target,getMeleeAP(),getRangedAP(),getMagicAP());
	}
	
	public void Attack(Characters target, int melAP, int ranAP, int magAP)
	{	
		melAP -= target.getMeleeGP();
		ranAP -= target.getRangedGP();
		magAP -= target.getMagicGP();
		
		if(melAP<0)melAP = 0;
		if(ranAP<0)ranAP = 0;
		if(magAP<0)magAP = 0;
		
		int totalAttack = melAP+ranAP+magAP;

		target.Damaged(totalAttack);
		
		PrintMessage(name+"이(가) " +target.getName()+"에게 "+totalAttack+"데미지!");
	}
	
	
	
	public void Start()
	{
		//패시브 스킬들을 적용시킨다.
		for(Skill skill : skillList)
		{
			if(skill instanceof PassiveSkill)
			{
				skill.useSkill(this, this);
			}
		}
	}
	
	public void Update()
	{
		//스킬들을 업데이트 해준다.(버프, 디버프 등)
		for (Skill skill : skillList) {
			skill.Update(this);
		}
	}
	
	public void End()
	{
		//스킬들을 끝냄
		for (Skill skill : skillList)
		{
			skill.EndEffect(this);
		}
	}
	
	void PrintMessage(String msg)
	{
		((FightWindow)WindowManager.getInstance().getFrame(WindowManager.WindowID.FIGHT)).AddMessage(msg);
	}

	public void useMP(int usingMP) {
		usedMp+=usingMP;
	}
}
