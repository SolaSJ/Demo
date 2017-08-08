package com.rf.zzc.demo1;

import java.util.Arrays;

public class Mergesort {
	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;
		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = a[j++];
		}
		// ���������е�������a����
		for (int k2 = 0; k2 < temp.length; k2++) {
			a[k2 + low] = temp[k2];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// ���
			mergeSort(a, low, mid);
			// �ұ�
			mergeSort(a, mid + 1, high);
			// ���ҹ鲢�ϼ�
			merge(a, low, mid, high);
			System.out.println(Arrays.toString(a));

		}

	}

	public static void main(String[] args) {
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		mergeSort(a, 0, a.length - 1);
		System.out.println("��������" + Arrays.toString(a));
		add();
		add2();
	}

	// ��100��200�����������ĺ͡�
	public static void add() {
		int num = 0;
		int k = 0;
		for (int i = 100; i < 201; i++) {
			for (int j = 2; j < i; j++) {// for(int
											// j=2;j<=Math.sqrt(i);j++)�����õĿ�ƽ��ȷ����Ҫ�ж������ֵ���ǳ��������������������������������������ص㡣
				if (i % j == 0) {// ȡ��Ϊ0��������������
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

	
	//��1-10000������
	public static void add2() {
		for (int i = 2; i <= 10000; i++) {
			int num = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (j != 1) {
					if (i % j == 0) {
						num+= (j + (i / j));
					}
				}else{
					if (i % j == 0) {
						num+= j ;
					}
				}
			}
			if (num == i) {
				System.out.println(i);
			}
		}

	}
}
