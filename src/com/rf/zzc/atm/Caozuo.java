package com.rf.zzc.atm;

import java.util.Scanner;

public class Caozuo {

	public static User load() {
		int j = 3;
		while (true) {
			System.out.println("~~~~~欢迎来到周氏银行~~~~~~~");
			System.out.println("请输入名字");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();
			System.out.println("请输入密码");
			Scanner scan1 = new Scanner(System.in);
			String password = scan.next();
			User[] use = { new User("zhangsan", "123", 1000.0), new User("lisi", "123", 1000.0),
					new User("wangwu", "123", 1000.0) };
			for (int i = 0; i < use.length; i++) {
				if (name.equals(use[i].getName()) && password.equals(use[i].getPassword())) {
					System.out.println("登录成功！！！");
					return use[i];
				}

			}
			j--;
			if (j == 0) {
				System.out.println("卡已被锁，请到柜台解锁");
				System.exit(0);
			}
			System.out.println("登录失败，您还有" + j + "次机会");

		}

	}

	public static void qukuan(User use1) {
		System.out.println("请输入取款金额");
		Scanner scan = new Scanner(System.in);
		double qu = scan.nextDouble();
		if (qu <= use1.getMoney()) {
			System.out.println("取款成功");
			use1.setMoney(use1.getMoney() - qu);
		} else {
			System.out.println("余额不足");
		}

	}

	public static void cunkuan(User use1) {
		System.out.println("请输入存款金额");
		Scanner scan = new Scanner(System.in);
		double cun = scan.nextDouble();
		if (cun > 0) {
			System.out.println("存款成功");
			use1.setMoney(use1.getMoney() + cun);

		}

	}

	public static void xiugai(User use1) {
		while (true) {
			System.out.println("请输入新密码");
			Scanner scan = new Scanner(System.in);
			String xiu = scan.next();
			System.out.println("请再次输入新密码");
			Scanner scan1 = new Scanner(System.in);
			String gai = scan.next();
			if (xiu.equals(gai)) {
				System.out.println("修改密码成功");
				break;
			} else {
				System.out.println("修改密码失败");
			}

		}

	}

	public static void chaxun(User use1) {
		System.out.println("您的余额是" + use1.getMoney());
	}

	public static void tuichu() {
		System.out.println("周氏银行欢迎您再来，再见!");
		System.exit(0);

	}

	public static void menue(User use1) {

		while (true) {
			System.out.println("请选择 1.取款 2.存款 3.修改密码 4.退出 5.查询");
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
				System.out.println("输入错误，请重新输入！");

			}

		}

	}

}
