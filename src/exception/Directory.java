package exception;

import java.io.File;

public class Directory {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\admin\\Desktop\\a");
		int b = f.getParentFile().getPath().length();
		Directory d = new Directory();
		d.recursive(f, b);
		d.compare();
	}

	boolean flag = true;
	short s = 1;

	// �鿴Ŀ¼����Ŀ¼
	public void recursive(File f, int b) {

		if (!f.isDirectory()) {
			int a = f.getParentFile().getPath().length();
			for (int i = 0; i < a - b; i++) {
				System.out.print("-");
			}
			System.out.println(f.getName());

		} else {
			int a = f.getParentFile().getPath().length();
			for (int i = 0; i < a - b; i++) {
				System.out.print("-");
			}
			System.out.println(f.getName());
			File[] file = f.listFiles();
			for (File f1 : file) {
				recursive(f1, b);
			}
		}
	}

	// ������һЩ�Ƚ�
	public void compare() {
		Integer i1 = 121;
		Integer i2 = 121;
		System.out.println(i1 == i2);// ��ֵ��-128~127֮��ʱ��Ĭ��Ϊͬһ������Ϊ��Щֵ�Ƚϳ��á�������ֵ��ȡ�
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);// ��ֵ����-128~127֮��ʱ��ϵͳ��Ĭ�Ͻ�����ͬ���󣬹�����ֵ���ȡ�
		int i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);// Integer��int��ʱ���Զ����䡣

	}
}
