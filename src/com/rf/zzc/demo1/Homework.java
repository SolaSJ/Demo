package com.rf.zzc.demo1;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		printA(6);
	}

	public static void Btob() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char abc = str.charAt(0);

		if ((int) abc >= 97 && (int) abc <= 122) {
			abc = (char) (abc - 32);

		} else if ((int) abc >= 65 && (int) abc <= 90) {
			abc = (char) (abc + 32);
		}

		System.out.println(abc);
	}

	public static int harfsearch(int a, int[] arr) {
		int min, mid, max;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		if (min > max) {
			return -1;
		}
		if (arr[0] > a || arr[arr.length - 1] < a) {
			return -1;
		}
		while (arr[mid] != a) {
			if (a > arr[mid]) {
				min = mid + 1;
			} else {
				max = mid - 1;

			}

			mid = (min + max) / 2;
		}
		return mid;

	}

	public static int harfsearch1(int a, int[] arr) {
		int min, mid, max;
		min = 0;
		max = arr.length - 1;
		mid = (min + max) / 2;
		while (min <= max) {
			if (arr[mid] < a) {
				min = mid + 1;
			} else if (arr[mid] > a) {
				max = mid - 1;

			} else {
				return mid;
			}
			mid = (min + max) / 2;

		}
		return -1;
	}

	public static void printA(int a) {
		for (int i = 1; i <= a; i++) {
			if (i == 1) {
				for (int j = 0; j < a - i; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			} else {
				for (int j = 0; j < a - i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				// ×ø±êÖØ¶¨
				for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
					if (i == a / 2 + a % 2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("*");
			}
		}
	}
}
