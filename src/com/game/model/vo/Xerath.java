package com.game.model.vo;

public class Xerath extends Character5G{
	
public Xerath() {
		
		super("����", 1000, 2000, 1000,"5��", "���� �ǽ�", "���� �⵵", "���� �ĵ�", "�ĸ��� ��", "��� ��ü");
	
		
	}

	
	

	@Override
	public int finaleSkill() {
		if (mp > 0) {
			System.out.println(fSkillName + "�� ����մϴ� �⺻���ݷ��� 8���� �������� �ݴϴ�");
			String talk = "���㸦 ������....\n";

			for (int i = 0; i < talk.length(); i++) {
				try {
					Thread.sleep(100L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(talk.charAt(i));
			}
			System.out.println("mp�� 200��ŭ �Ҹ�Ǿ����ϴ�");
			mp -= 200;
			fskilldmg=attack*6;
			return fskilldmg;
		} else {
			System.out.println("mp�� �����մϴ�");
			return 0;
		}
		
	}

	@Override
	public int passive() {
		System.out.println("���󽺴� ���ݷ��� 200�� ����մϴ�");
		attack+=200;
		return 0;
	}

	@Override
	public int spSkill1() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 2);
			
			mp -= 40;
			System.out.println(super.getSpSkill1Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� �⺻���ݷ¿� 4���� �������� �ݴϴ�");

				spskill1dmg= attack * 4;
			} else {
				System.out.println("�⺻���ݷ��� 400��ŭ �߰����ظ� �ݴϴ�");

				spskill1dmg= attack + 400;
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
			int critical = (int) (Math.random() * 10);
			
			mp -= 60;
			System.out.println(super.getSpSkill2Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� �⺻���ݷ¿� 10���� �������� �ݴϴ�");

				spskill2dmg= attack * 10;
			} else {
				System.out.println("�⺻���ݷ��� 600��ŭ �߰����ظ� �ݴϴ�");

				spskill2dmg= attack + 600;
			}
		} else {
			System.out.println("mp�� �����մϴ�");
			spskill2dmg= 0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		System.out.println( super.getSpSkill3Name() + "�� ����մϴ�");
		System.out.println("���󽺰� ������ 600 ȸ���մϴ�");
		mp +=600;
		spskill3dmg=0;
		return spskill3dmg;
	}
	
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+":50���� Ȯ�� ũ��Ƽ�� �ߵ��� 4�赥���� �̹ߵ��� �⺻���ݷ�+600 �����Ҹ� 40");
		System.out.println(super.getSpSkill2Name()+":10���� Ȯ�� ũ��Ƽ�� �ߵ��� 10�赥���� �̹ߵ��� �⺻���ݷ�+600 �����Ҹ� 60");
		System.out.println(super.getSpSkill3Name()+":���� 600ȸ��  ");
		System.out.println(super.getfSkillName()+": ���ݷ��� 8�� �������� �� �����Һ� 200");
		
	}


}
