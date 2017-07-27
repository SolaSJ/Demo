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
				for (int n = 2 * a - 2 * i - 1; n > 0; n--) {// 重定坐标
					System.out.print("*");
				}
				System.out.println("*");
			} else {
				System.out.print("*");
				for (int k = 2 * a - 2 * i - 1; k > 0; k--) {// 重定坐标
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

	// 递归方法計算阶乘（利用三目运算符）（也可以利用if来判断非负数）
	public static int factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}

	public static void show(int... a) {
		// 会自动默认的把所有数字生成名为a的数组（当传入的参数为int[]...a时结果一样）
		System.out.println(Arrays.toString(a));

	}

	
	//获取任意年的二月有多少天？
	public static void Date(int a) {

		Calendar c = Calendar.getInstance();
		c.set(a, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
