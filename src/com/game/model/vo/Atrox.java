package com.game.model.vo;

public class Atrox extends Character5G {
	
	
public Atrox() {
		
		super("아트록스", 600, 5000, 400,"5성", "세계의 종결자" , "사신 태세", "다르킨의 검", "지옥 사슬", "파멸의 돌진");
	
	}

	

	@Override
	public int finaleSkill() {
		if(mp>0) {
		System.out.println(super.getfSkillName()+"을 사용합니다 기본공격력의 3배의 데미지를 줍니다");
		String talk = "공포를 느껴라!\n";
		
		for(int i=0; i<talk.length(); i++) {
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(talk.charAt(i));
		}
		System.out.println("mp가 200만큼 소모되었습니다");
		mp-=200;
		hp+=10000;
		fskilldmg=attack*3;
		
		}else {
			System.out.println("mp가 부족합니다");
			fskilldmg=0;
		}
		return fskilldmg;
		
	}

	@Override
	public int passive() {
		System.out.println(" 패시브 "+super.getPassiveName()+"이(가) 발동 되었습니다 ");
		System.out.println("아트록스는 스킬을 쓸때마다  피를 회복합니다");
		
		
		return 0;
	}

	@Override
	public int spSkill1() {
		if(mp>0) {
		
		mp-=40;
		System.out.println(super.getSpSkill1Name()+"을 사용합니다 ");
		System.out.println("아트록스가 공중으로 도약하여 내려찍습니다");
		spskill1dmg=attack*2;
		hp+=spskill1dmg;
		System.out.println(spskill1dmg+"만큼 아트록스가 체력을 회복했습니다 ");
		System.out.println(spskill1dmg+"만큼 데미지를 주었습니다");
		}else {
			System.out.println("mp가 없습니다");
			spskill1dmg=0;
		}
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		
		if(mp>0) {
		System.out.println(super.getSpSkill2Name()+"을 사용합니다");
		mp-=70;
		int num=(int)(Math.random()*10);
		
		System.out.println("아트록스가 변신하여 돌격합니다");
		if(num==0) {
		
			System.out.println("크리티컬 발생!");
			
			spskill2dmg= attack*2;
			System.out.println(spskill2dmg+"만큼 데미지를 주었습니다");
			
			hp+=100;
		
		}else {
			spskill2dmg=attack+(attack/2);
			System.out.println(spskill2dmg+"만큼 데미지를 주었습니다");
			
			hp+=50;
			
		}
		}else {
			System.out.println("mp가 없습니다");
			spskill2dmg=0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println("아트록스가 500만큼 회복합니다");
		hp+=500;
		spskill3dmg=0;
		
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 기본공격력의 2배데미지  데미지만큼 체력을 회복 마나소비 40");
		System.out.println(super.getSpSkill2Name()+": 10퍼센트 확률로 크리티컬 발생시 2배데미지 100회복  미발동시 1.5배데미지 50회복");
		System.out.println(super.getSpSkill3Name()+": 체력을 500회복 ");
		System.out.println(super.getfSkillName()+": 3배데미지 체력10000회복  mp 200소모");
		
	}

}
