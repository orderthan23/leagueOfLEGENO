package com.game.model.vo;

public class Atrox extends Character5G {
	
	
public Atrox() {
		
		super("��Ʈ�Ͻ�", 600, 5000, 400,"5��", "������ ������" , "��� �¼�", "�ٸ�Ų�� ��", "���� �罽", "�ĸ��� ����");
	
	}

	

	@Override
	public int finaleSkill() {
		if(mp>0) {
		System.out.println(super.getfSkillName()+"�� ����մϴ� �⺻���ݷ��� 3���� �������� �ݴϴ�");
		String talk = "������ ������!\n";
		
		for(int i=0; i<talk.length(); i++) {
			try {
				Thread.sleep(100L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(talk.charAt(i));
		}
		System.out.println("mp�� 200��ŭ �Ҹ�Ǿ����ϴ�");
		mp-=200;
		hp+=10000;
		fskilldmg=attack*3;
		
		}else {
			System.out.println("mp�� �����մϴ�");
			fskilldmg=0;
		}
		return fskilldmg;
		
	}

	@Override
	public int passive() {
		System.out.println(" �нú� "+super.getPassiveName()+"��(��) �ߵ� �Ǿ����ϴ� ");
		System.out.println("��Ʈ�Ͻ��� ��ų�� ��������  �Ǹ� ȸ���մϴ�");
		
		
		return 0;
	}

	@Override
	public int spSkill1() {
		if(mp>0) {
		
		mp-=40;
		System.out.println(super.getSpSkill1Name()+"�� ����մϴ� ");
		System.out.println("��Ʈ�Ͻ��� �������� �����Ͽ� ��������ϴ�");
		spskill1dmg=attack*2;
		hp+=spskill1dmg;
		System.out.println(spskill1dmg+"��ŭ ��Ʈ�Ͻ��� ü���� ȸ���߽��ϴ� ");
		System.out.println(spskill1dmg+"��ŭ �������� �־����ϴ�");
		}else {
			System.out.println("mp�� �����ϴ�");
			spskill1dmg=0;
		}
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		
		if(mp>0) {
		System.out.println(super.getSpSkill2Name()+"�� ����մϴ�");
		mp-=70;
		int num=(int)(Math.random()*10);
		
		System.out.println("��Ʈ�Ͻ��� �����Ͽ� �����մϴ�");
		if(num==0) {
		
			System.out.println("ũ��Ƽ�� �߻�!");
			
			spskill2dmg= attack*2;
			System.out.println(spskill2dmg+"��ŭ �������� �־����ϴ�");
			
			hp+=100;
		
		}else {
			spskill2dmg=attack+(attack/2);
			System.out.println(spskill2dmg+"��ŭ �������� �־����ϴ�");
			
			hp+=50;
			
		}
		}else {
			System.out.println("mp�� �����ϴ�");
			spskill2dmg=0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println("��Ʈ�Ͻ��� 500��ŭ ȸ���մϴ�");
		hp+=500;
		spskill3dmg=0;
		
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": �⺻���ݷ��� 2�赥����  ��������ŭ ü���� ȸ�� �����Һ� 40");
		System.out.println(super.getSpSkill2Name()+": 10�ۼ�Ʈ Ȯ���� ũ��Ƽ�� �߻��� 2�赥���� 100ȸ��  �̹ߵ��� 1.5�赥���� 50ȸ��");
		System.out.println(super.getSpSkill3Name()+": ü���� 500ȸ�� ");
		System.out.println(super.getfSkillName()+": 3�赥���� ü��10000ȸ��  mp 200�Ҹ�");
		
	}

}
