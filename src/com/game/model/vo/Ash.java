package com.game.model.vo;

public class Ash extends Character5G {
	
public Ash() {
		
		super("�ֽ�", 400, 2000, 400,"1��", "������ ���� ȭ��", "���� ȭ��", "�û��� ����", "���� ���", "�� ������");
	
	}

	

	@Override
	public int  finaleSkill() {
		if(mp>0) {
			System.out.println(super.getfSkillName()+"�� ����մϴ� �⺻���ݷ��� 4���� �������� �ݴϴ�");
			String talk = "��δ� ��� �ְھ� ! ������ ������°� ������....\n";
			
			for(int i=0; i<talk.length(); i++) {
				try {
					Thread.sleep(100L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(talk.charAt(i));
			}
			System.out.println("mp�� 100��ŭ �Ҹ�Ǿ����ϴ�");
			mp-=100;
			fskilldmg=attack;
			}else {
				System.out.println("mp�� �����մϴ�");
				fskilldmg=0;
			}
			return fskilldmg;
		
		
	}

	@Override
	public int passive() {
		System.out.println("�ֽ��� �⺻ ĳ�����̱� ������ ���մϴ�. ����������� ������ �ϼ���");
		return 0;
	}

	@Override
	public int spSkill1() {
		
		if (mp > 0) {
			int critical = (int) (Math.random() * 100);
			
			mp -= 40;
			System.out.println(super.getSpSkill1Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� 100000�� �������� �ݴϴ�");

				spskill1dmg= 100000;
			} else {
				System.out.println("�⺻���ݷ��� 200��ŭ �߰����ظ� �ݴϴ�");

				spskill1dmg= attack + 200;
			}
		} else {
			System.out.println("mp�� �����մϴ�");
			spskill1dmg= 0;
		}
		return spskill1dmg;
	}

	@Override
	public int spSkill2() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 200);
			
			mp -= 40;
			System.out.println(super.getSpSkill2Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� 200000�� �������� �ݴϴ�");

				spskill2dmg= 200000;
			} else {
				System.out.println("�⺻���ݷ��� 200��ŭ �߰����ظ� �ݴϴ�");

				spskill2dmg= attack + 200;
			}
		} else {
			System.out.println("mp�� �����մϴ�");
			spskill2dmg= 0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		
		if (mp > 0) {
			int critical = (int) (Math.random() * 50);
			
			mp -= 40;
			System.out.println(super.getSpSkill3Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� 200000�� ü���� ȸ���� �ݴϴ�");

				hp+= 200000;
				spskill3dmg=attack+400;
			} else {
				System.out.println("�⺻���ݷ��� 200��ŭ �߰����ظ� �ݴϴ�");

				spskill3dmg= attack + 200;
			}
		} else {
			System.out.println("mp�� �����մϴ�");
			spskill3dmg= 0;
		}
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 1������ Ȯ���� 10�������� �̹ߵ��� ���ݷ�+200 ����40�Һ�");
		System.out.println(super.getSpSkill2Name()+": 0.5������ Ȯ���� 20�������� �̹ߵ��� ���ݷ�+200 ���� 40�Һ�");
		System.out.println(super.getSpSkill3Name()+": 2������ Ȯ���� ü���� 200000�����ϸ鼭 ���ݷ�+400 �̹ߵ��� ���ݷ�+200 �����Һ� 40");
		System.out.println(super.getfSkillName()+": �⺻������ �����Һ�100");
		
	}


}
