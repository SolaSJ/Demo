package com.rf.zzc.demo1;

import java.util.Arrays;

public class Mergesort {
	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;
		// 把较小的数先移到新数组中
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		// 把左边剩余的数移入数组
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		// 把右边边剩余的数移入数组
		while (j <= high) {
			temp[k++] = a[j++];
		}
		// 把新数组中的数覆盖a数组
		for (int k2 = 0; k2 < temp.length; k2++) {
			a[k2 + low] = temp[k2];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// 左边
			mergeSort(a, low, mid);
			// 右边
			mergeSort(a, mid + 1, high);
			// 左右归并合集
			merge(a, low, mid, high);
			System.out.println(Arrays.toString(a));

		}

	}

	public static void main(String[] args) {
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		mergeSort(a, 0, a.length - 1);
		System.out.println("排序结果：" + Arrays.toString(a));
		add();
		add2();
		nine91(9, 9);
	}

	// 求100到200的所有素数的和。
	public static void add() {
		int num = 0;
		int k = 0;
		for (int i = 100; i < 201; i++) {
			for (int j = 2; j < i; j++) {// for(int
											// j=2;j<=Math.sqrt(i);j++)这里用的开平方确定需要判定的最大值。非常巧妙，不仅减少了运算量还充分利用了质数的特点。
				if (i % j == 0) {// 取余为0的数都不是素数
					k = 0;
					break;
				}
				k = i;
			}
			if (k != 0)
				System.out.print(k + "  ");
			num += k;
		}
		System.out.println(num);
	}

	// 求1-10000的完数
	public static void add2() {
		for (int i = 2; i <= 10000; i++) {
			int num = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (j != 1) {
					if (i % j == 0) {
						num += (j + (i / j));
					}
				} else {
					if (i % j == 0) {
						num += j;
					}
				}
			}
			if (num == i) {
				System.out.println(i);
			}
		}

	}

	public static void nine9(int a) {
		if (a == 1) {
			System.out.println("1x1=1");
		} else {
			nine9(a - 1);
			for (int i = 1; i <= a; i++) {
				System.out.print(i + "x" + a + "=" + i * a + "\t");
			}
			System.out.println();
		}
	}

	public static void nine91(int a, int b) {
		if (a == 1 && b == 1) {
			System.out.print("1x1=1" + "\t");
		} else if (b == 0) {
			b = a - 1;
		
			nine91(a - 1, b);
			System.out.println();
		}

		else {

			nine91(a, b - 1);
			System.out.print(b + "x" + a + "=" + a * b + "\t");

		}
	}
}
