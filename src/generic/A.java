package generic;

import java.util.Arrays;
import java.util.Calendar;

public class A {
	public static void main(String[] args) {
		A a = new A();
		a.print(5);
		System.out.println(add());
		System.out.println(factorial(5));
		show(1, 2, 3, 4, 6, 1);
		Date(2012);
	}

	public void print(int a) {
		for (int i = a; i > 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			if (i == a) {
				System.out.println("*");
			} else if (i == ((a + a % 2) / 2)) {
				System.out.print("*");
				for (int n = 2 * a - 2 * i - 1; n > 0; n--) {// �ض�����
					System.out.print("*");
				}
				System.out.println("*");
			} else {
				System.out.print("*");
				for (int k = 2 * a - 2 * i - 1; k > 0; k--) {// �ض�����
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}

	}

	public static double add() {
		double sum = 0;
		double up = 2;
		double down = 1;
		for (int i = 0; i < 20; i++) {
			double compare = up / down;
			sum += compare;
			double x = (up + down);
			double y = up;
			up = x;
			down = y;

		}
		return sum;
	}

	// �ݹ鷽��Ӌ��׳ˣ�������Ŀ���������Ҳ��������if���жϷǸ�����
	public static int factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}

	public static void show(int... a) {
		// ���Զ�Ĭ�ϵİ���������������Ϊa�����飨������Ĳ���Ϊint[]...aʱ���һ����
		System.out.println(Arrays.toString(a));

	}

	
	//��ȡ������Ķ����ж����죿
	public static void Date(int a) {

		Calendar c = Calendar.getInstance();
		c.set(a, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
