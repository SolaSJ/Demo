package atmpkmonster;

public class Operation {
	Atm[] a;
	Manster[] mm;

	public static void main(String[] args) {
		
		new Operation().mingzi();
		
	}
	public void mingzi() {
		Atm a0 = new Atm("a1", 100, 11);
		Atm a1 = new Atm("a2", 100, 11);
		Atm a2 = new Atm("a3", 100, 11);
		Atm a3 = new Atm("a4", 100, 11);
		Atm a4 = new Atm("a5", 100, 11);

		a = new Atm[] { a1, a2, a3, a4, a0 };
		Manster m0 = new Manster("m1", 100, 9);
		Manster m1 = new Manster("m2", 100, 9);
		Manster m2 = new Manster("m3", 100, 9);
		Manster m3 = new Manster("m4", 100, 9);
		Manster m4 = new Manster("m5", 100, 9);
		mm = new Manster[] { m1, m2, m3, m4, m0 };
		kaigan(xuanAtm(a), xuanManster(mm));
	}


	public static Atm xuanAtm(Atm[] a) {
		while (true) {
			int i = (int) (Math.random() * 5);
			if (a[i].getHp() > 0) {

				System.out.println("������" + (i + 1) + "�ϳ�");

				return a[i];
			}
			boolean isAllDie = true;
			for (int j = 0; j < 5; j++) {
				if (a[j].getHp() > 0) {
					isAllDie = false;
					break;
				}
			}
			if (isAllDie) {
				System.out.println("�����������ˣ�С����ʤ��");
				System.exit(0);
			}

		}
	}

	public static Manster xuanManster(Manster[] m) {
		while (true) {
			int i = (int) (Math.random() * 5);
			if (m[i].getHp() >0) {
				System.out.println("С����" + (i + 1) + "�ϳ�");
				return m[i];

			}
			boolean isAllDie = true;
			for (int j = 0; j < 5; j++) {
				if (m[j].getHp() > 0) {
					isAllDie = false;
					break;
				}
			}
			if (isAllDie) {
				System.out.println("С���������ˣ�������ʤ��");
				System.exit(0);
			}

		}
	}

	public Person kaigan(Atm a, Manster m) {
		while (true) {
			int j = (int) (Math.random() * 2);
			if (j == 0) {
				m.setHp(m.getHp() - 11);
				if (m.getHp() < 0) {
					m.setHp(0);
				}
				System.out.println("����������С���ޣ�С���޻�ʣ" + m.getHp() + "��Ѫ");

			} else if (j == 1) {
				a.setHp(a.getHp() - 9);
				if(a.getHp()<0){
					a.setHp(0);
				}
				System.out.println("С���޴��˰���������������ʣ"+a.getHp()+"��Ѫ");

			}
			if (m.getHp() == 0) {
				System.out.println("���С������������һ��");

				kaigan(a, xuanManster(mm));
				return a;

			} else if (a.getHp() == 0) {
				System.out.println("�����������������һ��");

				kaigan(xuanAtm(this.a), m);
				return m;

			}

		}

	}
}
