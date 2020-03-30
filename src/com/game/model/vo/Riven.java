package com.game.model.vo;

public class Riven extends Character5G{

	public Riven() {
			
		super("리븐", 600, 3500, 0,"5성", "추방자의 검", "룬 검", "부러진 날개", "기 폭발", "용맹");
	
	}

	

	@Override
	public int finaleSkill() {
		// TODO Auto-generated method stub
		String talk = "저들을 응징할 시간이야\n";
		
		for(int i=0; i<talk.length(); i++) {
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(talk.charAt(i));
		}
		fskilldmg=attack*6;
		return fskilldmg;
		
	}

	@Override
	public int passive() {
		System.out.println("리븐의 패시브를 발동합니다 ");
		System.out.println("리븐은 마나를 사용하지 않습니다.");
		
		return 0;
		
	}

	@Override
	public int spSkill1() {
		System.out.println("리븐이 3연타로 공격합니다 ");
		spskill1dmg=attack*3;
		System.out.println(super.getAttack()*3+"만큼 데미지를 입혔습니다");
		
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		System.out.println("리븐이 기를 폭발합니다");
		spskill2dmg=attack+=attack/2;
		System.out.println(super.getAttack()+(super.getAttack()/2));
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println("리븐의 투지로 체력이 오히려 상승합니다");
		System.out.println("50 만큼 hp가 회복되었습니다");
		//왜이럴
		
		 hp+=50;
		spskill3dmg=0;
		return spskill3dmg;
		
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 리븐이 3연타로 공격함  기본공격력*3  마나소비량 0");
		System.out.println(super.getSpSkill2Name()+": 리븐이 기를 폭발함  기본공격력+기본공격력의 50%  마나소비량 0");
		System.out.println(super.getSpSkill3Name()+": 리븐이 hp를 50회복함  마나소비량 0");
		
	}

}
