package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Date;

public class MostImportent {
	public static void main(String[] args) throws IOException {
		MostImportent n = new MostImportent();
		// n.case1();
		// n.cass2();
		// n.cass3();
		// n.cass4();
		// n.cass5();
		// n.cass6();
		// n.cass7();
		// n.cass8();
		// n.cass9();
		// n.cass10();
		File f = new File("C:/Users/admin/Desktop/a");
		// f.mkdirs();
		// n.diguidelete(f);
		n.diguishow(f);
		n.exhausted();
	}

	public void case1() {
		File file = new File("C:/java/workspace/Demo/src/io/copy.txt");
		Date d = new Date(file.lastModified());
		System.out.println(d);

	}

	public void case2() {
		FileInputStream fis;
		FileOutputStream fos;
		try {

			byte[] b = new byte[1];

			fis = new FileInputStream("src/io/copy.txt");
			// fos=new FileOutputStream("src/io/hao.txt");
			int num = 0;
			try {
				while ((num = fis.read(b)) != -1) {
					// fos.write(b);
					System.out.print(new String(b, 0, num));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\r");

	}

	public void case3() {
		FileInputStream fis;

		try {

			fis = new FileInputStream("src/io/copy.txt");

			int num;
			try {
				while ((num = fis.read()) != -1) {

					// fos.write(b);
					System.out.print((char) num);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//字节流：复制一个文件到另一个文件（一个个的读）
	public void case4() {
		FileInputStream fis;
		FileOutputStream fos;
		try {

			fis = new FileInputStream("C:/Users/admin/Desktop/xiamu.jpg");
			fos = new FileOutputStream("C:/Users/admin/Desktop/xiamu1.jpg");
			int num;
			try {
				while ((num = fis.read()) != -1) {

					fos.write(num);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void case5() {
		FileInputStream fis;
		FileOutputStream fos;
		MybufferedInputstream m;
		try {

			fis = new FileInputStream("C:/Users/admin/Desktop/赵雷 - 成都.mp3");
			m = new MybufferedInputstream(fis);
			fos = new FileOutputStream("C:/Users/admin/Desktop/赵雷 - 成都2.mp3");

			int num;
			try {
				while ((num = m.myread()) != -1) {

					fos.write(num);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//LineNumberReader相当于Bufferedreader，也是装饰类，也有readline方法，返回的是String字符串。
	public void case6() throws IOException {
		FileReader fr;
		LineNumberReader lnr;
		try {
			fr = new FileReader("src/io/copy.txt");
			lnr = new LineNumberReader(fr);
			String str = null;
			while ((str = (lnr.readLine())) != null) {
			// 这里用等于null是防止返回来的值为null时会造成空指针异常
				System.out.println(lnr.getLineNumber() + "   " + str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//字节流。用byte数组的方式，提高效率，num返回的是被赋值的数组的元素的个数。
	public void case7() throws IOException {
		FileInputStream in;
		FileOutputStream out;
		try {

			in = new FileInputStream("C:/Users/admin/Desktop/赵雷 - 成都.mp3");
			out = new FileOutputStream("C:/Users/admin/Desktop/赵雷 2- 成都.mp3");
			byte[] b = new byte[1024];
			int num = 0;
			while ((num = in.read(b)) != -1) {
				out.write(b, 0, num);//这种Write方式可以保证完美复制。
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public void case8() throws IOException {
		InputStream in = System.in;//键盘输出，字节流读取
		int i = in.read();
		System.out.println((char) i);//控制台输出一个字节
	}

	public void case9() throws IOException {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}

		
	// 在控制台输出错误提示 。
	public void case10() {
		try {
			FileOutputStream fos = new FileOutputStream("");
		} catch (FileNotFoundException e) {

			// e.printStackTrace(); e自己調用自己的方法的在控制台输出错误提示。
			System.out.println(e);// 打印的是错误名称，例如（java.io.FileNotFoundException）

			StackTraceElement p[] = e.getStackTrace();
			// e.getStackTrace()得到是上面类型的数组。用一个这样的数组取接收。
			for (StackTraceElement p1 : p) {
				System.err.println("\tat " + p1);
			}
		}

	}

	// 递归删除文件目录（文件里有文件时不能直接删除）
	public void diguidelete(File f) {
		if (f.isDirectory()) {
			File[] f1 = f.listFiles();
			if (f1.length == 0) {

				f.delete();
			} else {
				for (int i = 0; i < f1.length; i++) {
					diguidelete(f1[i]);
				}

				if (f.length() == 0) {

					f.delete();
				}
			}

		} else {
			f.delete();
		}

	}

	// 输出一个目录下的子目录名及其文件名
	public void diguishow(File f) {

		if (!f.isDirectory()) {
			System.out.println(f);
		} else {
			System.out.println(f);
			File[] file = f.listFiles();
			for (int i = 0; i < file.length; i++) {
				diguishow(file[i]);
			}
		}
	}

	// 穷举试密码。
	public void exhausted() {
		int a = 2688;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						if ((i * 1000 + j * 100 + k * 10 + l) == a) {
							System.out.println("共循环了" + (i * 1000 + j * 100 + k * 10 + l + 1) + "次得到密码");
							return;
							// 要加上初值为0000时的次数
						}
					}
				}
			}
		}
	}

}
