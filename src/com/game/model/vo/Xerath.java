package com.game.model.vo;

public class Xerath extends Character5G{
	
public Xerath() {
		
		super("제라스", 1000, 2000, 1000,"5성", "비전 의식", "마나 쇄도", "비전 파동", "파멸의 눈", "충격 구체");
	
		
	}

	
	

	@Override
	public int finaleSkill() {
		if (mp > 0) {
			System.out.println(fSkillName + "을 사용합니다 기본공격력의 8배의 데미지를 줍니다");
			String talk = "공허를 느껴라....\n";

			for (int i = 0; i < talk.length(); i++) {
				try {
					Thread.sleep(100L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(talk.charAt(i));
			}
			System.out.println("mp가 200만큼 소모되었습니다");
			mp -= 200;
			fskilldmg=attack*6;
			return fskilldmg;
		} else {
			System.out.println("mp가 부족합니다");
			return 0;
		}
		
	}

	@Override
	public int passive() {
		System.out.println("제라스는 공격력이 200더 상승합니다");
		attack+=200;
		return 0;
	}

	@Override
	public int spSkill1() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 2);
			
			mp -= 40;
			System.out.println(super.getSpSkill1Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 기본공격력에 4배의 데미지를 줍니다");

				spskill1dmg= attack * 4;
			} else {
				System.out.println("기본공격력의 400만큼 추가피해를 줍니다");

				spskill1dmg= attack + 400;
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
			int critical = (int) (Math.random() * 10);
			
			mp -= 60;
			System.out.println(super.getSpSkill2Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 기본공격력에 10배의 데미지를 줍니다");

				spskill2dmg= attack * 10;
			} else {
				System.out.println("기본공격력의 600만큼 추가피해를 줍니다");

				spskill2dmg= attack + 600;
			}
		} else {
			System.out.println("mp가 부족합니다");
			spskill2dmg= 0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println( super.getSpSkill3Name() + "을 사용합니다");
		System.out.println("제라스가 마나를 600 회복합니다");
		mp +=600;
		spskill3dmg=0;
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+":50프로 확률 크리티컬 발동시 4배데미지 미발동시 기본공격력+600 마나소모 40");
		System.out.println(super.getSpSkill2Name()+":10프로 확률 크리티컬 발동시 10배데미지 미발동시 기본공격력+600 마나소모 60");
		System.out.println(super.getSpSkill3Name()+":마나 600회복  ");
		System.out.println(super.getfSkillName()+": 공격력의 8배 데미지를 줌 마나소비량 200");
		
	}


}
