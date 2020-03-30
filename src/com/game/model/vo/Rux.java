package com.game.model.vo;

public class Rux extends Character5G {
	private static int count = 0;

	public Rux() {

		super("럭스", 800, 2000, 800, "5성", "최후의 섬광", "광체", "빛의 속박", "광휘의 특이점", "프리즘 보호막");

	}

	@Override
	public int finaleSkill() {
		if (mp > 0) {
			System.out.println(fSkillName + "을 사용합니다 기본공격력의 4배의 데미지를 줍니다");
			String talk = "그림자를 걷어 내겠어요!\n";

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
			fskilldmg=attack*4;
			return fskilldmg;
		} else {
			System.out.println("mp가 부족합니다");
			return 0;
		}

	}

	@Override
	public int passive() {
		
			System.out.println(" 패시브 " + super.getPassiveName() + "이(가) 발동 되었습니다 ");
			System.out.println("럭스는 400만큼의 mp를 추가로 획득합니다");
			
			mp +=400;
			return 0;
		
	}

	@Override
	public int spSkill1() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 5);
			count++;
			mp -= 80;
			System.out.println(super.getSpSkill1Name() + "을 사용합니다 ");
			if (critical == 0) {
				System.out.println("크리티컬이 발동되었습니다 기본공격력에 2배의 데미지를 줍니다");

				spskill1dmg= attack * 2;
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
		if(mp>0) {
		System.out.println("럭스가  " + super.getSpSkill2Name() + "을 사용합니다");
		mp -= 70;
		if (count == 1) {
			System.out.println("1번 스킬을 적중했기 때문에 추가데미지를 줍니다");
			System.out.println(super.getAttack() * 2 + "만큼 데미지를 주었습니다");

			count--;
			spskill2dmg=attack*2;
			
		} else {
			System.out.println(super.getAttack() + (super.getAttack() / 2) + "만큼 데미지를 주었습니다");

			spskill2dmg= attack + (attack / 2);
		}
		}else {
			System.out.println("mp가 부족합니다");
			spskill2dmg=0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		if(mp>getHp()/20) {
		System.out.println("럭스가  " + super.getSpSkill3Name() + "을 사용합니다");
		System.out.println("럭스는 남은체력의 20퍼센트 만큼 mp로 체력을 회복합니다");
		mp -= (hp / 20);
		hp += (hp / 20);

		return 0;
	}
		else {
			System.out.println("mp가 부족합니다");
			return 0;
			}
		}
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 20%확률로 크리티컬 발동 시 공격력의 2배 미발동시 기본공격력+200 마나소비량 80");
		System.out.println(super.getSpSkill2Name()+": 1번스킬 적중시 추가데미지 발동 공격력*2 미발동시 공격력의1.5배 마나소비량 70");
		System.out.println(super.getSpSkill3Name()+": 남은체력의 20퍼센트만큼 mp로 체력을 회복함 ");
		System.out.println(super.getfSkillName()+": 공격력의 4배 데미지를 줌 마나소비량 100");
		
	}

}
