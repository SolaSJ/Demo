package com.rf.zzc.atm;

import java.util.Scanner;

public class Caozuo {

	public static User load() {
		int j = 3;
		while (true) {
			System.out.println("~~~~~��ӭ������������~~~~~~~");
			System.out.println("����������");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			System.out.println("����������");
			Scanner scan1 = new Scanner(System.in);
			String password = scan.next();
			User[] use = { new User("zhangsan", "123", 1000.0), new User("lisi", "123", 1000.0),
					new User("wangwu", "123", 1000.0) };
			for (int i = 0; i < use.length; i++) {
				if (name.equals(use[i].getName()) && password.equals(use[i].getPassword())) {
					System.out.println("��¼�ɹ�������");
					return use[i];
				}

			}
			j--;
			if (j == 0) {
				System.out.println("���ѱ������뵽��̨����");
				System.exit(0);
			}
			System.out.println("��¼ʧ�ܣ�������" + j + "�λ���");

		}

	}

	public static void qukuan(User use1) {
		System.out.println("������ȡ����");
		Scanner scan = new Scanner(System.in);
		double qu = scan.nextDouble();
		if (qu <= use1.getMoney()) {
			System.out.println("ȡ��ɹ�");
			use1.setMoney(use1.getMoney() - qu);
		} else {
			System.out.println("����");
		}

	}

	public static void cunkuan(User use1) {
		System.out.println("����������");
		Scanner scan = new Scanner(System.in);
		double cun = scan.nextDouble();
		if (cun > 0) {
			System.out.println("���ɹ�");
			use1.setMoney(use1.getMoney() + cun);

		}

	}

	public static void xiugai(User use1) {
		while (true) {
			System.out.println("������������");
			Scanner scan = new Scanner(System.in);
			String xiu = scan.next();
			System.out.println("���ٴ�����������");
			Scanner scan1 = new Scanner(System.in);
			String gai = scan.next();
			if (xiu.equals(gai)) {
				System.out.println("�޸�����ɹ�");
				break;
			} else {
				System.out.println("�޸�����ʧ��");
			}

		}

	}

	public static void chaxun(User use1) {
		System.out.println("���������" + use1.getMoney());
	}

	public static void tuichu() {
		System.out.println("�������л�ӭ���������ټ�!");
		System.exit(0);

	}

	public static void menue(User use1) {

		while (true) {
			System.out.println("��ѡ�� 1.ȡ�� 2.��� 3.�޸����� 4.�˳� 5.��ѯ");
			Scanner scan = new Scanner(System.in);
			String str = scan.next();
			String i = str;
			switch (i) {
			case "1":
				qukuan(use1);
				break;
			case "2":
				cunkuan(use1);
				break;
			case "3":
				xiugai(use1);
				break;
			case "4":
				tuichu();
				break;
			case "5":
				chaxun(use1);
				break;
			default:
				System.out.println("����������������룡");

			}

		}

	}

}
