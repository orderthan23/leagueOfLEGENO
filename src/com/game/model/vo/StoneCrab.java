package com.game.model.vo;

import java.util.Scanner;

public class StoneCrab extends Character5G {
	
	private Scanner scan = new Scanner(System.in);

	public StoneCrab() {
		super("���� ��", 200, 50000, 0, "�ʺ����� ��", "���� ���� �๰", "", "", "ġŲű", "ġŲ ��ġ");

	}

	public void cry() {

		System.out.println("���� �԰� ������ ������ �����մϴ�");

	}

	public void peck(User user) {
		System.out.println("���� �԰� ���������ϴ�.");
		user.hp -= super.getAttack();
		System.out.println(super.getAttack()+"�� �������� �޾ҽ��ϴ�");
		System.out.println("���� ���� ü�� :" + user.hp);
		System.out.println("���� ���� mp :"+user.mp);
	}

	public void lossHp(User user) {
		user.passive();

		
			while (!(super.getHp() <= 0)) {
				if (user.getHp()<=0) {
					System.out.println("�׾����ϴ� ");
					return;
				}

				System.out.println("1." + User.basicSkill);
				System.out.println("2." + user.spSkill1Name);
				System.out.println("3." + user.spSkill2Name);
				System.out.println("4." + user.spSkill3Name);
				System.out.println("5." + user.fSkillName);
				System.out.println("����� ������ �Է��Ͻÿ� ");
				int select = scan.nextInt();

				switch (select) {
				case 1:
					System.out.println("���� ���� ����� ������ hp��" + user.attack + "��ŭ �����մϴ�");
					super.setHp(super.getHp() - user.attack);

					break;
				case 2:
					System.out.println("���� ���� ����� ������ hp��" + user.spskill1dmg + "��ŭ �����մϴ�");
					super.setHp(super.getHp() - user.spSkill1());

					break;
				case 3:
					System.out.println("���� ���� ����� ������ hp��" + user.spskill2dmg + "��ŭ �����մϴ�");
					super.setHp(super.getHp() - user.spSkill2());
					break;

				case 4:
					System.out.println("���� ���� ����� ������ hp��" + user.spskill3dmg + "��ŭ �����մϴ�");
					super.setHp(super.getHp() - user.spSkill3());

					break;
				case 5:
					System.out.println("���� ���� ����� ������ hp��" + user.fskilldmg + "��ŭ �����մϴ�");
					super.setHp(super.getHp() - user.finaleSkill());

					break;

				}
				if (super.getHp() <= 0)	{
					System.out.println("���� �԰� �������ϴ� ");
					User.coin+=100;
					break;

				}
				

				System.out.println("���� ���� ���� ü�� :" + hp);

				peck(user);

			}
			if (super.getHp() <= 0)	{
				return;
				
			}
			if (user.getHp()<=0) {
				
				return;
			}

		}

}
