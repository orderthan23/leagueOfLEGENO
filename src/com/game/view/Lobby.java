package com.game.view;

import java.util.Scanner;

import com.game.model.vo.Ash;
import com.game.model.vo.Atrox;
import com.game.model.vo.Baron;
import com.game.model.vo.Dragon;
import com.game.model.vo.Ghost;
import com.game.model.vo.Riven;
import com.game.model.vo.Rux;
import com.game.model.vo.StoneCrab;
import com.game.model.vo.User;
import com.game.model.vo.Wolf;
import com.game.model.vo.Xerath;

public class Lobby {

	private Scanner scan = new Scanner(System.in);

	public void MainLobby() {

		User user = new Ash();
		System.out.println("ȯ�� �մϴ� ���׿��극�Գ뿡 ���Ű��� ȯ���մϴ�");
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.next();

		while (true) {
			System.out.println("ȯ���մϴ� " + name + "�� ���� �κ��Դϴ� � �޴��� �����Ͻðھ��?");
			System.out.println("===========================================");
			System.out.println("1.���� �̱� ");
			System.out.println("2.���� ���̵�  ");
			System.out.println("3.������ ���� ");
			System.out.println("9.����  ");
			System.out.print("��ȣ�� �Է����ּ���!:");
			int select = scan.nextInt();

			switch (select) {

			case 1:
				user = gacha();
				break;
			case 2:

				raid(user);
				break;

			case 3:
				System.out.println(name + "���� ���� �����Դϴ�");
				System.out.println(user);
				System.out.print("��ų������ ���ðڽ��ϱ�?������ 1. ��� ������ ��ų ������ ������ 2  �ƴϸ� ������");
				int choice = scan.nextInt();
				if (choice == 1) {
					user.skillInfo();
				}else if(choice==2) {
					User[] showSkill =new User[] {new Riven(),new Rux(),new Atrox(),new Xerath(),new Ash()};
					
					for(User a : showSkill) {
						
						if(a instanceof Riven) {
							System.out.println("������ ��ų����");
							a.skillInfo();
							System.out.println("\n");
							
						}
						if(a instanceof Rux) {
							System.out.println("������ ��ų����");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Atrox) {
							System.out.println("��Ʈ�Ͻ��� ��ų����");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Xerath) {
							System.out.println("������ ��ų����");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Ash) {
							System.out.println("�ֽ��� ��ų����");
							a.skillInfo();
							System.out.println("");
						}
					}
					
						
					
					
				}
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ� ������ �˰ڽ��ϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
				break;

			}
		}
	}

