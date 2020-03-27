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
		System.out.println("환영 합니다 리그오브레게노에 오신것을 환영합니다");
		System.out.println("이름을 입력해주세요");
		String name = scan.next();

		while (true) {
			System.out.println("환영합니다 " + name + "님 메인 로비입니다 어떤 메뉴에 입장하시겠어요?");
			System.out.println("===========================================");
			System.out.println("1.영웅 뽑기 ");
			System.out.println("2.보스 레이드  ");
			System.out.println("3.내영웅 보기 ");
			System.out.println("9.종료  ");
			System.out.print("번호를 입력해주세요!:");
			int select = scan.nextInt();

			switch (select) {

			case 1:
				user = gacha();
				break;
			case 2:

				raid(user);
				break;

			case 3:
				System.out.println(name + "님의 영웅 정보입니다");
				System.out.println(user);
				System.out.print("스킬정보를 보시겠습니까?맞으면 1. 모든 영웅의 스킬 정보를 보려면 2  아니면 나머지");
				int choice = scan.nextInt();
				if (choice == 1) {
					user.skillInfo();
				}else if(choice==2) {
					User[] showSkill =new User[] {new Riven(),new Rux(),new Atrox(),new Xerath(),new Ash()};
					
					for(User a : showSkill) {
						
						if(a instanceof Riven) {
							System.out.println("리븐의 스킬정보");
							a.skillInfo();
							System.out.println("\n");
							
						}
						if(a instanceof Rux) {
							System.out.println("럭스의 스킬정보");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Atrox) {
							System.out.println("아트록스의 스킬정보");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Xerath) {
							System.out.println("제라스의 스킬정보");
							a.skillInfo();
							System.out.println("\n");
						}
						if(a instanceof Ash) {
							System.out.println("애쉬의 스킬정보");
							a.skillInfo();
							System.out.println("");
						}
					}
					
						
					
					
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다 다음에 뵙겠습니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
				break;

			}
		}
	}

	public User gacha() {

		User[] mych = new User[] { new Riven(), new Rux(), new Atrox(), new Xerath(), new Ash() };

		User user = new Ash();

		while (true) {
			int num = (int) (Math.random() * 5);
			System.out.println("영웅 뽑기에 들어오셨습니다");
			System.out.println("=============================");
			System.out.println("1.영웅 뽑기 시작 (-50코인)");
			System.out.println("2.확률 정보 공개");
			System.out.println("9.이전 메뉴로 이동");
			System.out.println("남은 코인수 :" + User.coin);
			System.out.println("=============================");
			System.out.println("번호를 입력해 주세요");
			int select = scan.nextInt();

			switch (select) {

			case 1:
				if (User.coin >= 50) {
					User.coin -= 50;

					String card = "카드가 빙글빙글 도는중";
					for (String a : card.split(" ")) {
						try {
							Thread.sleep(1000L);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println(a);
					}

					System.out.println(mych[num].getName() + "을 뽑으셨습니다 ");
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					if (mych[num] instanceof Riven) {
						String talk = "부러진 건 다시 붙이면 되\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("공격력 :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());

						System.out.println("스킬1 :" + ((Riven) mych[num]).getSpSkill1Name());
						System.out.println("스킬2 :" + ((Riven) mych[num]).getSpSkill2Name());
						System.out.println("스킬 3 :" + ((Riven) mych[num]).getSpSkill3Name());
						System.out.println("궁극기 :" + ((Riven) mych[num]).getfSkillName());
						System.out.println("패시브 :" + ((Riven) mych[num]).getPassiveName());
						System.out.println("등급 :" + ((Riven) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Rux) {
						String talk = "전략적인 선택이군요 소환사 님 !\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("공격력 :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());

						System.out.println("스킬1 :" + ((Rux) mych[num]).getSpSkill1Name());
						System.out.println("스킬2 :" + ((Rux) mych[num]).getSpSkill2Name());
						System.out.println("스킬3 :" + ((Rux) mych[num]).getSpSkill3Name());
						System.out.println("궁극기 :" + ((Rux) mych[num]).getfSkillName());
						System.out.println("패시브 :" + ((Rux) mych[num]).getPassiveName());
						System.out.println("등급 :" + ((Rux) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Atrox) {
						String talk = "고요한 종말에 귀를 멀게 해주마!\n ";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}

						System.out.println("공격력 :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("스킬1 :" + ((Atrox) mych[num]).getSpSkill1Name());
						System.out.println("스킬2 :" + ((Atrox) mych[num]).getSpSkill2Name());
						System.out.println("스킬3 :" + ((Atrox) mych[num]).getSpSkill3Name());
						System.out.println("궁극기 :" + ((Atrox) mych[num]).getfSkillName());
						System.out.println("패시브 :" + ((Atrox) mych[num]).getPassiveName());
						System.out.println("등급 :" + ((Atrox) mych[num]).getGrade());

					}

					else if (mych[num] instanceof Xerath) {
						String talk = "날 기억하지 못하는 가....?\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("공격력 :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("스킬1 :" + mych[num].getSpSkill1Name());
						System.out.println("스킬2 :" + mych[num].getSpSkill2Name());
						System.out.println("스킬3 :" + mych[num].getSpSkill3Name());
						System.out.println("궁극기 :" + mych[num].getfSkillName());
						System.out.println("패시브 :" + mych[num].getPassiveName());
						System.out.println("등급 ;" + mych[num].getGrade());

					}

					else if (mych[num] instanceof Ash) {
						String talk = "화살 한발로 세상을 평정해 주지!\n";

						for (int i = 0; i < talk.length(); i++) {
							try {
								Thread.sleep(100L);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.print(talk.charAt(i));
						}
						System.out.println("공격력 :" + mych[num].getAttack());
						System.out.println("HP :" + mych[num].getHp());
						System.out.println("MP :" + mych[num].getMp());
						System.out.println("스킬1 :" + mych[num].getSpSkill1Name());
						System.out.println("스킬2 :" + mych[num].getSpSkill2Name());
						System.out.println("스킬3 :" + mych[num].getSpSkill3Name());
						System.out.println("궁극기 :" + mych[num].getfSkillName());
						System.out.println("패시브 :" + mych[num].getPassiveName());
						System.out.println("등급 ;" + mych[num].getGrade());

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
					System.out.println("코인이 부족합니다 레이드를 해서 벌어오세요");
				}
				break;

			case 2:
				showGachaInfo();
				break;

			case 9:
				System.out.println("뽑기 종료 ");
				System.out.println("시도한 횟 수 : " + User.count);

				return user;

			default:
				System.out.println("잘못된 입력입니다");
				break;

			}

		}

	}

	public void raid(User user) {

		while (true) {

			System.out.println("레이드 모드에 입장하셨습니다 ");
			System.out.println("1.우두머리 늑대(체력 10000)");
			System.out.println("2.바위 게(체력 50000)");
			System.out.println("3.유령 (체력 100000)");
			System.out.println("4.장로드래곤 (체력 150000)");
			System.out.println("5.내셔 남작 (체력 200000)");
			System.out.println("9.이전메뉴로 이동");
			System.out.println("===========================");
			System.out.println("잡으실 몬스터의 번호를 입력해 주세요 ");

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
				System.out.println("이전 화면으로 이동합니다 ");
				return;
			default:
				System.out.println("잘못 입력했습니다 다시 입력해주세요");
				break;
			}

		}

	}

	public void showGachaInfo() {

		while (true) {

			System.out.println("문화부 권고 사항의 따라 확률형 컨텐츠의 확률을 공개 합니다");
			System.out.println("뽑기 확률은 다음과 같습니다 ");
			System.out.println("전부다 20%");

			System.out.print("이전화면 으로 가실려면 9번을 눌러주세요 :");
			int select = scan.nextInt();

			if (select == 9) {
				return;
			}

		}

	}

	public void startWolf(User user) {

		// 늑대 등장
		Wolf c1 = new Wolf();
		c1.cry();
		c1.lossHp(user);

	}

	public void startGhost(User user) {

		// 바위게 등장
		Ghost c1 = new Ghost();
		c1.cry();
		c1.lossHp(user);

	}

	public void startDragon(User user) {

		// 바위게 등장
		Dragon c1 = new Dragon();
		c1.cry();
		c1.lossHp(user);

	}

	public void startBaron(User user) {

		// 바위게 등장
		Baron c1 = new Baron();
		c1.cry();
		c1.lossHp(user);

	}

	public void startCrab(User user) {

		// 바위게 등장
		StoneCrab c1 = new StoneCrab();
		c1.cry();
		c1.lossHp(user);

	}

}
