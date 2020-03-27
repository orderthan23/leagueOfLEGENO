package com.game.model.vo;

public abstract class User {

	protected String name;
	protected int attack;
	protected int hp;
	protected int mp;
	protected String grade;
	protected String fSkillName;
	protected String PassiveName;
	protected String spSkill1Name;
	protected String spSkill2Name;
	protected String spSkill3Name;
	protected int spskill1dmg;
	protected int spskill2dmg;
	protected int spskill3dmg;
	protected int fskilldmg;
	public static final String basicSkill="평타";
	public static int count=0;
	public static int coin =300;
	

	public User(String name, int attack, int hp, int mp, String grade, String fSkillName, String passiveName,
			String spSkill1Name, String spSkill2Name, String spSkill3Name) {
		super();
		this.name = name;
		this.attack = attack;
		this.hp = hp;
		this.mp = mp;
		this.grade = grade;
		this.fSkillName = fSkillName;
		PassiveName = passiveName;
		this.spSkill1Name = spSkill1Name;
		this.spSkill2Name = spSkill2Name;
		this.spSkill3Name = spSkill3Name;
		
	}

	public int getSpskill1dmg() {
		return spskill1dmg;
	}

	public void setSpskill1dmg(int spskill1dmg) {
		this.spskill1dmg = spskill1dmg;
	}

	public int getSpskill2dmg() {
		return spskill2dmg;
	}

	public void setSpskill2dmg(int spskill2dmg) {
		this.spskill2dmg = spskill2dmg;
	}

	public int getSpskill3dmg() {
		return spskill3dmg;
	}

	public void setSpskill3dmg(int spskill3dmg) {
		this.spskill3dmg = spskill3dmg;
	}

	public int getFskilldmg() {
		return fskilldmg;
	}

	public void setFskilldmg(int fskilldmg) {
		this.fskilldmg = fskilldmg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getfSkillName() {
		return fSkillName;
	}

	public void setfSkillName(String fSkillName) {
		this.fSkillName = fSkillName;
	}

	public String getPassiveName() {
		return PassiveName;
	}

	public void setPassiveName(String passiveName) {
		PassiveName = passiveName;
	}

	public String getSpSkill1Name() {
		return spSkill1Name;
	}

	public void setSpSkill1Name(String spSkill1Name) {
		this.spSkill1Name = spSkill1Name;
	}

	public String getSpSkill2Name() {
		return spSkill2Name;
	}

	public void setSpSkill2Name(String spSkill2Name) {
		this.spSkill2Name = spSkill2Name;
	}

	public String getSpSkill3Name() {
		return spSkill3Name;
	}

	public void setSpSkill3Name(String spSkill3Name) {
		this.spSkill3Name = spSkill3Name;
	}

	public static String getBasicskill() {
		return basicSkill;
	}

	public  int basicSkill() {
		System.out.println("평타가 적중하여 "+attack+"만큼의 데미지를 줍니다");
		return attack;
	}

	public abstract int finaleSkill();

	public abstract int passive();
	
	public abstract int spSkill1(); 
	
	public abstract int spSkill2(); 
		
	public abstract int spSkill3();

	@Override
	public String toString() {
		return  "캐릭터 :"+name + "\n 공격력 : " + attack + "\t hp :" + hp + "\t mp :" + mp + "\t 등급 :" + grade
				+ "\n 궁극기 :" + fSkillName + "\n 패시브 :" + PassiveName + "\n 스킬 1 :" + spSkill1Name
				+ "\n 스킬 2 :" + spSkill2Name + "\n 스킬 3 :" + spSkill3Name;
	}
	
	
	public abstract void skillInfo();
	
	
	
	
	
}

