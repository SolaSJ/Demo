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

	// 查看目录的子目录
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

	// 常见的一些比较int和Integer
	public void compare() {
		Integer i1 = 121;
		Integer i2 = 121;
		System.out.println(i1 == i2);// 当值在-128~127之间时，默认为同一对象，因为这些值比较常用。哈西克值相等。
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);// 当值不在-128~127之间时，系统会默认建立不同对象，哈西克值不等。
		int i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);// Integer和int比时会自动拆箱。

	}



}