	public User gacha() {

		User[] mych = new User[] { new Riven(), new Rux(), new Atrox(), new Xerath(), new Ash() };

		User user = new Ash();

		while (true) {
			int num = (int) (Math.random() * 5);
			System.out.println("���� �̱⿡ �����̽��ϴ�");
			System.out.println("=============================");
			System.out.println("1.���� �̱� ���� (-50����)");
			System.out.println("2.Ȯ�� ���� ����");
			System.out.println("9.���� �޴��� �̵�");
			System.out.println("���� ���μ� :" + User.coin);
			System.out.println("=============================");
			System.out.println("��ȣ�� �Է��� �ּ���");
			int select = scan.nextInt();

			switch (select) {

			case 1:
				if (User.coin >= 50) {
					User.coin -= 50;

					String card = "ī�尡 ���ۺ��� ������";
					for (String a : card.split(" ")) {
						try {
							Thread.sleep(1000L);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println(a);
					}

					System.out.println(mych[num].getName() + "�� �����̽��ϴ� ");
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (mych[num] instanceof Riven) {
						String talk = "�η��� �� �ٽ� ���̸� ��\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("���ݷ� :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());

						System.out.println("��ų1 :" + ((Riven) mych[num]).getSpSkill1Name());
						System.out.println("��ų2 :" + ((Riven) mych[num]).getSpSkill2Name());
						System.out.println("��ų 3 :" + ((Riven) mych[num]).getSpSkill3Name());
						System.out.println("�ñر� :" + ((Riven) mych[num]).getfSkillName());
						System.out.println("�нú� :" + ((Riven) mych[num]).getPassiveName());
						System.out.println("��� :" + ((Riven) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Rux) {
						String talk = "�������� �����̱��� ��ȯ�� �� !\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("���ݷ� :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());

						System.out.println("��ų1 :" + ((Rux) mych[num]).getSpSkill1Name());
						System.out.println("��ų2 :" + ((Rux) mych[num]).getSpSkill2Name());
						System.out.println("��ų3 :" + ((Rux) mych[num]).getSpSkill3Name());
						System.out.println("�ñر� :" + ((Rux) mych[num]).getfSkillName());
						System.out.println("�нú� :" + ((Rux) mych[num]).getPassiveName());
						System.out.println("��� :" + ((Rux) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Atrox) {
						String talk = "����� ������ �͸� �ְ� ���ָ�!\n ";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}

						System.out.println("���ݷ� :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("��ų1 :" + ((Atrox) mych[num]).getSpSkill1Name());
						System.out.println("��ų2 :" + ((Atrox) mych[num]).getSpSkill2Name());
						System.out.println("��ų3 :" + ((Atrox) mych[num]).getSpSkill3Name());
						System.out.println("�ñر� :" + ((Atrox) mych[num]).getfSkillName());
						System.out.println("�нú� :" + ((Atrox) mych[num]).getPassiveName());
						System.out.println("��� :" + ((Atrox) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Xerath) {
						String talk = "�� ������� ���ϴ� ��....?\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("���ݷ� :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("��ų1 :" + mych[num].getSpSkill1Name());
						System.out.println("��ų2 :" + mych[num].getSpSkill2Name());
						System.out.println("��ų3 :" + mych[num].getSpSkill3Name());
						System.out.println("�ñر� :" + mych[num].getfSkillName());
						System.out.println("�нú� :" + mych[num].getPassiveName());
						System.out.println("��� ;" + mych[num].getGrade());

					}

					else if (mych[num] instanceof Ash) {
						String talk = "ȭ�� �ѹ߷� ������ ������ ����!\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("���ݷ� :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("��ų1 :" + mych[num].getSpSkill1Name());
						System.out.println("��ų2 :" + mych[num].getSpSkill2Name());
						System.out.println("��ų3 :" + mych[num].getSpSkill3Name());
						System.out.println("�ñر� :" + mych[num].getfSkillName());
						System.out.println("�нú� :" + mych[num].getPassiveName());
						System.out.println("��� ;" + mych[num].getGrade());

					}
					user = mych[num];
					User.count++;
					try {
						Thread.sleep(4000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("������ �����մϴ� ���̵带 �ؼ� ���������");
				}
				break;

			case 2:
				showGachaInfo();
				break;

			case 9:
				System.out.println("�̱� ���� ");
				System.out.println("�õ��� Ƚ �� : " + User.count);

				return user;

			default:
				System.out.println("�߸��� �Է��Դϴ�");
				break;

			}

		}

	}

	public void raid(User user) {

		while (true) {

			System.out.println("���̵� ��忡 �����ϼ̽��ϴ� ");
			System.out.println("1.��θӸ� ����(ü�� 10000)");
			System.out.println("2.���� ��(ü�� 50000)");
			System.out.println("3.���� (ü�� 100000)");
			System.out.println("4.��ε巡�� (ü�� 150000)");
			System.out.println("5.���� ���� (ü�� 200000)");
			System.out.println("9.�����޴��� �̵�");
			System.out.println("===========================");
			System.out.println("������ ������ ��ȣ�� �Է��� �ּ��� ");

			int select = scan.nextInt();

			switch (select) {

			case 1:
				startWolf(user);
				break;
			case 2:
				startCrab(user);
				break;
			case 3:
				startGhost(user);
				break;
			case 4:
				startDragon(user);
				break;
			case 5:
				startBaron(user);
				break;

			case 9:
				System.out.println("���� ȭ������ �̵��մϴ� ");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ� �ٽ� �Է����ּ���");
				break;
			}

		}

	}

	public void showGachaInfo() {

		while (true) {

			System.out.println("��ȭ�� �ǰ� ������ ���� Ȯ���� �������� Ȯ���� ���� �մϴ�");
			System.out.println("�̱� Ȯ���� ������ �����ϴ� ");
			System.out.println("���δ� 20%");

			System.out.print("����ȭ�� ���� ���Ƿ��� 9���� �����ּ��� :");
			int select = scan.nextInt();

			if (select == 9) {
				return;
			}

		}

	}

	public void startWolf(User user) {

		// ���� ����
		Wolf c1 = new Wolf();
		c1.cry();
		c1.lossHp(user);

	}

	public void startGhost(User user) {

		// ������ ����
		Ghost c1 = new Ghost();
		c1.cry();
		c1.lossHp(user);

	}

	public void startDragon(User user) {

		// ������ ����
		Dragon c1 = new Dragon();
		c1.cry();
		c1.lossHp(user);

	}

	public void startBaron(User user) {

		// ������ ����
		Baron c1 = new Baron();
		c1.cry();
		c1.lossHp(user);

	}

	public void startCrab(User user) {

		// ������ ����
		StoneCrab c1 = new StoneCrab();
		c1.cry();
		c1.lossHp(user);

	}

}
