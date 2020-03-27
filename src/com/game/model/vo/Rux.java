package com.game.model.vo;

public class Rux extends Character5G {
	private static int count = 0;

	public Rux() {

		super("����", 800, 2000, 800, "5��", "������ ����", "��ü", "���� �ӹ�", "������ Ư����", "������ ��ȣ��");

	}

	@Override
	public int finaleSkill() {
		if (mp > 0) {
			System.out.println(fSkillName + "�� ����մϴ� �⺻���ݷ��� 4���� �������� �ݴϴ�");
			String talk = "�׸��ڸ� �Ⱦ� ���ھ��!\n";

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
			fskilldmg=attack*4;
			return fskilldmg;
		} else {
			System.out.println("mp�� �����մϴ�");
			return 0;
		}

	}

	@Override
	public int passive() {
		
			System.out.println(" �нú� " + super.getPassiveName() + "��(��) �ߵ� �Ǿ����ϴ� ");
			System.out.println("������ 400��ŭ�� mp�� �߰��� ȹ���մϴ�");
			
			mp +=400;
			return 0;
		
	}

	@Override
	public int spSkill1() {
		if (mp > 0) {
			int critical = (int) (Math.random() * 5);
			count++;
			mp -= 80;
			System.out.println(super.getSpSkill1Name() + "�� ����մϴ� ");
			if (critical == 0) {
				System.out.println("ũ��Ƽ���� �ߵ��Ǿ����ϴ� �⺻���ݷ¿� 2���� �������� �ݴϴ�");

				spskill1dmg= attack * 2;
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
		if(mp>0) {
		System.out.println("������  " + super.getSpSkill2Name() + "�� ����մϴ�");
		mp -= 70;
		if (count == 1) {
			System.out.println("1�� ��ų�� �����߱� ������ �߰��������� �ݴϴ�");
			System.out.println(super.getAttack() * 2 + "��ŭ �������� �־����ϴ�");

			count--;
			spskill2dmg=attack*2;
			
		} else {
			System.out.println(super.getAttack() + (super.getAttack() / 2) + "��ŭ �������� �־����ϴ�");

			spskill2dmg= attack + (attack / 2);
		}
		}else {
			System.out.println("mp�� �����մϴ�");
			spskill2dmg=0;
		}
		return spskill2dmg;
	}

	@Override
	public int spSkill3() {
		if(mp>getHp()/20) {
		System.out.println("������  " + super.getSpSkill3Name() + "�� ����մϴ�");
		System.out.println("������ ����ü���� 20�ۼ�Ʈ ��ŭ mp�� ü���� ȸ���մϴ�");
		mp -= (hp / 20);
		hp += (hp / 20);

		return 0;
	}
		else {
			System.out.println("mp�� �����մϴ�");
			return 0;
			}
		}
	@Override
	public void skillInfo() {
		System.out.println(super.getSpSkill1Name()+": 20%Ȯ���� ũ��Ƽ�� �ߵ� �� ���ݷ��� 2�� �̹ߵ��� �⺻���ݷ�+200 �����Һ� 80");
		System.out.println(super.getSpSkill2Name()+": 1����ų ���߽� �߰������� �ߵ� ���ݷ�*2 �̹ߵ��� ���ݷ���1.5�� �����Һ� 70");
		System.out.println(super.getSpSkill3Name()+": ����ü���� 20�ۼ�Ʈ��ŭ mp�� ü���� ȸ���� ");
		System.out.println(super.getfSkillName()+": ���ݷ��� 4�� �������� �� �����Һ� 100");
		
	}

}
