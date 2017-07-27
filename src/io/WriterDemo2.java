package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WriterDemo2{
	public static void main(String[] args) {
		File f = new File("C:\\java\\workspace\\Demo\\src\\io\\test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copy2();

		System.out.println(kare(1992));
		kare();
	}

	public static void copy() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/io/copy.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileReader f;
		try {
			f = new FileReader("src/io/test.txt");
			int i = 0;
			while ((i = f.read()) != -1) {
				fw.write(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void copy2() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			// 写入的目标文件
			fw = new FileWriter("src/io/WriterDemo2.java");
			// 读取的目标文件
			fr = new FileReader("src/io/WriterDemo.java");
			// 创建每次读取的大小是1024字节
			char[] chr = new char[1024];
			int len = 0;

			// 此处不仅实现了对chr的赋值，指针还改变了方向
			while ((len = fr.read(chr)) != -1) {

				fw.write(chr, 0, len);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static int kare(int a) {
		Calendar c = Calendar.getInstance();
		c.set(a, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH);

	}

	public static void kare() {
		SimpleDateFormat si = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒  E");

		Calendar c = Calendar.getInstance();
	
		c.add(Calendar.YEAR, -1);
		Date d=c.getTime();
		System.out.println(si.format(c.getTime()));
	}

}
