package com.game.model.vo;

public class Riven extends Character5G{

	public Riven() {
			
		super("����", 600, 3500, 0,"5��", "�߹����� ��", "�� ��", "�η��� ����", "�� ����", "���");
	
	}

	

	@Override
	public int finaleSkill() {
		// TODO Auto-generated method stub
		String talk = "������ ��¡�� �ð��̾�\n";
		
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
		System.out.println("������ �нú긦 �ߵ��մϴ� ");
		System.out.println("������ ������ ������� �ʽ��ϴ�.");
		
		return 0;
		
	}

	@Override
	public int spSkill1() {
		System.out.println("������ 3��Ÿ�� �����մϴ� ");
		spskill1dmg=attack*3;
		System.out.println(super.getAttack()*3+"��ŭ �������� �������ϴ�");
		
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		System.out.println("������ �⸦ �����մϴ�");
		spskill2dmg=attack+=attack/2;
		System.out.println(super.getAttack()+(super.getAttack()/2));
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println("������ ������ ü���� ������ ����մϴ�");
		System.out.println("50 ��ŭ hp�� ȸ���Ǿ����ϴ�");
		//���̷�
		
		 hp+=50;
		spskill3dmg=0;
		return spskill3dmg;
		
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": ������ 3��Ÿ�� ������  �⺻���ݷ�*3  �����Һ� 0");
		System.out.println(super.getSpSkill2Name()+": ������ �⸦ ������  �⺻���ݷ�+�⺻���ݷ��� 50%  �����Һ� 0");
		System.out.println(super.getSpSkill3Name()+": ������ hp�� 50ȸ����  �����Һ� 0");
		
	}

}
