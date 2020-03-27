package com.game.model.vo;

public class Ash extends Character5G {
	
public Ash() {
		
		super("애쉬", 400, 2000, 400,"1성", "마법의 수정 화살", "서리 화살", "궁사의 집중", "일제 사격", "매 날리기");
	
	}

	

	@Override
	public int  finaleSkill() {
		if(mp>0) {
			System.out.println(super.getfSkillName()+"을 사용합니다 기본공격력의 4배의 데미지를 줍니다");
			String talk = "모두다 얼려 주겠어 ! 하지만 얼려지는건 나였다....\n";
			
			for(int i=0; i<talk.length(); i++) {
				try {
					Thread.sleep(100L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(talk.charAt(i));
			}
			System.out.println("mp가 100만큼 소모되었습니다");
			mp-=100;
			fskilldmg=attack;
			}else {
				System.out.println("mp가 부족합니다");
				fskilldmg=0;
			}
			return fskilldmg;
		
		
	}

	@Override
	public int passive() {
		System.out.println("애쉬는 기본 캐릭터이기 때문에 약합니다. 쌔지고싶으면 과금을 하세요");
		return 0;
	}

	@Override
	public int spSkill1() {
		
		if (mp > 0) {
			int critical = (int) (Math.random() * 100);
			
			mp -= 40;
			System.out.println(super.getSpSkill1Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 100000의 데미지를 줍니다");

				spskill1dmg= 100000;
			} else {
				System.out.println("기본공격력의 200만큼 추가피해를 줍니다");

				spskill1dmg= attack + 200;
			}
		} else {
			System.out.println("mp가 부족합니다");
			spskill1dmg= 0;
		}
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 200);
			
			mp -= 40;
			System.out.println(super.getSpSkill2Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 200000의 데미지를 줍니다");

				spskill2dmg= 200000;
			} else {
				System.out.println("기본공격력의 200만큼 추가피해를 줍니다");

				spskill2dmg= attack + 200;
			}
		} else {
			System.out.println("mp가 부족합니다");
			spskill2dmg= 0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		
		if (mp > 0) {
			int critical = (int) (Math.random() * 50);
			
			mp -= 40;
			System.out.println(super.getSpSkill3Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 200000의 체력을 회복해 줍니다");

				hp+= 200000;
				spskill3dmg=attack+400;
			} else {
				System.out.println("기본공격력의 200만큼 추가피해를 줍니다");

				spskill3dmg= attack + 200;
			}
		} else {
			System.out.println("mp가 부족합니다");
			spskill3dmg= 0;
		}
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 1프로의 확률로 10만데미지 미발동시 공격력+200 마나40소비");
		System.out.println(super.getSpSkill2Name()+": 0.5프로의 확률로 20만데미지 미발동시 공격력+200 마나 40소비");
		System.out.println(super.getSpSkill3Name()+": 2프로의 확률로 체력이 200000증가하면서 공격력+400 미발동시 공격력+200 마나소비 40");
		System.out.println(super.getfSkillName()+": 기본데미지 마나소비100");
		
	}


}
