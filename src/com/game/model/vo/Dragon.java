package com.game.model.vo;

import java.util.Scanner;

public class Dragon extends Character5G {

	private Scanner scan = new Scanner(System.in);

	public Dragon() {
		super("장로 드래곤", 600, 150000, 0, "장로 드래곤", "장로 드래곤의 콧물", "", "", "치킨킥", "치킨 펀치");

	}

	public void cry() {

		System.out.println("장로 드래곤가 위용을 뿜으며 등장합니다");

	}

	public void peck(User user) {
		System.out.println("장로 드래곤가 할퀴었습니다.");
		user.hp -= super.getAttack();
		System.out.println(super.getAttack() + "의 데미지를 달았습니다");
		System.out.println("나의 남은 체력 :" + user.hp);
		System.out.println("나의 남은 mp :" + user.mp);
	}

	public void lossHp(User user) {

		user.passive();

		while (true) {
			if (user.getHp() <= 0) {
				System.out.println("죽었습니다 ");
				return;
			}

			System.out.println("1." + User.basicSkill);
			System.out.println("2." + user.spSkill1Name);
			System.out.println("3." + user.spSkill2Name);
			System.out.println("4." + user.spSkill3Name);
			System.out.println("5." + user.fSkillName);
			System.out.println("사용할 공격을 입력하시오 ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("장로 드래곤이 비명을 지르며 hp가" + user.attack + "만큼 감소합니다");
				super.setHp(super.getHp() - user.attack);

				break;
			case 2:
				System.out.println("장로 드래곤이 비명을 지르며 hp가" + user.spskill1dmg + "만큼 감소합니다");
				super.setHp(super.getHp() - user.spSkill1());

				break;
			case 3:
				super.setHp(super.getHp() - user.spSkill2());
				System.out.println("장로 드래곤이 비명을 지르며 hp가" + user.spskill2dmg + "만큼 감소합니다");
				break;

			case 4:
				super.setHp(super.getHp() - user.spSkill3());
				System.out.println("장로 드래곤이 비명을 지르며 hp가" + user.spskill3dmg + "만큼 감소합니다");

				break;
			case 5:
				super.setHp(super.getHp() - user.finaleSkill());
				System.out.println("장로 드래곤이 비명을 지르며 hp가" + user.fskilldmg + "만큼 감소합니다");

				break;

			}

			if (super.getHp() <= 0) {
				System.out.println("장로 드래곤가 쓰러집니다 ");
				User.coin += 500;
				break;

			}
			System.out.println("장로 드래곤의 남은 체력 :" + hp);

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
