package com.game.model.vo;

import java.util.Scanner;

public class Dragon extends Character5G {

	private Scanner scan = new Scanner(System.in);

	public Dragon() {
		super("��� �巡��", 600, 15000, 0, "��� �巡��", "��� �巡���� �๰", "", "", "ġŲű", "ġŲ ��ġ");

	}

	public void cry() {

		System.out.println("��� �巡�ﰡ ������ ������ �����մϴ�");

	}

	public void peck(User user) {
		System.out.println("��� �巡�ﰡ ���������ϴ�.");
		user.hp -= super.getAttack();
		System.out.println(super.getAttack() + "�� �������� �޾ҽ��ϴ�");
		System.out.println("���� ���� ü�� :" + user.hp);
		System.out.println("���� ���� mp :" + user.mp);
	}

	public void lossHp(User user) {

		user.passive();

		while (true) {
			if (user.getHp() <= 0) {
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
				System.out.println("��� �巡���� ����� ������ hp��" + user.attack + "��ŭ �����մϴ�");
				super.setHp(super.getHp() - user.attack);

				break;
			case 2:
				System.out.println("��� �巡���� ����� ������ hp��" + user.spskill1dmg + "��ŭ �����մϴ�");
				super.setHp(super.getHp() - user.spSkill1());

				break;
			case 3:
				super.setHp(super.getHp() - user.spSkill2());
				System.out.println("��� �巡���� ����� ������ hp��" + user.spskill2dmg + "��ŭ �����մϴ�");
				break;

			case 4:
				super.setHp(super.getHp() - user.spSkill3());
				System.out.println("��� �巡���� ����� ������ hp��" + user.spskill3dmg + "��ŭ �����մϴ�");

				break;
			case 5:
				super.setHp(super.getHp() - user.finaleSkill());
				System.out.println("��� �巡���� ����� ������ hp��" + user.fskilldmg + "��ŭ �����մϴ�");

				break;

			}

			if (super.getHp() <= 0) {
				System.out.println("��� �巡�ﰡ �������ϴ� ");
				User.coin += 500;
				break;

			}
			System.out.println("��� �巡���� ���� ü�� :" + hp);

			peck(user);

		}
		if (super.getHp() <= 0) {
			return;

		}
		if (user.getHp() <= 0) {

			return;
		}

	}

}